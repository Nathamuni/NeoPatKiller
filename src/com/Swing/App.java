package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class App extends JFrame {

    private JButton button1,clearButton;
    private JPanel panel1;
    private JTextArea textArea;
    private JLabel createdByNathamuniLabel,countdownLabel,countLabel;
    private JLabel labell;
    private JTextField textField1;
    private int count;
    String count1;

    public App() {
        setTitle("Neopat killer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setLayout(new BorderLayout());
        createdByNathamuniLabel = new JLabel("  Created by Nathamuni");
        createdByNathamuniLabel.setFont(new Font("Serif", Font.BOLD, 16));
        panel1.add(createdByNathamuniLabel, BorderLayout.NORTH);
        textArea = new JTextArea(20, 40);



        // Create a scrollable JTextArea

        JScrollPane scrollPane = new JScrollPane(textArea);
        panel1.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel();

        button1.setMnemonic(KeyEvent.VK_S);
        buttonsPanel.add(button1);


        clearButton.setMnemonic(KeyEvent.VK_C);
        buttonsPanel.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        textField1 = new JTextField(8);

        //textField1.setSize(40, 50);
        buttonsPanel.add(textField1);

        countLabel = new JLabel("Enter Countdown value in sec");

        buttonsPanel.add(countLabel);
        panel1.add(buttonsPanel, BorderLayout.SOUTH);

// Add the buttonsPanel to the panel1's SOUTH position


        countdownLabel = new JLabel();
        getContentPane().add(countdownLabel);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    count1 = textField1.getText();
                    count = Integer.parseInt(count1);
                    Thread.sleep(count);

                    countdownLabel.setText(Integer.toString(count));
                    Timer timer = new Timer(1000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            count--;
                            countLabel.setText("Count: " + count);
                            if (count <= 0) {

                                Robot robot = null;
                                try {
                                    robot = new Robot();
                                } catch (AWTException ex) {

                                }
                                String input = textArea.getText();

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
                                    } else if (c=='}') {
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
                                    }else if (c =='\'') {
                                        robot.keyPress(KeyEvent.VK_QUOTE);
                                        robot.keyRelease(KeyEvent.VK_QUOTE);
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
                                    try {
                                        Thread.sleep(10);
                                    } catch (InterruptedException ex) {
                                        ex.printStackTrace();
                                    }
                                }

                                ((Timer) e.getSource()).stop();
//                                System.exit(0);
                            }
                        }
                    });
                    timer.start();
                } catch (Exception exep) {
                    exep.printStackTrace();
                }
            }
        });

        setContentPane(panel1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App();
            }
        });
    }
}
