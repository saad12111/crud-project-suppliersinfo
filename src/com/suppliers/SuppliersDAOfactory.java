package com.suppliers;

public class SuppliersDAOfactory {
	public static SuppliersDAO createSuppliersDAO() {
		return(new SuppliersDAOImpl()); //upward casting rule
		//returning reference of child class
	}
}
