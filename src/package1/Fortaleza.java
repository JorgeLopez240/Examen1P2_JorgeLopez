
package package1;

public class Fortaleza extends Personaje{

    public Fortaleza() {
        super();
    }

    public Fortaleza(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public void ataque(Personaje personaje) {
        if(personaje instanceof Medico){
            super.arma.setDaño(super.arma.getDaño()+(10*super.arma.getDaño())/100);
        }
    }
    
    
}
