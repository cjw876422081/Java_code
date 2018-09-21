package bank;

public class BankCount {


	private String card ; 
	private String name ; 
	private String password ;
	private int balance ;
	public BankCount(String card, String name, String password , int balance) {
		super();
		this.card = card;
		this.name = name;
		this.password = password;
		this.balance = balance ; 
	}
	public BankCount() {
		card = "" ; 
		name = "" ; 
		password = "" ;
		balance = 0  ; 
 	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void save_money( int money) {
		this.balance += money ; 
	}
	public void draw_money(int money) {
		if(this.balance - money > 0 ) { 
			System.out.println("Óà¶î²»×ã£¡");
		}else {
			this.balance -= money ; 
		}
	}
	public int check_balance( ) {
		return this.balance ; 
	}
	
}
