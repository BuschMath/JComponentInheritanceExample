import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, World!", 20, 30);
    }
}