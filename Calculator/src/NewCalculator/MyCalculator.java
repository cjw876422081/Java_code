package NewCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator extends JFrame implements ActionListener{

	//����
	private final String[] KEYS = { "7", "8", "9", "/", "sqrt", "4", "5", "6",
            "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "=" };
	private final String[] COMMAND = { "Backspace", "CE", "C" };
	private final String[] M = { " ", "MC", "MR", "MS", "M+" };
	//��ť
	private JButton keys[] = new JButton[KEYS.length];
	private JButton commands[] = new JButton[COMMAND.length];
	private JButton m[] = new JButton[M.length];
	//�ı���
	private JTextField resultText = new JTextField(" ");
	private boolean firstDigit = true ; 
	private double resultNum = 0.0 ; 
	private String operator = "=";
	private boolean operateValidFlag = true ;
	public MyCalculator() {
		super();
		init();
		this.setBackground(Color.LIGHT_GRAY);
		this.setTitle("������");
		this.setLocation(500, 300);
		this.setResizable(true);
		this.pack();
	}
	
	private void init() {		//���ü�����
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
        //��ʼ���ܼ�
        JPanel commandsPanel = new JPanel();
        //����
        commandsPanel.setLayout(new GridLayout(1, 3,3,3));
        for(int i= 0 ; i <COMMAND.length ; i  ++ ){
        	commands[i] = new JButton(COMMAND[i]) ;
        	commandsPanel.add(commands[i]);
        	commands[i].setForeground(Color.red);
        	
        }
        //��ʼM��
        JPanel calmsPanel = new JPanel();
        //����
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
        //�ı���
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        top.add("Center" , resultText);
        
        //���岼��
        
        getContentPane().setLayout(new BorderLayout(3 , 5 ));;
        getContentPane().add("North" , top ) ; 
        getContentPane().add("Center", panel1);
        getContentPane().add("West", calmsPanel );
        
        //��Ӽ�����
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
	//�����¼�
		@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String label = e.getActionCommand() ; 
		if(label.equals(COMMAND[0])) {
			//ִ��Backspace
			handleBackspace();
		}else if(label.equals(COMMAND[1])) {
			//ִ��CE
			resultText.setText("0");
		}else if(label.equals(COMMAND[2])) {
			//ִ��C
			handleC();
		}else if("0123456789.".indexOf(label) >= 0 ) {
			//ִ�����ֻ�С����
			handleNumber(label);
		}else {
			//����
			handleOperator(label);
		}
	}

	private void handleOperator(String label) {
		// TODO Auto-generated method stub
		if (operator.equals("/")) {
	      
	        if (getNumberFromText() == 0.0) {
	            
	            operateValidFlag = false;
	            resultText.setText("��������Ϊ��");
	        } else {
	            resultNum /= getNumberFromText();
	        }
	    } else if (operator.equals("1/x")) {
	        
	        if (resultNum == 0.0) {
	            
	            operateValidFlag = false;
	            resultText.setText("��û�е���");
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

