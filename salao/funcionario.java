package salao;

public class Funcionario {

	private String nome;
	private String funcao;
	private int idade;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(String funcao) {
		this.funcao = funcao;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public int getIdade() {
		return idade;
	}
    public void mostrarinfo () {
    	System.out.println("Funcionário: " + nome);
        System.out.println("\nFuncao: " + funcao);
        System.out.println("\nIdade: " + idade);
    }

    public void inicio_turno() {
			System.out.println(nome + " iniciou o turno.");
		}
}
