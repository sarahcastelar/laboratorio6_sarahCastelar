
package lab6_sarahcastelar;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class MundoDisco {
    
    private String nombreTortuga;
    private double pesoTortuga;
    private ArrayList <Criatura> criaturas = new ArrayList();

    public MundoDisco() {
    }

    public MundoDisco(String nombreTortuga, double pesoTortuga) {
        this.nombreTortuga = nombreTortuga;
        this.pesoTortuga = pesoTortuga;
    }

    public String getNombreTortuga() {
        return nombreTortuga;
    }

    public void setNombreTortuga(String nombreTortuga) {
        this.nombreTortuga = nombreTortuga;
    }

    public double getPesoTortuga() {
        return pesoTortuga;
    }

    public void setPesoTortuga(double pesoTortuga) {
        this.pesoTortuga = pesoTortuga;
    }

    public ArrayList<Criatura> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criatura> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return  nombreTortuga;
    }
    
    
    
    
    
    
}
