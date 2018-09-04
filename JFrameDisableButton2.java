import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 extends JFrame implements ActionListener {
    int clicktime = 0;
    final int MaxTime = 8;
    Container con = getContentPane();
    JButton button = new JButton("Click");
    JLabel label = new JLabel("That's enough!");
    public JFrameDisableButton2()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
        con.add(button);
        con.add(label);
        label.setVisible(false);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ++clicktime;
        if (clicktime == MaxTime)
        {
            button.setVisible(false);
            label.setVisible(true);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }

}
