
package package1;

import java.util.Random;

public class Arma {

    Random r = new Random();
    
    private String arma;
    private int daño;
    private int precision=r.nextInt(100);

    public Arma() {
    }

    public Arma(String arma, int daño) {
        this.arma = arma;
        this.daño = daño;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
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
        return "Arma{" + "arma=" + arma + ", da\u00f1o=" + daño + ", precision=" + precision + '}';
    }
    
    
    
}
