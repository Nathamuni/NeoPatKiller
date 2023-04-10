package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class App extends JFrame{

    private JButton button1;
    private JPanel panel1;
    private JTextArea textArea;
    private JLabel createdByNathamuniLabel,countdownLabel;
    private JLabel labell;
    private JTextField textField1;
    private int count;
    String count1;
    public App() {

        setTitle("Neopat killer");


        setLocationRelativeTo(null);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String s = textArea.getText();


                try{
                    countdownLabel = new JLabel();
                    getContentPane().add(countdownLabel);

                    count1 = textField1.getText();
//                    count=10;
                    count= Integer.parseInt(count1);
                    Thread.sleep(count);
                    countdownLabel.setText(Integer.toString(count));

                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            labell.setText(Integer.toString(count));
                            // JOptionPane.showMessageDialog(null,count);

                            count--;
                            countdownLabel.setText(Integer.toString(count));

                            if (count <= 0) {


                                Robot robot = null;
                                try {
                                    robot = new Robot();
                                } catch (AWTException ex) {

                                }
                                String input = textArea.getText(); // The input text to type

                                for (int i = 0; i < input.length(); i++) {
                                    char c = input.charAt(i);

                                    if (c=='!') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_1);
                                        robot.keyRelease(KeyEvent.VK_1);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='@') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_2);
                                        robot.keyRelease(KeyEvent.VK_2);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='#') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_3);
                                        robot.keyRelease(KeyEvent.VK_3);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='$') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_4);
                                        robot.keyRelease(KeyEvent.VK_4);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='%') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_5);
                                        robot.keyRelease(KeyEvent.VK_5);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='^') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_6);
                                        robot.keyRelease(KeyEvent.VK_6);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='&') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_7);
                                        robot.keyRelease(KeyEvent.VK_7);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='*') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_8);
                                        robot.keyRelease(KeyEvent.VK_8);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='(') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_9);
                                        robot.keyRelease(KeyEvent.VK_9);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c==')') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_0);
                                        robot.keyRelease(KeyEvent.VK_0);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='_') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_MINUS);
                                        robot.keyRelease(KeyEvent.VK_MINUS);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='+') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_EQUALS);
                                        robot.keyRelease(KeyEvent.VK_EQUALS);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if(c=='{') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_OPEN_BRACKET); // for {
                                        robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (input.equals("}")) {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_CLOSE_BRACKET); // for }
                                        robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    }else if (c=='?') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_SLASH);
                                        robot.keyRelease(KeyEvent.VK_SLASH);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c=='"') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_QUOTE);
                                        robot.keyRelease(KeyEvent.VK_QUOTE);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c==':') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_SEMICOLON);
                                        robot.keyRelease(KeyEvent.VK_SEMICOLON);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c =='<') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_COMMA);
                                        robot.keyRelease(KeyEvent.VK_COMMA);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    } else if (c =='>') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_PERIOD);
                                        robot.keyRelease(KeyEvent.VK_PERIOD);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    }else if (c =='|') {
                                        robot.keyPress(KeyEvent.VK_SHIFT);
                                        robot.keyPress(KeyEvent.VK_BACK_SLASH);
                                        robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                                        robot.keyRelease(KeyEvent.VK_SHIFT);
                                    }
                                    else{
                                        if((int)c >= 65 && (int)c <= 90){
                                            robot.keyPress(KeyEvent.VK_SHIFT);
                                            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                                            robot.keyPress(keyCode);
                                            robot.keyRelease(keyCode);
                                            robot.keyRelease(KeyEvent.VK_SHIFT);
                                        }else {
                                            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                                            robot.keyPress(keyCode);
                                            robot.keyRelease(keyCode);
                                        }
                                    }

                                }

                                //((Timer) e.getSource()).stop(); N \n");" +

                                System.exit(0);}
                        }
                    });
                    timer.start();
                    //JOptionPane.showMessageDialog(null,"Created by Nathamuni");
                }
                catch(Exception exep){

                }
// JOptionPane.showMessageDialog(null,"Created by Nathamuni");
            }
        });
    }


    public static void main(String[] args) {
//        JTextArea textArea = new JTextArea();
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JFrame frame = new JFrame("App");
        frame.setLayout(null);

        frame.setContentPane(new App().panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

