package br.com.FeRufato.domain;

public class Nissan extends Carro {
    public Nissan(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nissan: " + getModelo() + " - Ano: " + getAno());
    }
}
