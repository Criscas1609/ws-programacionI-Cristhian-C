package co.edu.cue.proyecto;

public class Empleado {

    private int codigo;
    private String nombre;
    private String correo;
    private int añosDeAntiguedad;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAñosDeAntiguedad() {
        return añosDeAntiguedad;
    }

    public void setAñosDeAntiguedad(int añosDeAntiguedad) {
        this.añosDeAntiguedad = añosDeAntiguedad;
    }

    public Empleado(int codigo, String nombre, String correo, int añosDeAntiguedad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.añosDeAntiguedad = añosDeAntiguedad;
    }
}
