package cit360.mold.hibernateexp;

import java.util.*;

public class HibernateRunExp {

	public static void main(String[] args) {
		
		DAOTest dt = DAOTest.getInstance();
		
		List<Customer> c = dt.getCustomers();
		for (Customer i : c) {
			System.out.println(i);
		}
		
		System.out.println(dt.getCustomer(1001));

	}

}
