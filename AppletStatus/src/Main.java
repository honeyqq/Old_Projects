import java.awt.*;
import java.applet.*;


public class Main extends Applet{
    public void paint(Graphics g) {
        g.drawString("This is an applet window.",10,20);
        showStatus("This is shown in the status window.");
    }
}
