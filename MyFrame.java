import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("MyFrame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyComponent myComponent = new MyComponent();
        add(myComponent);
        MyButton myButton = new MyButton("Click me!");
        add(myButton);
    }
}
