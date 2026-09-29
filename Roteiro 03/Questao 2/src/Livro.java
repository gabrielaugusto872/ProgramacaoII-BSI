public class Livro {
    String nome;
    String autor;
    int ano;
    String descricao;
    int preco;

    public Livro(String nome, String autor, int ano, String descricao, int preco) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$ " + preco);
        System.out.println("---------------------------");
    }
}