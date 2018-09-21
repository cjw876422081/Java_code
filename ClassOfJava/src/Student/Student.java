package Student;

import sun.jvm.hotspot.SAGetopt;

public class Student {


	private int sNo ;  
	private String sName ; 
	private String sSex ; 
	private int sAge;
	private double sJava;
	public Student(int sNo, String sName, String sSex, int sAge, double sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public Student(String sName, String sSex, int sAge, double sJava) {
		
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public Student( String sSex, int sAge, double sJava) {

		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public Student( int sAge, double sJava) {
		super();
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public Student(double sJava) {
		this.sJava = sJava;
	}
	public Student() {

	}
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public double getsJava() {
		return sJava;
	}
	public void setsJava(double sJava) {
		this.sJava = sJava;
	}
	
	public void print() {
		System.out.println("学号" + this.sNo);
		System.out.println("姓名" + this.sName);
		System.out.println("性别" + this.sSex);
		System.out.println("年龄" + this.sAge);
		System.out.println("Java成绩" + this.sJava);
	}

}
