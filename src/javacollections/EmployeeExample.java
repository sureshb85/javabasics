package javacollections;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	String empTitle;

	public Employee(int empId, String empName, String empTitle) {
		this.empId = empId;
		this.empName = empName;
		this.empTitle = empTitle;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", Name=" + empName + ", Title=" + empTitle + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if (empId > o.empId) {
			return 1;
		} else if (empId < o.empId) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class EmployeeExample {
	public static void main(String[] args) {
		Set<Employee> employeeSet = new TreeSet<Employee>();
		Employee emp1 = new Employee(1001, "John", "Software Developer");
		Employee emp2 = new Employee(2005, "Peter", "Software Tester");
		Employee emp3 = new Employee(1201, "Tom", "Business Analyst");
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		// Traversing Employee
		for (Employee emp : employeeSet) {
			System.out.println(emp);
		}
	}
}
