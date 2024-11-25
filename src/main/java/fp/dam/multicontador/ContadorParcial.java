package fp.dam.multicontador;

import java.awt.event.ActionEvent;

public class ContadorParcial extends Contador {

    public ContadorParcial(int n, Main main) {
        super(n, main);
    }

    @Override
    public void incrementar(ActionEvent e) {
        super.incrementar(e);
        main.incrementar();
    }

    @Override
    public void reset(ActionEvent e) {
        main.descontar(n);
        super.reset(e);
    }

}
