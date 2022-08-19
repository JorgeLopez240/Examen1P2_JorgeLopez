
package package1;

import java.util.Random;

public class Arma {

    //Random r = new Random();
    
    private String nombre;
    private int daño;
    private int precision;//=r.nextInt(100);

    public Arma() {
    }

    public Arma(String nombre) {
        this.nombre = nombre;
    }
    
    public Arma(String nombre, int daño, int presicion) {
        this.nombre = nombre;
        this.daño = daño;
        this.precision=presicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
