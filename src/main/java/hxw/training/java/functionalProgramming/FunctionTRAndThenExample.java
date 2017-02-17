package hxw.training.java.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTRAndThenExample {
	public static void main(String args[]) {
		Function<Employee, String> funcEmpToString = (Employee e) -> {
			return e.getName();
		};
		List<Employee> employeeList = Arrays.asList(
				new Employee("Tom Jones", 45), 
				new Employee("Harry Major", 25),
				new Employee("Ethan Hardy", 65), 
				new Employee("Nancy Smith", 15),
				new Employee("Deborah Sprightly", 29));
		Function<String, String> initialFunction = (String s) -> s.substring(0, 1);
		
		Function<String, String> initialFunction2 = (String s) -> s.substring(0, 2);
		
		Function<Employee, String> initialFunction3 = (Employee e) -> "" + e.getAge();
		
		
		
		List<String> empNameListInitials = convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction2));
		
		empNameListInitials.forEach(str -> {
			System.out.print(" " + str);
		});
		
		
		
		
		System.out.println(" ");
		empNameListInitials = convertEmpListToNamesList(employeeList,
				funcEmpToString.andThen(initialFunction2).andThen(initialFunction));
		empNameListInitials.forEach(str -> {
			System.out.print(" " + str);
		});
		
		

		
		empNameListInitials.forEach(str -> {
			System.out.print(" " + str);
		});
		
	}

	public static List<String> convertEmpListToNamesList(List<Employee> employeeList,
			Function<Employee, String> funcEmpToString) {
		List<String> empNameList = new ArrayList<String>();
		for (Employee emp : employeeList) {
			empNameList.add(funcEmpToString.apply(emp));
		}
		return empNameList;
	}

}
