
package lab6_sarahcastelar;

import java.util.ArrayList;

public class Criatura {
    
    
    private String nombreRaza;
    private int numeroEnergia;
    private int maximoAnios;
    private String nombreRegion;
    private int cantidadVivos;
    private double pesoCriatura;
    private ArrayList nombresObjetos = new ArrayList();

    public Criatura() {
    }

    public Criatura(String nombreRaza, int numeroEnergia, int maximoAnios, String nombreRegion, int cantidadVivos) {
        this.nombreRaza = nombreRaza;
        this.numeroEnergia = numeroEnergia;
        this.maximoAnios = maximoAnios;
        this.nombreRegion = nombreRegion;
        this.cantidadVivos = cantidadVivos;
    }

    public double getPesoCriatura() {
        return pesoCriatura;
    }

    public void setPesoCriatura(double pesoCriatura) {
        this.pesoCriatura = pesoCriatura;
    }

    
    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public int getNumeroEnergia() {
        return numeroEnergia;
    }

    public void setNumeroEnergia(int numeroEnergia) {
        this.numeroEnergia = numeroEnergia;
    }

    public int getMaximoAnios() {
        return maximoAnios;
    }

    public void setMaximoAnios(int maximoAnios) {
        this.maximoAnios = maximoAnios;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public int getCantidadVivos() {
        return cantidadVivos;
    }

    public void setCantidadVivos(int cantidadVivos) {
        this.cantidadVivos = cantidadVivos;
    }

    public ArrayList getNombresObjetos() {
        return nombresObjetos;
    }

    public void setNombresObjetos(ArrayList nombresObjetos) {
        this.nombresObjetos = nombresObjetos;
    }

    @Override
    public String toString() {
        return  nombreRaza;
    }
    
    
    
    
}
