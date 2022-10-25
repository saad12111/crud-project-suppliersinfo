package com.suppliers;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		SuppliersDAO SuppliersDAO=SuppliersDAOfactory.createSuppliersDAO();
		
		
		while(true) {
			
			try {
				
				int choice;
				System.out.println("1. create");
				System.out.println("2. retreive");
				System.out.println("3. update");
				
				System.out.println("4. delete");
				System.out.println("5. rejoin");
				System.out.println("6. exit program***");
				
				System.out.print("enter your choice? 1/2/3/4/5/6: ");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:
					//input in empid name salary
					Suppliers supplier=SuppliersDAO.input();
					String result=SuppliersDAO.create(supplier);
					System.out.println(result);
					
					break;
				case 2:
					result=SuppliersDAO.fetchAll();
					System.out.println(result);
					break;
				case 3:
					System.out.println("enter values of existing record only***");
					supplier=SuppliersDAO.input();
					result=SuppliersDAO.update(supplier);
					System.out.println(result);
					break;
				case 4:
					System.out.print("enter existing supplier id to delete: ");
					int supplierid=sc.nextInt();
					result=SuppliersDAO.delete(supplierid);
					System.out.println(result);
					break;
				case 5:
					System.out.print("enter supplier id to rejoin :");
					supplierid=sc.nextInt();
					result=SuppliersDAO.rejoin(supplierid);
					System.out.println(result);
					break;
				 case 6:
					System.out.println("thanks for using my software***,have a nice day!!");
					System.exit(0);
					//break;
				}
				
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
