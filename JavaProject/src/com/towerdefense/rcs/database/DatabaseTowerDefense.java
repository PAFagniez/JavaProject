package com.towerdefense.rcs.database;

public class DatabaseTowerDefense {

	private static String url = "jdbc:mysql://localhost/TowerDefense";
	private static String root = "root";
	private static String password = "";
	private java.sql.Connection connection;
	private java.sql.Statement statement;

	public DatabaseTowerDefense() {
		// TODO - implement DatabaseTowerDefense.DatabaseTowerDefense
		throw new UnsupportedOperationException();
	}

	public boolean open() {
		// TODO - implement DatabaseTowerDefense.open
		throw new UnsupportedOperationException();
	}

	public void close() {
		// TODO - implement DatabaseTowerDefense.close
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	private java.sql.ResultSet executeQuery(String query) {
		// TODO - implement DatabaseTowerDefense.executeQuery
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	private int executeUpdate(String query) {
		// TODO - implement DatabaseTowerDefense.executeUpdate
		throw new UnsupportedOperationException();
	}

	private int getLastId() {
		// TODO - implement DatabaseTowerDefense.getLastId
		throw new UnsupportedOperationException();
	}

}