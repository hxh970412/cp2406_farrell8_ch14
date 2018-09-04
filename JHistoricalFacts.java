import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Change!");
    JLabel label1 = new JLabel("AAAA");
    JLabel label2 = new JLabel("BBBB");
    JLabel label3 = new JLabel("BBBBB");
    JLabel label4 = new JLabel("GGGGGG");
    JLabel label5 = new JLabel("HHHHHH");
    int counter = 0;
    public JHistoricalFacts()
    {
        super("Fact");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        add(label1);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++counter;
        if (counter == 5)
        {
            counter = 0;
        }
        if (counter == 1)
        {
            remove(label1);
            add(label2);
        }
        else
        {
            if (counter == 2)
            {
                remove(label2);
                add(label3);
            }
            else
            {
                if (counter == 3)
                {
                    remove(label3);
                    add(label4);
                }
                else
                {
                    if (counter == 4)
                    {
                        remove(label4);
                        add(label5);
                    }
                    else
                    {
                        remove(label5);
                        add(label1);
                    }
                }
            }
        }
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JHistoricalFacts Jhf = new JHistoricalFacts();
        Jhf.setSize(300, 300);
        Jhf.setVisible(true);
    }
}
