import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEnd {
    private JFrame  jFrame;
    private JPanel  jPanel;
    private JLabel  enterTextLabel,enterShiftValLabel;
    private JButton encodeButton, decodeButton, clearButton;
    private JTextField message,shift,cipherMessage;

    private CaesarCipher caesarCipher = new CaesarCipher();

    public FrontEnd() {
        createUIComponents();
    }

    private void createUIComponents() {
        jFrame = new JFrame();
        jPanel = new JPanel();
        encodeButton = new JButton("Encode");
        decodeButton = new JButton("Decode");
        clearButton = new JButton("Clear");
        enterTextLabel = new JLabel();
        enterShiftValLabel = new JLabel();
        message = new JTextField();
        shift = new JTextField();
        cipherMessage = new JTextField();

        //Labels configuration
        enterTextLabel.setText("Enter Your Message :");
        enterTextLabel.setBounds(10,20,150,25);
        enterShiftValLabel.setText("Enter Shift Value :");
        enterShiftValLabel.setBounds(10,50,150,25);

        //Text Fields configuration
        message.setBounds(160,20,250,25);
        shift.setBounds(160,50,50,25);
        cipherMessage.setBounds(15,140,470,100);

        //Buttons configuration
        encodeButton.setBounds(70,90,80,25);
        encodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               cipherMessage.setText( caesarCipher.encode(message.getText(), Integer.parseInt(shift.getText())));
            }
        });

        decodeButton.setBounds(200,90,80,25);
        decodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cipherMessage.setText( caesarCipher.decode(message.getText(), Integer.parseInt(shift.getText())));
            }
        });

        clearButton.setBounds(330,90,80,25);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                message.setText("");
                shift.setText("");
                cipherMessage.setText("");
            }
        });

        //Panel configuration
        jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        jPanel.setLayout(null);
        jPanel.add(enterTextLabel);
        jPanel.add(enterShiftValLabel);
        jPanel.add(message);
        jPanel.add(shift);
        jPanel.add(cipherMessage);
        jPanel.add(encodeButton);
        jPanel.add(decodeButton);
        jPanel.add(clearButton);

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
