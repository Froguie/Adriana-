package farmacia;

public class Funcionario {

	private String nome;
	private String cargo;
	private int idade;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getCargo() {
		return cargo;
	}
	public int getIdade() {
		return idade;
	}
    public void mostrarinfo () {
    	System.out.println("Funcionário: " + nome);
        System.out.println("\nCargo: " + cargo);
        System.out.println("\nIdade: " + idade);
    }

    public void inicio_turno() {
			System.out.println(nome + " iniciou o turno.");
		}
}

