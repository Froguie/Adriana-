package feira;


public class Cliente {
    private String nome;
    private int idade;
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
    public void mostrarinfo() {
	    System.out.println("Nome: "+nome);
	    System.out.println("\nTelefone: "+telefone);
	}
}
