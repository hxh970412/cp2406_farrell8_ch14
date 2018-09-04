import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JFRAMEDisableButton extends JFrame implements ActionListener {
    Container con = getContentPane();
    JButton button = new JButton("Click");
    public JFRAMEDisableButton()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setDefaultCapable(false);
    }
    public static void main(String[] args)
    {
        JFRAMEDisableButton frame = new JFRAMEDisableButton();
    }
}
