package Third;


import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OptionsSelect implements ItemListener {
	Frame f ; 
	List ls ; 
	Choice ch ;
	public static void main(String args[]) {
		new OptionsSelect(args) ;
	}
	public OptionsSelect(String args[]) {
	
		f = new Frame("选项组件");
		//为列表赋值
		ls = new List(Integer.parseInt(args[0]),Boolean.valueOf(args[1]).booleanValue());
		ls.addItemListener( this); 			//为列表注册监听器
		for( int i = 2 ; i < args.length ; i ++ ) {		//	为列表添加选项
			ls.add(args[i]);
		}
		ch = new Choice() ;
		ch.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Choice c = (Choice) e.getSource() ; 
				System.out.println("下拉菜单中" + c.getSelectedItem() +
						"选项的编号为" + c.getSelectedIndex());
				System.out.println("下拉菜单 " + ( c.getSelectedIndex() + 1 )
						+ "项被选择了");
				
			}
		});
		for(int i = 2 ; i < args.length ; i ++ ) {
			ch.add(args[i]);
		}
		f.add(ls, BorderLayout.SOUTH);
		f.add(ch , BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);
		System.out.println("下拉菜单一共有 " + ch.getItemCount() + "项") ;
		System.out.println("列表一共有 " + ls.getItemCount() + "项");
		
	}
	public void itemStateChanged(ItemEvent e) {
		List l = (List) e.getSource() ;
		int index[] =  l.getSelectedIndexes() ;
		String str[] = l.getSelectedItems();
		for(int i = 0 ; i < index.length ; i ++ ) {
			System.out.println("列表" + str[i] + "编号为" + index[i] );
			System.out.println("列表第" + (index[i] + 1 ) + " 项被选择了");
		}
	}
}
