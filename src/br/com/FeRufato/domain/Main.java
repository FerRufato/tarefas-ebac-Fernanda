package br.com.FeRufato.domain;

public class Main {
    public static void main(String[] args) {

        ListaCarros<Carro> lista = new ListaCarros<>();


        Honda civic = new Honda("Civic", 2022);
        Toyota corolla = new Toyota("Corolla", 2023);
        Chevrolet onix = new Chevrolet("Onix", 2021); // Novo carro
        BMW x5 = new BMW("X5", 2020); // Novo carro
        Nissan altima = new Nissan("Altima", 2022); // Novo carro


        lista.adicionarCarro(civic);
        lista.adicionarCarro(corolla);
        lista.adicionarCarro(onix);  // Adicionando Chevrolet
        lista.adicionarCarro(x5);    // Adicionando BMW
        lista.adicionarCarro(altima); // Adicionando Nissan

        // Exibindo os carros na lista
        System.out.println("Lista de Carros:");
        lista.exibirCarros();
    }
}
