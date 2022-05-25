package com.ty.visitor.contorller;

import com.ty.visitor.dao.VisitorDao;
import com.ty.visitor.dto.Visitor;

public class TestSaveVisitor {

	public static void main(String[] args) {

		Visitor visitor = new Visitor();
		
		visitor.setId(1);
		visitor.setName("Sheela");
		visitor.setEmail("Sheela@mail.ocm");
		visitor.setPhone("78945621");
		visitor.setAge(25);
		visitor.setGender("female");
		
		int res = VisitorDao.saveVisitor(visitor) ;
		
		if( res != 0) System.out.println("data inserted");
		else System.out.println("no data inserted");

	}

}
