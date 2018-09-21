package ManagerRunSystem;
/*•	Manager经理类，定义了自己的属性，奖金bonus和年假holidays。
 * 该类继承了Employee雇员类，要求使用方法重写重新定义getInfo（）、getSalary（）和
addSalay（）方法。
*/
public class Manager extends Employee {

	private int bonus ; 
	private int holidays ;
	public Manager(String name, int age, int salary, String hireDay, int bonus, int holidays) {
		super(name, age, salary, hireDay);
		this.bonus = bonus;
		this.holidays = holidays;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getHolidays() {
		return holidays;
	}
	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}
	public void getInfo() {
		System.out.println("name:" + super.getName());
		System.out.println("I'm Manager" );
		System.out.println("Age:" + super.getAge());
		System.out.println("Salary:" + super.getSalary() );
		System.out.println("Hireday:" + super.getHireDay());
		System.out.println("bonus:" + this.bonus );
		System.out.println("holidays:" + this.holidays);
	}
	public void addSalary(int money){
		System.out.println("加了工资：" + money );
		super.setSalary(money + super.getSalary());
		
	}
	

}
