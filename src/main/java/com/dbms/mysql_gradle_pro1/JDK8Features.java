package com.dbms.mysql_gradle_pro1;

import java.util.*;

public class JDK8Features {
    public static void main(String[] args) {
        
		// 1,2,3,4,5,6,7>1.8

		/*
		 * String name[] = { "Sagar", "Ramesh", "Ganesh" };
		 * 
		 * System.out.println("Old legacy approach");
		 * 
		 * for (int i = 0; i < name.length; i++) { if
		 * (!name[i].equalsIgnoreCase("Ramesh")) { System.out.println(name[i]); } }
		 * 
		 * // Collection
		 * 
		 * List<String> names = new LinkedList<>(); names.add("Sagar");
		 * names.add("Ramesh"); names.add("Ganesh");
		 * 
		 * // System.out.println(names);
		 * 
		 * System.out.
		 * println("New approach.........................................................."
		 * );
		 * 
		 * names.stream().forEach(System.out::println);
		 */

		// stream api
		List<Employee> employeeList = DatabaseConnection.getEmployee();
		// System.out.println(employeeList);

		// legacy

		/*
		 * for (Employee e : employeeList) { if(e.getDepartment().equals("IT")) {
		 * System.out.println(e); } }
		 */

		// System.out.println("........................................");
		//filter
		//employeeList.stream().filter(s -> s.getSalary() > 50000 && s.getEmpName().startsWith("R"))
			//	.forEach(System.out::println);
		
		//employeeList.stream().map(t->t.getDepartment())
		//.forEach(System.out::println);
		
		
		System.out.println(".............................................");
		
		List<String> s1=Arrays.asList("A","B","C","A","D","B");
		
		/*
		 * s1.stream().distinct() .forEach(System.out::println);
		 */
		
		//System.out.println(".............................................");
		
		List<Integer> nums=Arrays.asList(2,4,1,7,3);
		Collections.sort(nums); // sort->asc
		Collections.reverse(nums); // desc
		//System.out.println(nums);
		
		// JDK 1.8 Lambda function
		
		//Collections.sort(employeeList,(o1,o2)->Double.compare(o2.getSalary(), o1.getSalary()));
		
		Collections.sort(employeeList,(o1,o2)->o1.getEmpName().compareTo(o2.getEmpName()));
		
		
		employeeList.stream().forEach(System.out::println);
		
		
		
    }
}
