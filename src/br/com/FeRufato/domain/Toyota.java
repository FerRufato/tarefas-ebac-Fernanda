package br.com.FeRufato.domain;

public class Toyota extends Carro {
    public Toyota(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Toyota: " + getModelo() + " - Ano: " + getAno());
    }
}
