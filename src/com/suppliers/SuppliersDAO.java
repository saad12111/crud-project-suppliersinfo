package com.suppliers;

public interface SuppliersDAO {
	String create(Suppliers suppliers);
	String fetchAll();
	Suppliers input();
	String update(Suppliers suppliers);
	String delete(int Supplierid);
	String rejoin(int Supplierid);
}
