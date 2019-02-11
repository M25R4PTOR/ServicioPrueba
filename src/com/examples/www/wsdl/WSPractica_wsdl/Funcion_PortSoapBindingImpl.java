/**
 * Funcion_PortSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.examples.www.wsdl.WSPractica_wsdl;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Funcion_PortSoapBindingImpl implements com.examples.www.wsdl.WSPractica_wsdl.Funcion_PortType {
	public java.lang.String funcion1(java.lang.String param1) throws java.rmi.RemoteException {
		return Base64.getEncoder().encodeToString(param1.getBytes());
	}

	public java.lang.String funcion2(java.lang.String param1) throws java.rmi.RemoteException {
		Document doc = convertStringToDocument(param1);
		NodeList nombres = doc.getElementsByTagName("nombre");
		String lista = "";

		for (int i = 0; i < nombres.getLength(); i++) {
			lista += nombres.item(i).getTextContent();
		}

		return lista;
	}

	private static Document convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public java.lang.String funcion3(java.lang.String param1) throws java.rmi.RemoteException {
		String res = "";
		int aux = Integer.parseInt(param1);
		LocalDateTime x = LocalDateTime.now();
		switch (aux) {
		case 1:
			res = x.getDayOfMonth() + "/" + x.getMonthValue() + "/" + x.getYear();
			break;
		case 2:
			res = x.getHour() + ":" + x.getMinute() + ":" + x.getSecond();
			break;
		case 3:
			res = x.getDayOfMonth() + "/" + x.getMonthValue() + "/" + x.getYear() + " - " + x.getHour() + ":"
					+ x.getMinute() + ":" + x.getSecond();
			break;
		case 4:
			res = "Año actual: " + x.getYear();
			break;
		case 5:
			res = x.getDayOfWeek().name();
			break;
		default:
			break;
		}
		return res;
	}

	public java.lang.String funcion4(java.lang.String param1) {
		Connection con = conectarBaseDatos();
		int titular = -1;
		try {
			titular = traerDatos(con, param1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return String.valueOf(titular);
	}

	public static void main(String[] args) throws Exception {
		Connection con = conectarBaseDatos();
		int titular = traerDatos(con, "0");
		System.out.println(titular);
	}

	public static Connection conectarBaseDatos() {
		try {
			try {
				// Se registra el Driver de MySQL
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error al registrar el driver de MySQL: " + ex);
			}
			Connection connection = null;

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coches", "root", "");

			boolean valid = connection.isValid(5000);
			System.out.println(valid ? "TEST OK" : "TEST FAIL");

			return connection;

		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
			return null;
		}
	}

	public static int traerDatos(Connection conn, String idTitular) throws SQLException {
		String sql = "Select * FROM titular WHERE idTitular =" + idTitular;

		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery(sql);

		int id = -1;
		String nombre, ap1, ap2;
		while (result.next()) {
			id = result.getInt(1);
			nombre = result.getString(2);
			ap1 = result.getString(3);
			ap2 = result.getString(4);
		}

		return id;
	}

	private static Document convertStringToXMLDocument(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
