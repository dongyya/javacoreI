package interfaceAndinnerClass.interfaces;

import java.util.Date;

public class CloneTest {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("LiHua", new Date(), 4000);
		Employee e2;
		try{
			e2 = e1.clone();
			System.out.println("name:" + e1.getName() + ",hireDate:" + e1.getHireDate() + 
					",salary:" + e1.getSalary() );
			e2.setSalary(5000);
			System.out.println("name:" + e2.getName() + ",hireDate:" + e2.getHireDate() + 
					",salary:" + e2.getSalary() );
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
	}

}
