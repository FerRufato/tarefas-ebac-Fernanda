package br.com.FeRufato.domain;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T extends Carro> {
    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibirCarros() {
        for (T carro : carros) {
            carro.exibirInfo();
        }
    }
}
