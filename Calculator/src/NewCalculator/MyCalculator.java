package NewCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator extends JFrame implements ActionListener{

	//名称
	private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
	private final String[] COMMAND = { "Backspace", "CE", "C" };
	private final String[] M = { " ", "MC", "MR", "MS", "M+" };
	//按钮
	private JButton keys[] = new JButton[KEYS.length];
	private JButton commands[] = new JButton[COMMAND.length];
	private JButton m[] = new JButton[M.length];
	//文本框
	private JTextField resultText = new JTextField(" ");
	private boolean firstDigit = true ; 
	private double resultNum = 0.0 ; 
	private String operator = "=";
	private boolean operateValidFlag = true ;
	public MyCalculator() {
		super();
		init();
		this.setBackground(Color.LIGHT_GRAY);
		this.setTitle("计算器");
		this.setLocation(500, 300);
		this.setResizable(true);
		this.pack();
	}
	
	private void init() {		//设置计算器
		// TODO Auto-generated method stub
		resultText.setHorizontalAlignment(JTextField.RIGHT);
		resultText.setEditable(false);
		resultText.setBackground(Color.WHITE);
		JPanel calckeysPanel = new JPanel();
		
		calckeysPanel.setLayout(new GridLayout(4, 5 , 3 , 3 ));
		for(int i = 0 ; i < KEYS.length ; i ++ ) {
			keys[i] = new JButton(KEYS[i]);
			calckeysPanel.add(keys[i]);
			keys[i].setForeground(Color.blue);
		}
        keys[3].setForeground(Color.red);
        keys[8].setForeground(Color.red);
        keys[13].setForeground(Color.red);
        keys[18].setForeground(Color.red);
        keys[19].setForeground(Color.red);
        //初始功能键
        JPanel commandsPanel = new JPanel();
        //布局
        commandsPanel.setLayout(new GridLayout(1, 3,3,3));
        for(int i= 0 ; i <COMMAND.length ; i  ++ ){
        	commands[i] = new JButton(COMMAND[i]) ;
        	commandsPanel.add(commands[i]);
        	commands[i].setForeground(Color.red);
        	
        }
        //初始M键
        JPanel calmsPanel = new JPanel();
        //布局
        calmsPanel.setLayout(new GridLayout(5, 1,3,3));
        for(int i = 0 ; i < M.length ; i ++ ) {
        	m[i] = new JButton(M[i]);
        	calmsPanel.add(m[i]);
        	m[i].setForeground(Color.red);
        }
		
        JPanel panel1 = new JPanel();
        
        panel1.setLayout(new BorderLayout(3 , 3 ));
        panel1.add("North" , commandsPanel ) ;
        panel1.add("Center" , calckeysPanel ) ; 
        //文本框
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add("Center" , resultText);
        
        //整体布局
        
        getContentPane().setLayout(new BorderLayout(3 , 5 ));;
        getContentPane().add("North" , top ) ; 
        getContentPane().add("Center", panel1);
        getContentPane().add("West", calmsPanel );
        
        //添加监听器
        for(int i = 0 ; i < KEYS.length ; i ++ ) {
        	keys[i].addActionListener(this);
        }
        for(int i = 0 ; i < COMMAND.length ; i ++ ) {
        	commands[i].addActionListener(this);
        }
        for(int i = 0 ; i < M.length ; i ++ ) {
        	m[i].addActionListener(this);
        }
	}
	//处理事件
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String label = e.getActionCommand() ; 
		if(label.equals(COMMAND[0])) {
			//执行Backspace
			handleBackspace();
		}else if(label.equals(COMMAND[1])) {
			//执行CE
			resultText.setText("0");
		}else if(label.equals(COMMAND[2])) {
			//执行C
			handleC();
		}else if("0123456789.".indexOf(label) >= 0 ) {
			//执行数字活小数点
			handleNumber(label);
		}else {
			//运算
			handleOperator(label);
		}
	}

	private void handleOperator(String label) {
		// TODO Auto-generated method stub
		if (operator.equals("/")) {
	      
	        if (getNumberFromText() == 0.0) {
	            
	            operateValidFlag = false;
	            resultText.setText("除数不能为零");
	        } else {
	            resultNum /= getNumberFromText();
	        }
	    } else if (operator.equals("1/x")) {
	        
	        if (resultNum == 0.0) {
	            
	            operateValidFlag = false;
	            resultText.setText("零没有倒数");
	        } else {
	            resultNum = 1 / resultNum;
	        }
	    } else if (operator.equals("+")) {
	        
	        resultNum += getNumberFromText();
	    } else if (operator.equals("-")) {
	        
	        resultNum -= getNumberFromText();
	    } else if (operator.equals("*")) {
	        
	        resultNum *= getNumberFromText();
	    } else if (operator.equals("sqrt")) {
	       
	        resultNum = Math.sqrt(resultNum);
	    } else if (operator.equals("%")) {
	        
	        resultNum = resultNum / 100;
	    } else if (operator.equals("+/-")) {
	        
	        resultNum = resultNum * (-1);
	    } else if (operator.equals("=")) {
	    
	        resultNum = getNumberFromText();
	    }
	    if (operateValidFlag) {
	        long t1;
	        double t2;
	        t1 = (long) resultNum;
	        t2 = resultNum - t1;
	        if (t2 == 0) {
	            resultText.setText(String.valueOf(t1));
	        } else {
	            resultText.setText(String.valueOf(resultNum));
	        }
	    }
	    operator = label;
	    firstDigit = true;
	    operateValidFlag = true;
	}

	private double getNumberFromText() {
		// TODO Auto-generated method stub
	    double result = 0;
	    try {
	        result = Double.valueOf(resultText.getText()).doubleValue();
	    } catch (NumberFormatException e) {
	    }
	    return result;
	}

	private void handleNumber(String label) {
		// TODO Auto-generated method stub
		if(firstDigit) {
			resultText.setText(label);
		}else if(label.equals(".") && (resultText.getText().indexOf(".") < 0 ) ) {
			resultText.setText(resultText.getText() + ".");
		}else if(!label.equals(".")) {
			resultText.setText(resultText.getText() + label ) ;
		}
		firstDigit = false ; 
	}

	private void handleC() {
		// TODO Auto-generated method stub
		resultText.setText("0");
		firstDigit = true ;
		operator = " = " ; 
	}

	private void handleBackspace() {
		// TODO Auto-generated method stub
		String text = resultText.getText();
		int i = text.length() ; 
		if( i > 0 ) {
			text = text.substring(0 , i - 1 ) ; 
			if( text.length() == 0 ) {
				resultText.setText("0");
				firstDigit = true ; 
				operator = "=" ; 
			}else {
				resultText.setText(text);;
			}
		}
	}

	
}

