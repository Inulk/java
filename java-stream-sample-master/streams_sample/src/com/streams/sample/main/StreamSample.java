/**
 * 
 */
package com.streams.sample.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author inbandara
 *
 */
public class StreamSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		
		Employee kasun = new Employee(1, "Kasun", 25000, "Comlombo 03", "Engineer","male");
		employees.add(kasun);
		Employee saman = new Employee(2, "Saman", 27000, "Colembo 03", "Manager","male");
		employees.add(saman);
		Employee amila = new Employee(3, "Amila", 24000, "Colombo 05", "Executive", "female");
		employees.add(amila);
		Employee kusum = new Employee(4, "Kusum", 25000, "Colombo 04", "Engineer", "female");
		employees.add(kusum);
		Employee kamal =  new Employee(5, "Kamal", 29000, "Kelaniya", "Engineer", "male");
		employees.add(kamal);
		
		// Using stream
		// Filter using stream
		List<Employee> engineers = employees.stream().filter(s -> s.getRole().equals("Engineer")).collect(Collectors.toList());
		
		// Looping list using Stream
		System.out.println("List of Engineers : ");
		engineers.stream().forEach(s -> System.out.println(s.getName()));
		
		// Counting with Stream
		System.out.println("Number of Managers :"+ employees.stream().filter(s -> s.getRole().equals("Manager")).count());
		
		// Limit with stream
		employees.stream().limit(2).forEach(s -> System.out.println(s.getName()));
		
		// Statistics with stream
		IntSummaryStatistics ages = employees.stream().mapToInt(s->s.getSalary()).summaryStatistics();
		System.out.println("max salary :"+ ages.getMax());
		System.out.println("min salary :"+ ages.getMin());
		System.out.println("average salary :"+ ages.getAverage());
		System.out.println("total salary expense for month :"+ ages.getSum());
	
		
		
	}

}
