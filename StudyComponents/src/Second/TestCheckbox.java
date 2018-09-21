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
		f = new Frame("Checkbox组建的使用");		//	为窗口赋值
		f.setLayout(new GridLayout(2, 3));		// 窗口布局
		cb[0] = new Checkbox("复选框 1");
		cb[1] = new Checkbox("复选框 2" , true ) ;
		cb[2] = new Checkbox() ;
		cb[2].setLabel("复选框 3");
		
		cbg[0] = new Checkbox("单选按钮 1") ;
		cbg[0].setCheckboxGroup(obg1);
		cbg[1] = new Checkbox("单选按钮 2" , true ) ;
		cbg[1].setCheckboxGroup(obg1);
		cbg[2] = new Checkbox("单选按钮 3 " , obg1 , false ) ;
		//为cb数组注册事件
		for(int i = 0 ; i < 3 ; i ++ ) {
			cb[i].addItemListener(this);
			f.add(cb[i]);
		}
		//为cbg注册事件
		for(int i = 0 ; i < 3 ; i ++ ) {
			cbg[i].addItemListener(this);
			f.add(cbg[i]);
		}
		f.pack();
		f.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e) { //事件监听器
		Checkbox ch = (Checkbox) e.getSource() ; 
		String Label = ch.getLabel() ;
		if(e.getStateChange() == ItemEvent.SELECTED) {
			f.setTitle(Label + "被选择");
		}else {
			f.setTitle(Label + "取消选择");
		}
	}
}
