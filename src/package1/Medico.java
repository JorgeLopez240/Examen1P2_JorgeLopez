
package package1;

import java.util.Random;



public class Medico extends Personaje{

    Random r = new Random();
    
    public Medico() {
        super();
    }

    public Medico(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public void defensa() {
        int ran =1+r.nextInt(10);
        int p= (ran*super.vida)/100;
        super.vida+=p;
    }
    
}
