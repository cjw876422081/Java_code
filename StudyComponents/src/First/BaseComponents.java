package First;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseComponents implements ActionListener {
	Frame f ; 			//���ڶ���
	Label result ;		//������
	Button b1 , b2 ; 	//��ť����
	public static void main(String[] args) {
	
		new BaseComponents( );
	}
	public BaseComponents() {			//���캯��
		f = new Frame("�������");
		result = new Label("����ĸ���ť������");
		
		b1 = new Button("Left");
		b1.setSize(50 , 100);  //���ô�С
		b1.setActionCommand("b1");//���ð�ť��ActionCommand
		b1.addActionListener( this);//�¼�������
		
		b2 = new Button("Right");
		b2.setSize(50 , 100);  //���ô�С
		b2.setActionCommand("b2");//���ð�ť��ActionCommand
		b2.addActionListener( this);//�¼�������
		
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
			result.setText("��߰�ť������");
		}else {
			b1.setEnabled(!b1.isEnabled());
			result.setText("�ұ߰�ť������");
		}
	}
}
