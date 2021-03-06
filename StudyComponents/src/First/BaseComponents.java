package First;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseComponents implements ActionListener {
	Frame f ; 			//窗口对象
	Label result ;		//面板对象
	Button b1 , b2 ; 	//按钮对象
	public static void main(String[] args) {
	
		new BaseComponents( );
	}
	public BaseComponents() {			//构造函数
		f = new Frame("基本组件");
		result = new Label("检查哪个按钮被单击");
		
		b1 = new Button("Left");
		b1.setSize(50 , 100);  //设置大小
		b1.setActionCommand("b1");//搁置按钮的ActionCommand
		b1.addActionListener( this);//事件监听器
		
		b2 = new Button("Right");
		b2.setSize(50 , 100);  //设置大小
		b2.setActionCommand("b2");//搁置按钮的ActionCommand
		b2.addActionListener( this);//事件监听器
		
		f.add(result, BorderLayout.NORTH);
		f.add(b1 , BorderLayout.WEST);
		f.add(b2 , BorderLayout.EAST);
		f.pack();
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand() ;
		if(cmd.equals("b1")) {
			b2.setEnabled(!b2.isEnabled());
			result.setText("左边按钮被单击");
		}else {
			b1.setEnabled(!b1.isEnabled());
			result.setText("右边按钮被单击");
		}
	}
}

