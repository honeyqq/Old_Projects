import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MySwingApplet extends JApplet {

    JButton jbtnUp;
    JButton jbtnDown;

    JLabel jlab;

    public void init() {
        try {
            SwingUtilities.invokeAndWait(() -> makeGUI());
        } catch (Exception exc) {
            System.out.println("Can't create because of " + exc);
        }
    }

    private void makeGUI() {
        setLayout(new FlowLayout());

        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");

        jbtnUp.addActionListener(ae -> jlab.setText("You pressed Up"));
        jbtnDown.addActionListener(ae ->jlab.setText("You pressed Down"));

        add(jbtnUp);
        add(jbtnDown);

        jlab = new JLabel("Press a button.");

        add(jlab);
    }
}
