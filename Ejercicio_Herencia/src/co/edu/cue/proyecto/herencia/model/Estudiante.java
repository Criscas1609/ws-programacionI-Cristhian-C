package co.edu.cue.proyecto.herencia.model;

public class Estudiante extends Persona {
    public Estudiante(){
        super();
    }
    private String puntaje;

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

}
