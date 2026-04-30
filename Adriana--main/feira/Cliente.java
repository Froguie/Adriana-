package feira;


public class Cliente {
    private String nome;
    private String telefone;
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void buscarinfo() {
	    System.out.println("Nome: "+nome);
	    System.out.println("\nTelefone: "+telefone);
	}
	public void atualizarTelefone(String novoTelefone) {
    System.out.println("Telefone de " + nome + " atualizado de " + telefone + " para " + novoTelefone);
    this.telefone = novoTelefone;
}
	public void cadastrarInfo(String novoNome, int novaIdade) {
    this.nome = novoNome;
    this.idade = novaIdade;
    
}
}
