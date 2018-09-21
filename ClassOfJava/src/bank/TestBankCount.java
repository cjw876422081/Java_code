package bank;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

public class TestBankCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCount card  = new BankCount("123abc", "123", "456", 2000);
		card.save_money(2000);
		System.out.println(card.check_balance() );
		card.draw_money(500);
		System.out.println(card.check_balance() );
		
		BankCount  card2 = new BankCount();
		card2.setName("123");
		card2.setCard("1234");
		card2.setPassword("456");
		card2.setBalance(1234564);
		System.out.println("当前的账户" + card.getCard());
		System.out.println("当前的账户密码" + card.getPassword());
		System.out.println("当前的账户余额" + card.getBalance());
		
		
		
		 
	}

}
