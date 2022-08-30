package org.sample;

import java.util.LinkedList;
import java.util.List;

public class Details {
	public static void main(String[] args) {
		Data emp1=new Data();
		emp1.setEmpId(2051);
		emp1.setEmpName("siva");
		emp1.setEmpCompany("CTS");
		emp1.setEmpSalary(97.56667f);
		
		Data emp2=new Data();
		emp2.setEmpId(5010);
		emp2.setEmpName("kani");
		emp2.setEmpCompany("TCS");
		emp2.setEmpSalary(87.56443f);
		
		List<Data> li=new LinkedList<Data>();
		li.add(emp1);
		li.add(emp2);
		for (int i = 0; i <li.size(); i++) {
			System.out.println("emp id:"+li.get(i).getEmpId());
			System.out.println("emp name:"+li.get(i).getEmpName());
			System.out.println("emp company:"+li.get(i).getEmpCompany());
			System.out.println("emp salary:"+li.get(i).getEmpSalary());
			
		}
		
		
	}

}
