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
	
		f = new Frame("ѡ�����");
		//Ϊ�б�ֵ
		ls = new List(Integer.parseInt(args[0]),Boolean.valueOf(args[1]).booleanValue());
		ls.addItemListener( this); 			//Ϊ�б�ע�������
		for( int i = 2 ; i < args.length ; i ++ ) {		//	Ϊ�б����ѡ��
			ls.add(args[i]);
		}
		ch = new Choice() ;
		ch.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Choice c = (Choice) e.getSource() ; 
				System.out.println("�����˵���" + c.getSelectedItem() +
						"ѡ��ı��Ϊ" + c.getSelectedIndex());
				System.out.println("�����˵� " + ( c.getSelectedIndex() + 1 )
						+ "�ѡ����");
				
			}
		});
		for(int i = 2 ; i < args.length ; i ++ ) {
			ch.add(args[i]);
		}
		f.add(ls, BorderLayout.SOUTH);
		f.add(ch , BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);
		System.out.println("�����˵�һ���� " + ch.getItemCount() + "��") ;
		System.out.println("�б�һ���� " + ls.getItemCount() + "��");
		
	}
	public void itemStateChanged(ItemEvent e) {
		List l = (List) e.getSource() ;
		int index[] =  l.getSelectedIndexes() ;
		String str[] = l.getSelectedItems();
		for(int i = 0 ; i < index.length ; i ++ ) {
			System.out.println("�б�" + str[i] + "���Ϊ" + index[i] );
			System.out.println("�б��" + (index[i] + 1 ) + " �ѡ����");
		}
	}
}
