/**
 * Created by jc445081 on 3/09/18.
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class JBookQuote extends JFrame {
    FlowLayout Fly = new FlowLayout();
    JLabel label1 = new JLabel("AAAA ");
    JLabel label2 = new JLabel(" BBBBB ");
    public JBookQuote()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(Fly);
        add(label1);
        add(label2);
    }
    public static void main(String[] args)
    {
        JBookQuote Jbq = new JBookQuote();
        Jbq.setSize(200, 100);
        Jbq.setVisible(true);
    }

}
