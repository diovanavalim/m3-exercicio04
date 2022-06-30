import model.Garagem;
import model.Veiculo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Veiculo fiesta = new Veiculo("Fiesta", "Ford", 1000);
        Veiculo focus = new Veiculo("Focus", "Ford", 1200);
        Veiculo explorer = new Veiculo("Explorer", "Ford", 2500);
        Veiculo uno = new Veiculo("Uno", "Fiat", 500);
        Veiculo cronos = new Veiculo("Cronos", "Fiat", 1000);
        Veiculo torino = new Veiculo("Torino", "Fiat", 1250);
        Veiculo aveo = new Veiculo("Aveo", "Chevrolet", 1250);
        Veiculo spin = new Veiculo("Spin", "Chevrolet", 2500);
        Veiculo corola = new Veiculo("Corola", "Toyota", 1200);
        Veiculo fortuner = new Veiculo("Fortuner", "Toyota", 3000);
        Veiculo logan = new Veiculo("Logan", "Renault", 950);

        ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();

        listaDeVeiculos.add(fiesta);
        listaDeVeiculos.add(focus);
        listaDeVeiculos.add(explorer);
        listaDeVeiculos.add(uno);
        listaDeVeiculos.add(cronos);
        listaDeVeiculos.add(torino);
        listaDeVeiculos.add(aveo);
        listaDeVeiculos.add(spin);
        listaDeVeiculos.add(corola);
        listaDeVeiculos.add(fortuner);
        listaDeVeiculos.add(logan);

        Garagem garagem = new Garagem(8080, listaDeVeiculos);

        System.out.println(String.format("Garagem id %d", garagem.getId()));
        System.out.println("Lista de Veículos, desordenada:");

        for (int i = 0; i < garagem.getListaDeVeiculos().size(); i++) {
            String modelo = garagem.getListaDeVeiculos().get(i).getModelo();
            int preco = garagem.getListaDeVeiculos().get(i).getPreco();
            System.out.println(String.format("Veículo %s, preço %d", modelo, preco));
        }

        System.out.println(" ");

        Stream<Veiculo> listaDeVeiculosStream = listaDeVeiculos.stream();

        List<Veiculo> lista = listaDeVeiculosStream.sorted(Comparator.comparing(Veiculo::getPreco)).collect(Collectors.toList());

        System.out.println("Lista de Veículos, ordenada:");
        lista.forEach((veiculo) -> {
                    System.out.println(String.format("Veículo %s, preço %d", veiculo.getModelo(), veiculo.getPreco()));
                }
        );
    }
}
