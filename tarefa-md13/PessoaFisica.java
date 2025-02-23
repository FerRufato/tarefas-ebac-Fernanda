public class PessoaFisica extends Pessoa {
    private String cpf;
    private String dataNascimento;

    // Construtor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf, String dataNascimento) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Implementando o método abstrato
    @Override
    public void exibirInformacoes() {
        System.out.println("Pessoa Física: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
    }
}
