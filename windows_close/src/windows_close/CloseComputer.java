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
	//创建成员变量
	//创建实现BorderLayout 布局的面板对象 panel_main
	private JPanel panel_main = new JPanel(new BorderLayout( 5 , 10 )) ; 
	//创建实现FlowLayout 布局的面板对象panel_subnorth
	private JPanel panel_subnorth = new JPanel(new FlowLayout(3));
	//创建实现FlowLayout 布局的面板对象panel_subcenter
	private JPanel panel_subcenter = new JPanel(new FlowLayout(1 , 5 , 5));
	//创建三个按钮对象 countdown , time 和cancel
	private JButton countdown = new JButton("倒计时关机");
	private JButton time = new JButton("定时关机");
	private JButton cancel = new JButton("取消关机");
	private JLabel tag ; 			//标签对象
	String key ;					//字符串对象
	public CloseComputer() {
		this.getContentPane().add(panel_main) ;  	//添加panel_main到主窗口
		//添加对象到panel_main窗口里
		panel_main.add(panel_subnorth , BorderLayout.NORTH) ; 
		panel_main.add(panel_subcenter , BorderLayout.CENTER);
		//添加标签对象到panel_subnorth里
		panel_subnorth.add(	tag = new JLabel("请选择关机方式:"));
		//添加3个按钮到对象panel_subcenter里
		panel_subcenter.add(countdown);
		panel_subcenter.add(time) ;
		panel_subcenter.add(cancel);
		//为三个按钮注册事件监听器
		countdown.addActionListener(this);
		time.addActionListener(this);
		cancel.addActionListener(this);
	}
	public static void main(String[] args) throws Exception{//主方法
		CloseComputer frame = new CloseComputer();		//创建closecomputer对象
		//设置窗口关闭功能
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(320 , 120);//窗口大小
		frame.setTitle("关机工具");//标题
		frame.setLocation(350 , 350);
		frame.setVisible(true);//显示
		frame.setResizable(false);
		
	}
	public void countdown() {
		//获取输入信息
		key = JOptionPane.showInputDialog(this , "请输入倒计时关机剩余的"
				+ "时间(秒)" ,"输入框" , 1 );
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
		hourtmp = JOptionPane.showInputDialog(this , "请输入关机的小时"
				+ "（12小时制）" ,"输入" , 1 );
		minutetmp = JOptionPane.showInputDialog(this , "请输入关机的分钟"
				,"输入" , 1 );
		secondtmp = JOptionPane.showInputDialog(this , "请输入关机的秒钟"
				,"输入" , 1 );
		//转换类型
		hour = Integer.parseInt(hourtmp) ; 
		minute = Integer.parseInt(minutetmp) ; 
		second = Integer.parseInt(secondtmp) ; 
		long set_time = timesum(hour , minute , second ) ;
		long currently_time = timesum(h , m , s ) ;
		//设置时间与系统时间差
		long discrepancy_time = set_time - currently_time ; 
		if(discrepancy_time < 0) {
			try {
				Runtime.getRuntime().exec("shutdown -s");
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			CountTimeTool.delaytime(discrepancy_time);
			JOptionPane.showMessageDialog(this ,"恭喜你，设置成功！",
					"确认" , 2);
		}
	}
	private long timesum(int hour, int minute, int second) {
		return (hour * 3600 + minute * 60 + second);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String ActionCommand =	e.getActionCommand();
		if(e.getSource() instanceof JButton ) {
			if("倒计时关机".equals(ActionCommand)) {
				countdown();
			}
		}
		if("定时关机".equals(ActionCommand)) {
			time();
		}
		if("取消关机".equals(ActionCommand)) {
			cancel();
		}
		
	}
	private void cancel() {
		try {
			JOptionPane.showMessageDialog(this, "你已经成功取消关机操作",
					"消息", 2);
			Runtime.getRuntime().exec("shoutdown -a");
		}catch(IOException e) {
			
		}
		
	}

}
