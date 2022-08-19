
package package1;

public class Personaje {
    
    private String nombre; 
    private int vida;
    private int escudo;
    private String arma;
    private String tipo;

    public Personaje() {
    }

    public Personaje(String nombre, int vida, int escudo, String arma, String tipo) {
        this.nombre = nombre;
        this.vida = vida;
        this.escudo = escudo;
        this.arma = arma;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", vida=" + vida + ", escudo=" + escudo + ", arma=" + arma + ", tipo=" + tipo + '}';
    }
    
    
    
}
