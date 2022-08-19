
package package1;

public class Jugador {

    private String usuario;
    private int id;
    private String contraseña;
    private Personaje personaje;

    public Jugador() {
    }

    public Jugador(String usuario, int id, String contraseña) {
        this.usuario = usuario;
        this.id = id;
        this.contraseña = contraseña;
    }

    
    
    public Jugador(String usuario, int id, String contraseña, Personaje personaje) {
        this.usuario = usuario;
        this.id = id;
        this.contraseña = contraseña;
        this.personaje = personaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + "usuario=" + usuario + ", id=" + id + ", contrase\u00f1a=" + contraseña + ", personaje=" + personaje + '}';
    }
    
    
    
}
