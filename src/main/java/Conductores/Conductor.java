package Conductores;

import java.util.ArrayList;

public class Conductor {

    private String nombre = null;
    private String modelo = null;
    private String matricula = null;
    private double valoracionMedia = 0;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMatricula() {
        return this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size(); // Para saber cuantos elementos hay
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion); // add para añadir un elemento especifico
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        double sumarVarolaciones = 0;
        for (byte valoracion : this.valoraciones) {
            sumarVarolaciones += valoracion;
        }
        this.valoracionMedia = sumarVarolaciones / this.valoraciones.size(); // Dudas
        return valoracionMedia;
    }

    public void setOcupado(boolean ocupado){

        this.ocupado = ocupado;
    }

    public boolean isOcupado(){

        return this.ocupado;
    }
}
