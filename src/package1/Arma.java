
package package1;

import java.util.Random;

public class Arma {

    Random r = new Random();
    
    private String nombre;
    private int daño;
    private int precision=r.nextInt(100);

    public Arma() {
    }

    public Arma(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;
    }

    public String getArma() {
        return nombre;
    }

    public void setArma(String arma) {
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
        return "Arma{" + "nombre=" + nombre + ", da\u00f1o=" + daño + ", precision=" + precision + '}';
    }
    
    
    
}
