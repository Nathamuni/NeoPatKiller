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
        setSize(450,300);
        setLocationRelativeTo(null);

//
//
//
//        getContentPane().add(countdownLabel);
//
//        count = 10;
//        countdownLabel.setText(Integer.toString(count));
//
//        Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                count--;
//                countdownLabel.setText(Integer.toString(count));
//
//                if (count == 0) {
//                    ((Timer) e.getSource()).stop();
//                    JOptionPane.showMessageDialog(null, "Time's up!");
//                    System.exit(0);
//                }
//            }
//        });
//        timer.start();
//
//        setSize(500, 800);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//




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
                                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                                    robot.keyPress(keyCode);
                                    robot.keyRelease(keyCode);
                                }

                                ((Timer) e.getSource()).stop();
                                System.exit(0);
                            }
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
        frame.setLayout(new FlowLayout());
JTextArea ta = new JTextArea(10,15);

JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

frame.add(sp);
        frame.setContentPane(new App().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
