package baraja.espaniola;

import baraja.Carta;

public class CartaEspaniola extends Carta<PalosBarajaEspaniola> {

    public CartaEspaniola(int numero, PalosBarajaEspaniola palo) {
        super(numero, palo);
    }

    public CartaEspaniola() {
    }

    @Override
    public String toString() {

        String estado = "";
        String nombreFigura = "";

        switch (numero) {
            case 1:
                nombreFigura = "As";
                break;
            case 10:
                nombreFigura = "Sota";
                break;
            case 11:
                nombreFigura = "Caballo";
                break;
            case 12:
                nombreFigura = "Rey";
                break;
            default:
                nombreFigura = numero + "";
        }

        estado = nombreFigura + " de " + palo;

        return estado;

    }

}
