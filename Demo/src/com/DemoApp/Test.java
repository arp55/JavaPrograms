package com.DemoApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		MobileDTO mobile= new MobileDTO();
		mobile.setCompany("Samsung");
		mobile.setColor("Golden");
		mobile.setModel("S10plus");
		BatteryDTO battery= new BatteryDTO();
		battery.setCompany("Apple");
		battery.setMah("4100mah");
		battery.setMobile(mobile);
		mobile.setBattery(battery);
		System.out.println("Hibernate code starts");
		Session session= HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		session.save(mobile);
		try {
			tx.commit();
			System.out.println("data saved");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		} catch (HibernateException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
	}
}
