// package javaFrameWork;

// import java.awt.Color;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.JTextField;
// import javax.swing.plaf.ColorUIResource;


// public class Task {
//     JPanel panel, hpanel, lpanel, mpanel;
//     public Task()
//     {
//         JFrame f = new JFrame();
//         f.setSize(400,400);
//         f.setLayout(null);

//         JLabel l0 = new JLabel("Temperature Converture");
//         l0.setBounds(100, 10, 200, 30);		
        		
//         JLabel l1 = new JLabel("C:");
//         l1.setBounds(100, 50, 100, 30);	

//         JLabel l2 = new JLabel("F:");
//         l2.setBounds(100, 100, 100, 30);

//         JLabel l3 = new JLabel("K:");
//         l3.setBounds(100, 150, 100, 30);

//         JLabel l4  = new JLabel("Output:");
//         l4.setBounds(100, 200, 100, 30);

//         JTextField t1 = new JTextField();
//         t1.setBounds(200, 50, 100, 30);

//         JTextField t2 = new JTextField();
//         t2.setBounds(200, 100, 100, 30);

//         JTextField t3 = new JTextField();
//         t3.setBounds(200, 150, 100, 30);

//         JTextField t4 = new JTextField();
//         t4.setBounds(200,200,100,30);
//         t4.setEditable(false);
        
        

//         JButton b1 = new JButton("C");
//         b1.setBounds(100, 250, 50, 30);

//         JButton b2 = new JButton("F");
//         b2.setBounds(200, 250, 50, 30);

//         JButton b3 = new JButton("K");
//         b3.setBounds(300, 250, 50, 30);


        
//         b1.addActionListener(l -> {
//              double ans=0 ;

//              if(t1.getText().length()>0)
//              {
//                  ans = Double.parseDouble(t1.getText());
//              }
             
//              else if(t2.getText().length()>0)
//              {
//                 ans  = (Double.parseDouble(t2.getText())-32)*5/9;
//              }
//              else if(t3.getText().length()>0){

//                 ans = (Double.parseDouble(t3.getText()) - 273);
//              }

//              else{

//                  JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
//              }

//              String s = String.valueOf(ans);
             
//              if( s.length() > 7)
//              {
//                 t4.setText(String.valueOf(ans).substring(0, 7));
             
//              }
//              else{
//                  t4.setText(s);
//              }

//              //t4.setText(String.valueOf(ans).substring(0, 7));
             
//         });        
            
//         b2.addActionListener(l ->{
//             double ans  = 0;

//             if(t1.getText().length()>0)
//             {
//                 ans = Double.parseDouble(t1.getText());
//             }

//             else if(t2.getText().length() > 0)
//             {
//                 ans = (Double.parseDouble(t2.getText())-32) * 5/9;
//             }
//            else if(t3.getText().length()>0) 
//            {
//                 ans = (Double.parseDouble(t3.getText())-273); 

//             }

//             else{
//                 JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
//             }

//             String s = String.valueOf(ans);

//             if( s.length() > 7)
//              {
//                 t4.setText(String.valueOf(ans).substring(0, 7));
             
//              }
//              else{
//                  t4.setText(s);
//              }

//         });

//         b3.addActionListener(l ->{

//             double ans = 0;

//             if(t1.getText().length() > 0)
//             {
//                 ans = Double.parseDouble(t1.getText());
//             }

//             else if(t2.getText().length() > 0)
//             {
//                 ans  = ((Double.parseDouble(t2.getText())-32) * 5/9);  
//             }

//             else if(t3.getText().length() > 0)
//             {
//                 ans = Double.parseDouble(t3.getText())-273;
//             }
//             else{
//                 JOptionPane.showMessageDialog(null, "Input fields are empty!", "Warning", JOptionPane.WARNING_MESSAGE);
//             }

//             String s = String.valueOf(ans);

//             if( s.length() > 7)
//              {
//                 t4.setText(String.valueOf(ans).substring(0, 7));
             
//              }
//              else{
//                  t4.setText(s);
//              }
            
//         });
        		
        		
        		
        		
        		
//         f.add(l1);		
//         f.add(l0);
//         f.add(l2);	
//         f.add(l3);
//         f.add(l4);
//         f.add(t1);
//         f.add(t2);
//         f.add(t3);
//         f.add(b1);
//         f.add(b2);
//         f.add(b3);
//         f.add(t4);

//         f.setResizable(false);	
//         f.setVisible(true);		
        		
        		
//         	}


//     public static void main(String[] args)
//     {
//         Task t = new Task();
//     }

// }
