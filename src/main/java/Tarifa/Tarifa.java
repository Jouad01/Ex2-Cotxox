package Tarifa;

import Carrera.Carrera;

public class Tarifa {
    public final double COSTE_MILLA = 1.35;
    public static final double COSTE_MINUTO = 0.35;
    public final double COSTE_MINIMO = 5;
    public final byte PORCENTAJE_COMISION = 20;

    public double getCosteDistancia(double distancia){
        return distancia * COSTE_MILLA;
    }

    public double getCosteTiempo(int tiempo){
        return tiempo * COSTE_MINUTO;
    }

    public double getCosteTotalEsperado(Carrera Carrera){
        double distanciaPrecio = this.getCosteDistancia(Carrera.getDistancia());
        double tiempoPrecio = this.getCosteTiempo(Carrera.getTiempoEsperado());
        double costeEsperado = distanciaPrecio + tiempoPrecio;
        return costeEsperado >= COSTE_MINUTO? costeEsperado : 5; // ?
    }


}
