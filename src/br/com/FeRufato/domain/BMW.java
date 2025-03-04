package br.com.FeRufato.domain;

public class BMW extends Carro {
    public BMW(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void exibirInfo() {
        System.out.println("BMW: " + getModelo() + " - Ano: " + getAno());
    }
}
