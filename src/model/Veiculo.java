package model;

public class Veiculo {
    private String modelo;
    private String marca;
    private int preco;

    public Veiculo(String modelo, String marca, int preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
