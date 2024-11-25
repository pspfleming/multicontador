package fp.dam.multicontador;

import javax.swing.*;
import java.util.LinkedList;

public class Main extends LinkedList<Contador> {

    private final JFrame frame = new JFrame("Multicontador");
    private final Contador global;

    Main(int n) {
        if (n < 1 || n > 10)
            throw new IllegalArgumentException("El número de contadores debe estar entre 1 y 10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = (JPanel) frame.getContentPane();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        for (int i=0; i<n; i++)
            this.add((Contador) p.add(new ContadorParcial(0, this)));
        p.add(global = new ContadorGlobal(0, this));
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void incrementar() {
        global.incrementar(null);
    }

    public void descontar(int n) {
        global.descontar(n);
    }

    public void reset() {
        forEach(c -> c.reset(null));
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(() -> new Main(5).show());
    }

}
