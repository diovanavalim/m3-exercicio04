package model;

import java.util.ArrayList;

public class Garagem {
    private int id;
    private ArrayList<Veiculo> listaDeVeiculos;

    public Garagem(int id, ArrayList<Veiculo> listaDeVeiculos) {
        this.id = id;
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public int getId() {
        return this.id;
    }

    public ArrayList<Veiculo> getListaDeVeiculos() {
        return this.listaDeVeiculos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListaDeVeiculos(ArrayList<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }
}
