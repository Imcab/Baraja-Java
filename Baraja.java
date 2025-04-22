package Record; //Cambiar a la ruta del proyecto

import java.util.ArrayList;
import java.util.List;

public class Baraja {

    public enum Palos{
        CORAZONES,
        DIAMANTES,
        TREBOLES,
        PICAS;
    }

    public enum ValorCartas{
        AS(1),
        DOS(2),
        TRES(3),
        CUATRO(4),
        CINCO(5),
        SEIS(6),
        SIETE(7),
        OCHO(8),
        NUEVE(9),
        DIEZ(10),
        J(11),
        Q(12),
        K(13);

        private int valor;

        ValorCartas(int valor){
            this.valor = valor;
        }

        public int valorCarta(){
            return valor;
        }
    }

    private Baraja() {} //Evita instanciarlo

    public record Carta(ValorCartas valor, Palos palo){
        public void jugar(){
            System.out.println("Se ha jugado la carta: " + valor + " de " + palo);
        }
    }

    public static List<Baraja.Carta> crearBarajaCompleta() {
        List<Baraja.Carta> baraja = new ArrayList<>();
        for (Baraja.ValorCartas valor : Baraja.ValorCartas.values()) {
            for (Baraja.Palos palo : Baraja.Palos.values()) {
                baraja.add(new Baraja.Carta(valor, palo));
            }
        }
        return baraja;
    }

}
