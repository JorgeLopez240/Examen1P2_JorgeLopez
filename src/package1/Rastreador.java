
package package1;

public class Rastreador extends Personaje{

    public Rastreador() {
        super();
    }

    public Rastreador(String nombre, int vida, int escudo, Arma arma) {
        super(nombre, vida, escudo, arma);
    }

    @Override
    public void ataque(Personaje personaje) {
        if(personaje instanceof Fortaleza || personaje instanceof Medico){
            super.arma.setDaño(super.arma.getDaño()+(10*super.arma.getDaño())/100);
        }
    }

    

    
    
}
