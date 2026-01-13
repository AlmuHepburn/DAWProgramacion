package model;

public class Coche {

    private String marca, modelo;
    private int km;
    private int dorsal;

    public Coche(){

    }

    public Coche(String marca, String modelo, int km, int dorsal) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.dorsal = dorsal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
