import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex5 implements ActionListener {
    JFrame f;
    JTextField jt;
    String inp = "";
    String op;
    double num1, num2, res;

    public ex5() {
        f = new JFrame("Simple Calculator");
        jt = new JTextField(10);
        f.setLayout(new BorderLayout());
        f.add(jt, BorderLayout.NORTH);

        JPanel jp = new JPanel(new GridLayout(4, 4));
        String[] bl = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/" };
        JButton[] btn = new JButton[bl.length];

        for (int i = 0; i < bl.length; i++) {
            btn[i] = new JButton(bl[i]);
            btn[i].addActionListener(this);
            jp.add(btn[i]);
        }
        f.add(jp, BorderLayout.CENTER);
        f.setSize(300, 350);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ((JButton) ae.getSource()).getText();

        if (cmd.matches("[0-9]")) {
            inp = inp + cmd;
            jt.setText(inp);
        }
        if (cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(inp);
            op = cmd;
            inp = "";
        }
        if (cmd.equals("=")) {
            num2 = Double.parseDouble(inp);

            switch (op) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "*":
                    res = num1 * num2;
                    break;
                case "/":
                    res = num1 / num2;
                    break;
                default:
                    break;
            }
            jt.setText("" + res);
            inp = String.valueOf(res);
        }
        if (cmd.equals("C")) {
            inp = "";
            op = null;
            num1 = 0;
            num2 = 0;
            res = 0;
            jt.setText("");

        }
    }

    public static void main(String[] args) {
        new ex5();
    }
}