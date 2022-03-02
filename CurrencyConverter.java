 package javaFrameWork;

 import javax.swing.*;
 import java.awt.Font;
 import java.awt.Color;
 import javax.swing.*;
 import java.util.regex.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

 public class CurrencyConverter extends JFrame{

 JPanel hpanel, mpanel, lpanel, rpanel, dpanel;

 public CurrencyConverter()
 {
     setSize(400,500);
     setTitle("Currency Converter");
     setDefaultCloseOperation(3);
     setLayout(null);
     setLocationRelativeTo(null);

     hpanel = new JPanel();
     hpanel.setBounds(0,0,400,90); 
     hpanel.setLayout(null);
     hpanel.setBackground(Color.BLACK);
     add(hpanel);

     lpanel = new JPanel();
     lpanel.setBounds(0,90,40,410);
     lpanel.setBackground(Color.BLACK);
     add(lpanel);

     rpanel = new JPanel();
     rpanel.setBounds(350,90,50,410);
     rpanel.setBackground(Color.BLACK);
     add(rpanel);

     dpanel = new JPanel();
     dpanel.setBounds(0,430,400,50);
     dpanel.setBackground(Color.black);
     add(dpanel);

     JLabel htext = new JLabel("Currency Converter");
     htext.setForeground(Color.WHITE);
     htext.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
     htext.setBounds(90,25,250,40);
     hpanel.add(htext);

     JLabel bdtk = new JLabel("BDT :");
     bdtk.setBounds(100, 110, 80, 100);
     bdtk.setFont(new Font("Arial",Font.BOLD,16));
     add(bdtk);

     JTextField bdtkTxt = new JTextField();
     bdtkTxt.setBounds(160,145,80,30); 
     add(bdtkTxt);

   

     JTextField ansTxt = new JTextField();
     ansTxt.setBounds(100, 280, 220, 30); 
     add(ansTxt);

     JButton ibtn = new JButton("India");
     ibtn.setBounds(100, 320, 70, 40);
     add(ibtn);

     JButton ubtn = new JButton("USA");
     ubtn.setBounds(180, 320, 70, 40);
     add(ubtn);

     JButton abtn = new JButton("Aus");
     abtn.setBounds(260, 320, 70, 40);
     add(abtn);
     setResizable(false);
     setVisible(true);

     ibtn.addActionListener(new ActionListener(){
   	 
   	 
    	         public void actionPerformed(ActionEvent e)
    	         {
                 String str1;
                 str1 = bdtkTxt.getText();
                 double num1 = Double.parseDouble(str1);
                 double num2 =num1*0.86;
                 ansTxt.setText(Double.toString(num2));
                
                 }

             });

             ubtn.addActionListener(new ActionListener(){
   	 
   	 
    	         public void actionPerformed(ActionEvent e)
    	         {
                 String str1;
                 str1 = bdtkTxt.getText();
                 double num1 = Double.parseDouble(str1);
                 double num2 =num1*0.012;
                 ansTxt.setText(Double.toString(num2));
                
                 }

             });

             abtn.addActionListener(new ActionListener(){
   	 
   	 
    	         public void actionPerformed(ActionEvent e)
    	         {
                 String str1;
                 str1 = bdtkTxt.getText();
                 double num1 = Double.parseDouble(str1);
                 double num2 =num1*0.016;
                 ansTxt.setText(Double.toString(num2));
                
                 }

             });
     
    


     setResizable(false);
     setVisible(true);
 }


 public static void main(String[] args)
 {
     new CurrencyConverter();
 }

 } 

