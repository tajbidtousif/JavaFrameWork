import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener{
	
	JPanel panel1, panel2, panel3;
	JTextField text;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnAdd,btnSub,btnMulti,btnDiv,btnEqual,btnClr;
	int flag;
	String str1,str2;
	Double num1,num2;
	Frame(){
		
		setTitle("Simple Calculator"); 

		
		setSize(515,540);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(null);
		
		Font  font = new Font("Arial", Font.BOLD,30) ;
		
		panel1 = new JPanel();
		panel1.setBounds(0,0,500,150);
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		add(panel1);
		
		panel2 = new JPanel();
		panel2.setBounds(0,150,350,350);
		panel2.setBackground(Color.CYAN);
		panel2.setLayout(new GridLayout(4,3,2,2));
		add(panel2);
		
		panel3 = new JPanel();
		panel3.setBounds(350,150,150,350);
		panel3.setBackground(Color.CYAN);
		panel3.setLayout(new GridLayout(5,1,2,2));
		add(panel3);
		
		text = new JTextField();
		text.setBounds(10,10,480,130);
		text.setFont(font);
		panel1.add(text);
		
		btn1 = new JButton("1");btn1.addActionListener(this);btn1.setFont(font);btn1.setForeground(Color.WHITE);btn1.setBackground(Color.BLACK);
		btn2 = new JButton("2");btn2.addActionListener(this);btn2.setFont(font);btn2.setForeground(Color.WHITE);btn2.setBackground(Color.BLACK);
		btn3 = new JButton("3");btn3.addActionListener(this);btn3.setFont(font);btn3.setForeground(Color.WHITE);btn3.setBackground(Color.BLACK);
		btn4 = new JButton("4");btn4.addActionListener(this);btn4.setFont(font);btn4.setForeground(Color.WHITE);btn4.setBackground(Color.BLACK);
		btn5 = new JButton("5");btn5.addActionListener(this);btn5.setFont(font);btn5.setForeground(Color.WHITE);btn5.setBackground(Color.BLACK);
		btn6 = new JButton("6");btn6.addActionListener(this);btn6.setFont(font);btn6.setForeground(Color.WHITE);btn6.setBackground(Color.BLACK);
		btn7 = new JButton("7");btn7.addActionListener(this);btn7.setFont(font);btn7.setForeground(Color.WHITE);btn7.setBackground(Color.BLACK);
		btn8 = new JButton("8");btn8.addActionListener(this);btn8.setFont(font);btn8.setForeground(Color.WHITE);btn8.setBackground(Color.BLACK);
		btn9 = new JButton("9");btn9.addActionListener(this);btn9.setFont(font);btn9.setForeground(Color.WHITE);btn9.setBackground(Color.BLACK);
		btn0 = new JButton("0");btn0.addActionListener(this);btn0.setFont(font);btn0.setForeground(Color.WHITE);btn0.setBackground(Color.BLACK);
		btnEqual = new JButton("=");btnEqual.addActionListener(this);btnEqual.setFont(font);btnEqual.setForeground(Color.WHITE);btnEqual.setBackground(Color.BLACK);btnEqual.setFocusable(false);
		btnClr = new JButton("C");btnClr.addActionListener(this);btnClr.setFont(font);btnClr.setForeground(Color.WHITE);btnClr.setBackground(Color.RED);
		
		panel2.add(btn1);
		panel2.add(btn2);
		panel2.add(btn3);
		panel2.add(btn4);
		panel2.add(btn5);
		panel2.add(btn6);
		panel2.add(btn7);
		panel2.add(btn8);
		panel2.add(btn9);
		panel2.add(btn0);
		panel2.add(btnEqual);
		panel2.add(btnClr);
		
		btnAdd = new JButton("+");btnAdd.addActionListener(this);btnAdd.setFont(font);btnAdd.setForeground(Color.WHITE);btnAdd.setBackground(Color.BLACK);
		btnSub = new JButton("-");btnSub.addActionListener(this);btnSub.setFont(font);btnSub.setForeground(Color.WHITE);btnSub.setBackground(Color.BLACK);
		btnMulti = new JButton("*");btnMulti.addActionListener(this);btnMulti.setFont(font);btnMulti.setForeground(Color.WHITE);btnMulti.setBackground(Color.BLACK);
		btnDiv = new JButton("/");btnDiv.addActionListener(this);btnDiv.setFont(font);btnDiv.setForeground(Color.WHITE);btnDiv.setBackground(Color.BLACK);
		btnDot = new JButton(".");btnDot.addActionListener(this);btnDot.setFont(font);btnDot.setForeground(Color.WHITE);btnDot.setBackground(Color.BLACK);
		
		panel3.add(btnAdd);
		panel3.add(btnSub);
		panel3.add(btnMulti);
		panel3.add(btnDiv);
		panel3.add(btnDot);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btn1 ) 
		{
			text.setText(text.getText()+"1");
		}
		if(e.getSource()==btn2 ) 
		{
			text.setText(text.getText()+"2");
		}
		if(e.getSource()==btn3 ) 
		{
			text.setText(text.getText()+"3");
		}
		if(e.getSource()==btn4 ) 
		{
			text.setText(text.getText()+"4");
		}
		if(e.getSource()==btn5 ) 
		{
			text.setText(text.getText()+"5");
		}
		if(e.getSource()==btn6 ) 
		{
			text.setText(text.getText()+"6");
		}
		if(e.getSource()==btn7 ) 
		{
			text.setText(text.getText()+"7");
		}
		if(e.getSource()==btn8 ) 
		{
			text.setText(text.getText()+"8");
		}
		if(e.getSource()==btn9 ) 
		{
			text.setText(text.getText()+"9");
		}
		if(e.getSource()==btn0 ) 
		{
			text.setText(text.getText()+"0");
			
		}
		if(e.getSource()==btnDot) 
		{
			text.setText(text.getText()+".");
		}
		if(e.getSource()==btnClr) 
		{
			text.setText(" ");
			
		}
		if(e.getSource()==btnAdd){
           str1=text.getText();
           num1=Double.parseDouble(str1);
            text.setText(" ");
             flag = 1;
        }
    		
		if(e.getSource()==btnSub){
			str1=text.getText();
	        num1=Double.parseDouble(str1);
            text.setText(" ");
            flag = 2;
        }
          if(e.getSource()==btnMulti){
        	 str1=text.getText();
             num1=Double.parseDouble(str1);
            text.setText(" ");
            flag = 3;
        }
          
          if(e.getSource()==btnDiv){
        	 str1=text.getText();
             num1=Double.parseDouble(str1);
            text.setText(" ");
            flag = 4;
        }
         if(e.getSource()==btnEqual) 
         {
        	 if(flag==1){
	                str2=text.getText();
	                num2=Double.parseDouble(str2);
	                double sum=num1+num2;
	                text.setText(Double.toString(sum));
	            }
	             if(flag==2){
	                str2=text.getText();
	                num2=Double.parseDouble(str2);
	                double sub=num1-num2;
	                text.setText(Double.toString(sub));
	            }
	              if(flag==3){
	                str2=text.getText();
	                num2=Double.parseDouble(str2);
	                double sum=num1*num2;
	                text.setText(Double.toString(sum));
	            }
	               if(flag==4){
	                str2=text.getText();
	                num2=Double.parseDouble(str2);
	                double div=num1/num2;
	                text.setText(Double.toString(div));
	            }
        	 
         }
    		
} 
         
	
}