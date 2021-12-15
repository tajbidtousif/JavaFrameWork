
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class swingPlusDatabase {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", null);
            Statement stmt = con.createStatement();
            
            // create frame
            JFrame frame = new JFrame("Project");
            frame.setSize(500, 600);
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // create panel
            JPanel p1 = new JPanel();
            JLabel l1 = new JLabel("Full Name");
            JTextField t1 = new JTextField(20);
            JLabel l2 = new JLabel("Age");
            JTextField t2 = new JTextField(5);
            JButton b1 = new JButton("Add User");
            p1.add(l1);
            p1.add(t1);
            p1.add(l2);
            p1.add(t2);
            p1.add(b1);
            frame.add(p1);

            // create panel
            JPanel p2 = new JPanel();
            JLabel l3 = new JLabel("User Table");
            JTable table = new JTable();
            JScrollPane scrollPane = new JScrollPane(table);
            p2.add(l3);
            p2.add(scrollPane);
            frame.add(p2);

            // manually add data to table
            String[] columnNames = {"Name", "Age"};
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                model.addRow(new Object[] {name, age});
            }
            table.setModel(model);
            
            // add action listener

            b1.addActionListener(e -> {
                try {
                    Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", null);
                    Statement stmt2 = con2.createStatement();
                    String name = t1.getText();
                    String age = t2.getText();
                    if(name.equals("") || age.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please fill in all fields");
                    } else {
                        stmt2.executeUpdate("INSERT INTO user (name, age) VALUES ('" + name + "', " + age + ")");
                        model.addRow(new Object[] {name, age});
                        t1.setText("");
                        t2.setText("");
                        // add new row to table
                        JOptionPane.showMessageDialog(null, "User added");
                        
                    }
                    con2.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            
            frame.setVisible(true);
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}