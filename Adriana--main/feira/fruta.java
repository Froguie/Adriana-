package feira;

public class Fruta {
    private String nome;
    private String tipo;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    //Mostrar informações da fruta desejada na tela
    public void exibirEstoque() {
    	System.out.println("Fruta: " + nome);
      System.out.println("\Tipo: " + tipo);
      System.out.println("\nQuantidade: " + quantidade);
    }
    public void adicionarQuantidade(int qtd) {
    this.quantidade += qtd;
}
    public void adicionarFruta(String nome, String tipo, int quantidade) {
    this.nome = nome;
    this.tipo = tipo;
    this.quantidade = quantidade;
}
}
