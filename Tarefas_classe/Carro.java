
// Classe 
public class Carro {

    // Propriedades 

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    // Construtor da classe

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; 
    }

    // Método para ligar o carro

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado, não é necessário ligar novamente.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método de informações

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Método principal 

    public static void main(String[] args) {

        // Instanciando um objeto da classe Carro
   
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

        // Chamando os métodos

        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.desligar();
    }
}
