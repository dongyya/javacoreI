package interfaceAndinnerClass.interfaces;

import java.util.Arrays;

public class SortTest {
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("jack",6500);
		emps[1] = new Employee("halen",5500);
		emps[2] = new Employee("zen",4500);
		Arrays.sort(emps);
		for(Employee e:emps){
			System.out.println("name:" + e.getName() + ",salary:" + e.getSalary());
		}
	}

}
