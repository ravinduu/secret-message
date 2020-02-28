package gui;

import javax.swing.*;
import java.awt.*;

public class FrontEnd {
    private JFrame  jFrame;
    private JPanel  jPanel;
    private JLabel  enterTextLabel,enterShiftValLabel;
    private JButton encodeButton, decodeButton;
    private JTextField message,shift;

    public FrontEnd() {
        createUIComponents();
    }

    private void createUIComponents() {
        jFrame = new JFrame();
        jPanel = new JPanel();
        encodeButton = new JButton("Encode");
        decodeButton = new JButton("Decode");
        enterTextLabel = new JLabel();
        enterShiftValLabel = new JLabel();
        message = new JTextField();
        shift = new JTextField();

        //Labels configuration
        enterTextLabel.setText("Enter Your Message :");
        enterTextLabel.setBounds(10,20,150,25);
        enterShiftValLabel.setText("Enter Shift Value :");
        enterShiftValLabel.setBounds(10,50,150,25);

        //Text Fields configuration
        message.setBounds(160,20,250,25);
        shift.setBounds(160,50,50,25);

        //Buttons configuration
        encodeButton.setBounds(20,90,80,25);
        decodeButton.setBounds(150,90,80,25);

        //Panel configuration
        jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        jPanel.setLayout(null);
        jPanel.add(enterTextLabel);
        jPanel.add(enterShiftValLabel);
        jPanel.add(message);
        jPanel.add(shift);
        jPanel.add(encodeButton);
        jPanel.add(decodeButton);

//        jPannel.setVisible(true);
//        jPannel.add(enterTextLable);

        //frame configuration
        jFrame.getContentPane();
        jFrame.setSize(500,300);
        jFrame.add(jPanel,BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Secret Messages");
        jFrame.setVisible(true);
    }
}
