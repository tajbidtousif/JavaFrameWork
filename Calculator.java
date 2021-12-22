// Github id "tajbidtousif"

package javaFrameWork;

//import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator {

    public Calculator() {

        int screenX = 5, screenY = 5, screenWidth = 290, screenHeight = 80;
        int numpadWidth = 215, numpadHeight = 270;
        int symbolWidth = 70, symbolHeight = 270;


        JFrame frame = new JFrame("Tousif's Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300, 400);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        JPanel top = new JPanel();
        JPanel bottomLeft = new JPanel();
        JPanel bottomRight = new JPanel();

        top.setBounds(screenX, screenY, screenWidth-10, screenHeight);
        bottomLeft.setBounds(screenX, screenY + screenHeight + 5, numpadWidth, numpadHeight);
        bottomRight.setBounds(screenX + numpadWidth + 5, screenY + screenHeight + 5, symbolWidth-10, symbolHeight);

        JTextField input = new JTextField();
        JTextField output = new JTextField();

        input.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        output.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        output.setHorizontalAlignment(JTextField.RIGHT);
        output.setEditable(false);

        top.add(input);
        top.add(output);

        top.setLayout(new GridLayout(2, 1));
        bottomLeft.setLayout(new GridLayout(4, 3));
        bottomRight.setLayout(new GridLayout(6, 1));

        String numpad[] = { "7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "DEL" };

        ArrayList<JButton> buttons = new ArrayList<JButton>();

        for (int i = 0; i < numpad.length; i++) {
            JButton button = new JButton(numpad[i]);
            bottomLeft.add(button);
            buttons.add(button);
        }

        String symbols[] = { "+", "-", "*", "/", "%", "=" };

        for (int i = 0; i < symbols.length; i++) {
            JButton button = new JButton(symbols[i]);
            bottomRight.add(button);
            buttons.add(button);
        }

        for (JButton button : buttons) {
            switch (button.getText()) {
                case "DEL":
                    button.addActionListener(l -> {
                        String text = input.getText();
                        if (text.length() > 0) {
                            input.setText(text.substring(0, text.length() - 1));
                        }
                    });

                    break;

                case "=":
                    button.addActionListener(l -> {
                        String text = input.getText();
                        if (text.length() > 0) {
                            output.setText(calculate(text));
                            
                        }
                    });
                    break;
                default:
                    button.addActionListener(l -> input.setText(input.getText() + button.getText()));
                    break;
            }
        }


        frame.add(top);
        frame.add(bottomLeft);
        frame.add(bottomRight);

        frame.setVisible(true);

    }

    public static String calculate(String expresion) {
        try {
            
            expresion = expresion.replaceAll("\\s+", "");

            String numerics[] = expresion.split("[-+/*%]+");
            String operators[] = expresion.split("[0-9]+");
            
            double result=Double.parseDouble(numerics[0]);
            int i=1;
            for (String operator: operators) {
                switch (operator) {
                    case "+":
                        result += Double.parseDouble(numerics[i++]);
                        break;
                    case "-":
                        result -= Double.parseDouble(numerics[i++]);
                        break;

                    case "*":
                        result *= Double.parseDouble(numerics[i++]);
                        break;
                    
                    case "/":
                        result /= Double.parseDouble(numerics[i++]) ;
                        
                        break;
                    case "%":
                        result %= Double.parseDouble(numerics[i++]) ;
                        break;
                        
                    default:
                
                        break;
                }
            }


            return String.valueOf(result);
        } catch (ArithmeticException e) {
            return "Math ERROR";
        } catch (Exception e) {
            return "Syntax ERROR";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}