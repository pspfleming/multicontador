package fp.dam.multicontador;

import java.awt.event.ActionEvent;

public class ContadorGlobal extends Contador {

    public ContadorGlobal(int n, Main main) {
        super(n, main);
        inc.setVisible(false);
    }

    @Override
    public void reset(ActionEvent e) {
        main.reset();
    }

}
