package infoCollector;

import javax.swing.*;

public class FrameWithoutpanel extends JFrame {
	
	
	public FrameWithoutpanel()
	
	{
		
		JFrame frame = new JFrame("Information Collector");
		frame.setSize(500,500);
		
		JLabel label = new JLabel("Enter Your Name");
		label.setBounds(100,20,110,50);
		
		JTextField text = new JTextField();
		text.setBounds(100,60,150,35);
		
		
		JButton btn1 = new JButton("Submit");
		btn1.setBounds(100,110,90,30);
		
		
		frame.add(btn1);
		frame.add(label);
		frame.add(text);
		
		//JOptionPane.showMessageDialog(null, "Successfully Collected ","submission Message", JOptionPane.WARNING_MESSAGE);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		
		btn1.addActionListener(l -> {          //lamda expression
			
			System.out.println(text.getText());
			
			if(text.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Fill up the Text Field","Please",JOptionPane.ERROR_MESSAGE);
			}
			
			else {
			JOptionPane.showMessageDialog(null, text.getText(),"Submission Message", JOptionPane.WARNING_MESSAGE);
			}
			
		});
		
	
		
		
	}
	
	public static void main(String[] args)
	{
		new FrameWithoutpanel();
		
	}
	
}