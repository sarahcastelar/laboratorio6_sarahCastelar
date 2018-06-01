/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_sarahcastelar;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Universo {
    
    private String codigo;
    private int edad;
    private double peso;
    private ArrayList <MundoDisco> mundos = new ArrayList();

    public Universo() {
    }

    public Universo(String codigo, int edad, double peso) {
        if (validarCodigo(codigo)) {
           this.codigo = codigo; 
           JOptionPane.showMessageDialog(null, "Su codigo  es alfanumerico.");
        }else
            JOptionPane.showMessageDialog(null, "Su codigo no es alfanumerico."
                    + "\n Debe contener una mayuscula, minuscula y al menos un numero. ");
        this.edad = edad;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (validarCodigo(codigo)) {
           this.codigo = codigo; 
        }else
            JOptionPane.showMessageDialog(null, "Su codigo no es alfanumerico.");
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<MundoDisco> getMundos() {
        return mundos;
    }

    public void setMundos(ArrayList<MundoDisco> mundos) {
        this.mundos = mundos;
    }
    
    public static boolean validarCodigo(String codigo){
         
      if (codigo.matches("[a-zA-z0-9]+")) {
         return true;
      } else {
         return false;
      }
    }
    
    public void pesoUniverso(){
        
    }
    
    
    
}
