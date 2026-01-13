package model;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Carrera> numCarreras;

    public Campeonato(ArrayList<Carrera> numCarreras) {
        this.numCarreras = numCarreras;
    }

    public ArrayList<Carrera> getNumCarreras() {
        return numCarreras;
    }

    public void setNumCarreras(ArrayList<Carrera> numCarreras) {
        this.numCarreras = numCarreras;
    }
}




