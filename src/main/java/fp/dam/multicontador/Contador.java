package fp.dam.multicontador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Contador extends JPanel {

    protected int n;
    protected final Main main;
    protected final JButton reset;
    protected final JButton inc;
    private final JTextField text;

    public Contador(int n, Main main) {
        this.n = n;
        this.main = main;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(Color.BLACK, 1),
                        BorderFactory.createEmptyBorder(5, 5, 5, 5)
                )
        ));
        reset = new JButton("Reset");
        reset.addActionListener(this::reset);
        add(reset);
        text = new JTextField(String.valueOf(n), 10);
        text.setEditable(false);
        text.setHorizontalAlignment(JTextField.CENTER);
        add(text);
        inc = new JButton("+");
        inc.addActionListener(this::incrementar);
        add(inc);
    }

    public void incrementar(ActionEvent e) {
        text.setText(String.valueOf(++n));
    }

    public void descontar(int n) {
        text.setText(String.valueOf(this.n -= n));
    }

    public void reset(ActionEvent e) {
        text.setText(String.valueOf(n = 0));
    }

}
