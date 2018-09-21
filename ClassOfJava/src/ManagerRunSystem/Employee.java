package ManagerRunSystem;
/*•	Employee雇员类，定义了自己的属性，雇员薪水salary和雇员入职时间hireDay。
 * 该类继承了People类，并在类方法体中
 * 定义了三个成员方法（getInfo（）、getSalary（）和getHireDay（）），用来获取雇员属性。*/
public class Employee extends People {


	private int salary ; 
	private String hireDay ; 
	public Employee(String name, int age, int salary, String hireDay) {
		super(name, age);
		this.salary = salary;
		this.hireDay = hireDay;
	}
	public void getInfo() {
		System.out.println("name:" + super.getName());
		System.out.println("I'm Employee:" );
		System.out.println("Age:" + super.getAge());
		System.out.println("Salary:" + this.salary );
		System.out.println("Hireday:" + this.hireDay);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary( int salary ) {
		this.salary = salary ;
	}
	
	public String getHireDay() {
		return hireDay;
	}

	
}
