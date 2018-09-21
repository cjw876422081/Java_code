package windows_close;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CloseComputer extends JFrame implements ActionListener{
	//������Ա����
	//����ʵ��BorderLayout ���ֵ������� panel_main
	private JPanel panel_main = new JPanel(new BorderLayout( 5 , 10 )) ; 
	//����ʵ��FlowLayout ���ֵ�������panel_subnorth
	private JPanel panel_subnorth = new JPanel(new FlowLayout(3));
	//����ʵ��FlowLayout ���ֵ�������panel_subcenter
	private JPanel panel_subcenter = new JPanel(new FlowLayout(1 , 5 , 5));
	//����������ť���� countdown , time ��cancel
	private JButton countdown = new JButton("����ʱ�ػ�");
	private JButton time = new JButton("��ʱ�ػ�");
	private JButton cancel = new JButton("ȡ���ػ�");
	private JLabel tag ; 			//��ǩ����
	String key ;					//�ַ�������
	public CloseComputer() {
		this.getContentPane().add(panel_main) ;  	//���panel_main��������
		//��Ӷ���panel_main������
		panel_main.add(panel_subnorth , BorderLayout.NORTH) ; 
		panel_main.add(panel_subcenter , BorderLayout.CENTER);
		//��ӱ�ǩ����panel_subnorth��
		panel_subnorth.add(	tag = new JLabel("��ѡ��ػ���ʽ:"));
		//���3����ť������panel_subcenter��
		panel_subcenter.add(countdown);
		panel_subcenter.add(time) ;
		panel_subcenter.add(cancel);
		//Ϊ������ťע���¼�������
		countdown.addActionListener(this);
		time.addActionListener(this);
		cancel.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{//������
		CloseComputer frame = new CloseComputer();		//����closecomputer����
		//���ô��ڹرչ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(320 , 120);//���ڴ�С
		frame.setTitle("�ػ�����");//����
		frame.setLocation(350 , 350);
		frame.setVisible(true);//��ʾ
		frame.setResizable(false);
		
	}
	public void countdown() {
		//��ȡ������Ϣ
		key = JOptionPane.showInputDialog(this , "�����뵹��ʱ�ػ�ʣ���"
				+ "ʱ��(��)" ,"�����" , 1 );
		CountTimeTool.delaytime(Long.parseLong(key));
		
	}
	public void time() {
		Calendar calendar = Calendar.getInstance();
		int h = calendar.get(Calendar.HOUR);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		String a  = String.valueOf(h);
		int hour , minute ,second ;
		String hourtmp , minutetmp ,secondtmp ; 
		hourtmp = JOptionPane.showInputDialog(this , "������ػ���Сʱ"
				+ "��12Сʱ�ƣ�" ,"����" , 1 );
		minutetmp = JOptionPane.showInputDialog(this , "������ػ��ķ���"
				,"����" , 1 );
		secondtmp = JOptionPane.showInputDialog(this , "������ػ�������"
				,"����" , 1 );
		//ת������
		hour = Integer.parseInt(hourtmp) ; 
		minute = Integer.parseInt(minutetmp) ; 
		second = Integer.parseInt(secondtmp) ; 
		long set_time = timesum(hour , minute , second ) ;
		long currently_time = timesum(h , m , s ) ;
		//����ʱ����ϵͳʱ���
		long discrepancy_time = set_time - currently_time ; 
		if(discrepancy_time < 0) {
			try {
				Runtime.getRuntime().exec("shutdown -s");
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			CountTimeTool.delaytime(discrepancy_time);
			JOptionPane.showMessageDialog(this ,"��ϲ�㣬���óɹ���",
					"ȷ��" , 2);
		}
	}
	private long timesum(int hour, int minute, int second) {
		return (hour * 3600 + minute * 60 + second);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ActionCommand =	e.getActionCommand();
		if(e.getSource() instanceof JButton ) {
			if("����ʱ�ػ�".equals(ActionCommand)) {
				countdown();
			}
		}
		if("��ʱ�ػ�".equals(ActionCommand)) {
			time();
		}
		if("ȡ���ػ�".equals(ActionCommand)) {
			cancel();
		}
		
	}
	private void cancel() {
		try {
			JOptionPane.showMessageDialog(this, "���Ѿ��ɹ�ȡ���ػ�����",
					"��Ϣ", 2);
			Runtime.getRuntime().exec("shoutdown -a");
		}catch(IOException e) {
			
		}
		
	}

}
