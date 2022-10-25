package com.suppliers;
import java.sql.*;
import java.util.*;
public class SuppliersDAOImpl 
	implements SuppliersDAO{
		
		private String driver="com.mysql.cj.jdbc.Driver",
				username="root",
				password="",
				dburl="jdbc:mysql://localhost:3306/saaddb";
		private Connection con=null;
		
		void createConnection() {
			try {
				Class.forName(driver);
				con=DriverManager.getConnection(dburl,
						username, password);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

		@Override
		public String create(Suppliers s) {
			// TODO Auto-generated method stub
			String result="";
			try {
				createConnection(); //calling method of same class
				//con object initialized
				String insertquery="insert into suppliers values(?, ?, ?,?, ?, ?,?, ?, ?,?) ";
				PreparedStatement ps=con.prepareStatement(insertquery);
				ps.setInt(1, s.getSupplierid());
				ps.setString(2,  s.getCname());
				ps.setString(3, s.getAdd());
				ps.setString(4, s.getPcode());
				ps.setString(5, s.getCity());
				ps.setString(6, s.getCp());
				ps.setString(7, s.getCpm());
				ps.setString(8, s.getCc());
				ps.setString(9, s.getRdate());
				ps.setString(10, "active");
				
				
				int res=ps.executeUpdate();
				result=res+" record/s inserted in suppliers table";
				ps.close();
				con.close();
				
			}
			catch(Exception ex) {
				result=ex.toString();
			}
			return result;

		}

		@Override
		public String fetchAll() {
			// TODO Auto-generated method stub
			String result="";
			try {
				createConnection();
				//con object field initialized
				String query="select * from suppliers "
						+ "where currentstatus='active'";
				
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(query);
				
				while(rs.next()==true) {
					for(int i=1;i<=10;i++) {
						result+=rs.getString(i)+"\t ";
					}
					result+="\n";
				}
				rs.close();
				stmt.close();
			}
			catch(Exception e ) {
				result=e.toString();
			}
			return result;
		}

		@Override
		public Suppliers input() {
			// TODO Auto-generated method stub
			Suppliers supply=new Suppliers ();

			Scanner sc=new Scanner(System.in);
			
			System.out.print("enter supplier company name: ");
			supply.setCname(sc.nextLine());
			System.out.print("enter  company's  address: ");
			supply.setAdd(sc.nextLine());
			System.out.print("enter company's  address pincode: ");
			supply.setPcode(sc.nextLine());
			System.out.print("enter company's  city: ");
			supply.setCity(sc.nextLine());
			System.out.print("enter  company's  contact person: ");
			supply.setCp(sc.nextLine());
			System.out.print("enter contact person mobile no.: ");
			supply.setCpm(sc.nextLine());
			System.out.print("enter company's  contact info: ");
			supply.setCc(sc.nextLine());
			System.out.print("enter company's  registration date: ");
			supply.setRdate(sc.nextLine());
			System.out.print("enter supplier company's ID: ");
			supply.setSupplierid(sc.nextInt());
		

			return(supply);
		}

		@Override
		public String update(Suppliers suppliers) {
			// TODO Auto-generated method stub
			String result="";
			try {
				
				String query="update suppliers set "+
				" companyname=?, "+
						" address=?, "
						+ "pincode=?, "
						+ "city=?, "
						+ "contactpersonname=?, "
						+ "contactpersonmobileno=?,"
						+ "companycontactinfo=?,"
						+ "regdate=?,"
						+ "currentstatus=?"+
				" where supplierid=?";
				
				createConnection();
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, suppliers.getCname());
				ps.setString(2, suppliers.getAdd());
				ps.setString(3, suppliers.getPcode());
				ps.setString(4, suppliers.getCity());
				ps.setString(5, suppliers.getCp());
				ps.setString(6, suppliers.getCpm());
				ps.setString(7, suppliers.getCc());
				ps.setString(8, suppliers.getRdate());
				ps.setString(9, "active");
				ps.setInt(10, suppliers.getSupplierid());
				int res=ps.executeUpdate();
				result=res+" record/s updated in the supplier table";
				
			}
			catch(Exception e) {
				result=e.toString();
			}
			return result;
		
		}

		@Override
		public String delete(int Supplierid) {
			// TODO Auto-generated method stub
			String result="";
			try {
				String query="update suppliers set "
						+ "currentstatus='close' where supplierid=? ";
				
				createConnection();
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, Supplierid);
				int res=ps.executeUpdate();
				result=res+" record/s deleted from suppliers table";
				ps.close();
				con.close();
			}
			catch(Exception e) {
				result=e.toString();
			}
			return result;
			
		}

		@Override
		public String rejoin(int Supplierid) {
			// TODO Auto-generated method stub
			String result="";
			try {
				createConnection();
				String query="update suppliers set "
						+ "currentstatus='active' "
						+ "where supplierid=?";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1, Supplierid);
				int res=ps.executeUpdate();
				result=res+" records rejoined successfully";
				ps.close();
				con.close();
			}
			catch(Exception e){
				result=e.toString();
			}
			
			return result;
		}
		
}
