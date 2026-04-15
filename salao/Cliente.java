package salao;


public class Cliente {
    private String nome;
    private int idade;
    private String telefone;


    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void mostrarinfo() {
	    System.out.println("Nome: "+nome);
	    System.out.println("\nTelefone: "+telefone);
	    System.out.println("\nIdade: "+idade);
	}
	public void atualizarTelefone(String novoTelefone) {
    System.out.println("Telefone de " + nome + " atualizado de " + telefone + " para " + novoTelefone);
    this.telefone = novoTelefone;
}
	
}
