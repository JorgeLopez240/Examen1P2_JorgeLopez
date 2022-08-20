
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
    public void ataque(Personaje personaje) {
        if(personaje instanceof Rastreador){
            super.arma.setDaño(super.arma.getDaño()+(5*super.arma.getDaño())/100);
        }
    }
    
}
