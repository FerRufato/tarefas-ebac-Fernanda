public class Teste {
    public static void main(String[] args) {
    
        PessoaFisica pf = new PessoaFisica("João Silva", "Rua X, 123", "1234-5678", "123.456.789-00", "01/01/1980");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "Av. Y, 456", "9876-5432", "12.345.678/0001-99", "Empresa X LTDA");

    
        pf.exibirInformacoes();
        System.out.println();
        pj.exibirInformacoes();
    }
}
