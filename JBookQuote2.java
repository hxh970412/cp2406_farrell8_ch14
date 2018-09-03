import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by jc445081 on 3/09/18.
 */
public class JBookQuote2 extends JFrame implements ActionListener{
    FlowLayout JFm = new FlowLayout();
    JLabel lab1 = new JLabel("AAAAA");
    JLabel lab2 = new JLabel("BBBBBB");
    JButton but1 = new JButton("Show the book title");
    JLabel lab3 = new JLabel("VCVVVV");

    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        but1.addActionListener(this);
        setLayout(JFm);
        add(lab1);
        add(lab2);
        add(but1);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent e)
     {
        add(lab3);
         validate();
         repaint();
     }
    public static void main(String[] args)
    {
        JBookQuote2 JBQ2 = new JBookQuote2();
        JBQ2.setSize(200, 100);
        JBQ2.setVisible(true);
    }
}
