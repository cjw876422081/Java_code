package Calculator;
/*失败的代码 ，*/
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.*;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends WindowAdapter {
	Panel p1 = new Panel() ;
	Panel p2 = new Panel() ;
	Panel p3 = new Panel() ;
	TextField txt ; 
	private Button[] b = new Button[17] ;
	private String ss[] = {"7","8", "9","+","4","5", "6","-","1","2", "3",
			"*","清空","0" ,"=","/","关闭"};
	static double a ;
	static String s , str ;
	public static void main(String[] args) {
		(new Calculator()).frame();
	}
	private void frame() {
		Frame fm = new Frame("计算器");
		//为按钮数组赋值
		for(int i = 0 ; i <= 16 ; i ++ ) {
			b[i] = new Button(ss[i]);
		}
		//添加按钮到面板
		for(int i = 0 ; i <=15 ; i ++) {
			p2.add(b[i]);
		}
		b[16].setBackground(Color.yellow);//设置按钮的背景色为黄色
		//创建和设置文本框
		txt = new TextField();
		txt.setEditable(false);
		for(int i = 0 ; i <= 16 ; i ++ ) {
			b[i].addActionListener(new buttonlistener());//为按钮添加监听器
		}
		b[16].addActionListener(new close());//添加关闭监听器
		fm.addWindowListener(this);
		fm.setBackground(Color.red );//窗口背景为红色
		p1.setLayout(new BorderLayout());//p1布局管理器
		p1.add(txt, "North");//添加文本框到北面
		p2.setLayout(new GridLayout(4, 4));//p2布局管理器
		p3.setLayout(new BorderLayout());//p3布局管理器
		p3.add(b[16]);				//添加按钮到面板
		//添加面板到窗口上
		fm.add( p1 , "North");
		fm.add( p2 , "Center");
		fm.add( p3 , "South");
		fm.pack();
		fm.setVisible(true);
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	class buttonlistener implements ActionListener{
		public void actionPerformed(ActionEvent e ) {
			Button btn = (Button) e.getSource();
			if(btn.getLabel() == "=") {
				jisuan();
				str = String.valueOf(a);
				txt.setText(str);
				s ="";
			}else if(btn.getLabel() == "+") {
				jisuan();
				txt.setText("");
				s = "+";
			}else if(btn.getLabel() == "-") {
				jisuan();
				txt.setText("");
				s = "-";
			}else if(btn.getLabel() == "*") {
				jisuan();
				txt.setText("");
				s = "*";
			}else if (btn.getLabel() == "/") {
				jisuan();
				txt.setText("");
				s = "/";
			}else {
				txt.setText(str);

			}
		}

		public void jisuan() {
			// TODO Auto-generated method stub
			if( s == "+") {
				a += Double.parseDouble(txt.getText());
			}else if( s == "-") {
				a -= Double.parseDouble(txt.getText());
			}else if( s == "*") {
				a *= Double.parseDouble(txt.getText());
			}else if( s == "/") {
				a -= Double.parseDouble(txt.getText());
			}
			else {
				a = Double.parseDouble(txt.getText());
			}
		}
	}
}
class close implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
