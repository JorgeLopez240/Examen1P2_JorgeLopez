
package package1;

public class Fortaleza extends Personaje{

    public Fortaleza() {
        super();
    }

    public Fortaleza(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public void defensa() {
        int p = (15*super.vida)/100;
        super.vida+=p;
    }
    
}
