import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// import java.awt.image.ImageObserver;
// import java.text.AttributedCharacterIterator;
import java.util.Timer;

public class login1 implements ActionListener
{
    JProgressBar p;
    JPanel panel;
    JPanel panel1;
    JFrame frame;
    JFrame frame1;
    JLabel userLabel;
    JTextField userText;
    JLabel passwordLabel ;
    JPasswordField passwordText;
    JButton button;
    JButton button1;
    JButton button2;
    JButton button3;
    JLabel success;
    JLabel success1;
    JLabel l;
    JLabel pathLabel;
    JTextField pathText;
    Timer t;

    public login1 ()
    {

        panel = new JPanel();
        frame = new JFrame();

        frame.setSize(3000,2000);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        frame.setTitle("Welcome");
        panel.setLayout(null);
        
        java.awt.Image icon = Toolkit.getDefaultToolkit().getImage("D:/GUI/lime logo 3.2.png");  
        frame.setIconImage(icon);  
        frame.setLayout(null);    
        frame.setVisible(true);

        userLabel = new JLabel("Enter Username");
        userLabel.setBounds(10,20,180,25);
        panel.add(userLabel);
        frame.setVisible(true);
                
        userText = new JTextField(20);
        userText.setBounds(200,20,365,25);
        panel.add(userText);
        frame.setVisible(true);
        
        passwordLabel = new JLabel("Enter Password");
        passwordLabel.setBounds(10,50,180,25);
        panel.add(passwordLabel);
        frame.setVisible(true);
        
        passwordText = new JPasswordField();
        passwordText.setBounds(200,50,365,25);
        panel.add(passwordText);
        frame.setVisible(true);
        
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(this);
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.add(panel);
        frame.setVisible(true);

    }

    public static void main(String[] args)
    {
       new login1();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
        {
            if(e.getSource()==button)
            {
            String user = userText.getText();
            String password = passwordText.getText();
           // System.out.println(user+", "+password);
        
            if(user.equals("Anubha") && password.equals("123456"))
            {
                success.setText("Login successful"); 

                frame.setVisible(true);
                
                frame.setSize(3000,2000);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.add(panel);
                frame.setTitle("Give Pathname");
                panel.setLayout(null);
                
                //frame1.setSize(2000,2000);
                pathLabel = new JLabel("Enter Pathname");
                pathLabel.setBounds(10,140,180,25);
                panel.add(pathLabel);
                frame.setVisible(true);

                pathText = new JTextField(20);
                pathText.setBounds(200,140,365,25);
                panel.add(pathText);
                frame.setVisible(true);

                button1 = new JButton("browse");
                button1.setBounds(600, 140, 80, 25);
                button1.addActionListener(this);
                panel.add(button1);
                frame.setVisible(true);

                button2 = new JButton("reset");
                button2.setBounds(700, 140, 80, 25);
                button2.addActionListener(this);
                panel.add(button2);
                frame.setVisible(true);

                button3 = new JButton("submit");
                button3.setBounds(800, 140, 80, 25);
                button3.addActionListener(this);
                panel.add(button3);
                frame.setVisible(true);
            }
            else
            {
                success.setText("Either Username or password is incorrect");
            }
            }

            if(e.getSource()==button1)
            {
            l = new JLabel("no file selected");
            JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int r = j.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION)
            {
                l.setText(j.getSelectedFile().getAbsolutePath());
                pathText.setText(l.getText());
                frame.setVisible(true);
            }
            else
                l.setText("the user cancelled the operation"); 
            }

            if(e.getSource()==button2)
            {
                pathText.setText("");
            }

            if(e.getSource()==button3)
            {
                button3 = new JButton("");
                button3.setBounds(800, 140, 20, 25);
                // p = new JProgressBar();
                // p.setValue(0);
                // p.setStringPainted(true);
                // panel1.add(p);
                // frame1.add(panel1);
                // frame1.setSize(300,300);
                // frame1.setBackground(Color.YELLOW);
                frame.add(panel);
                frame.setVisible(true);
            }
        }

}