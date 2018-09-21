package Second;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestCheckbox implements ItemListener{
	Frame f;
	Checkbox cb[] = new Checkbox[3];
	Checkbox cbg[] = new Checkbox[3];
	CheckboxGroup obg1 = new CheckboxGroup() ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestCheckbox();
	}
	public TestCheckbox() {
		f = new Frame("Checkbox�齨��ʹ��");		//	Ϊ���ڸ�ֵ
		f.setLayout(new GridLayout(2, 3));		// ���ڲ���
		cb[0] = new Checkbox("��ѡ�� 1");
		cb[1] = new Checkbox("��ѡ�� 2" , true ) ;
		cb[2] = new Checkbox() ;
		cb[2].setLabel("��ѡ�� 3");
		
		cbg[0] = new Checkbox("��ѡ��ť 1") ;
		cbg[0].setCheckboxGroup(obg1);
		cbg[1] = new Checkbox("��ѡ��ť 2" , true ) ;
		cbg[1].setCheckboxGroup(obg1);
		cbg[2] = new Checkbox("��ѡ��ť 3 " , obg1 , false ) ;
		//Ϊcb����ע���¼�
		for(int i = 0 ; i < 3 ; i ++ ) {
			cb[i].addItemListener(this);
			f.add(cb[i]);
		}
		//Ϊcbgע���¼�
		for(int i = 0 ; i < 3 ; i ++ ) {
			cbg[i].addItemListener(this);
			f.add(cbg[i]);
		}
		f.pack();
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) { //�¼�������
		Checkbox ch = (Checkbox) e.getSource() ; 
		String Label = ch.getLabel() ;
		if(e.getStateChange() == ItemEvent.SELECTED) {
			f.setTitle(Label + "��ѡ��");
		}else {
			f.setTitle(Label + "ȡ��ѡ��");
		}
	}
}
