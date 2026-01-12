package model;

public class Coche {

    private String marca, modelo;
    private int km;

    public Coche(){

    }

    public Coche(String marca, String modelo, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
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
}
