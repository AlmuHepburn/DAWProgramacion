package model;

public class Carrera {

    private Coche piloto;
    private int puntos;
    private int clasificacion;

    public Carrera() {

    }

    public Carrera(Coche piloto, int puntos, int clasificacion) {
        this.piloto = piloto;
        this.puntos = puntos;
        this.clasificacion = clasificacion;
    }

    public Coche getPiloto() {
        return piloto;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setPiloto(Coche coches) {
        this.piloto = piloto;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion= clasificacion;
    }
}
