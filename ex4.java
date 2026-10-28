import javax.swing.*;
import java.awt.*;
public class ex4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Metric COnversion");
        JLabel jl = new JLabel("Centimeter");
        f.setLayout(new FlowLayout());
        
        
        JTextField inp1 = new JTextField(10);
        
        JButton btn = new JButton("Convert");
        JLabel res = new JLabel();

        btn.addActionListener(e->{
            double cm = Double.parseDouble(inp1.getText());
            double inch = cm/2.54;
            res.setText(String.format("%.2f", inch)+"inch");
        });
        
        
        f.add(inp1);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(100, 75);
        f.add(btn);
        f.add(res);
        f.setVisible(true);
    }
}
