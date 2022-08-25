package co.edu.cue.practica2.services;

import co.edu.cue.practica2.model.Juguete;

public interface Toy {
    public abstract Juguete crearJuguete(String nombre, double precio, int cantidad,String material);
    public abstract Juguete modificarExistencia(Juguete[] juguetes, int cantidad, String nombre);
    public abstract Juguete juguetesPorTipo(Juguete[] juguetes);
    public abstract Juguete informeValorTotal(Juguete[] juguetes);
    public abstract Juguete informeTipoJuguete(Juguete[] juguetes);
    public abstract Juguete informeTipoJugueteMenor(Juguete[] juguetes);

}

