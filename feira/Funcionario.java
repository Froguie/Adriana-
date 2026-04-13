package feira;
public class Funcionario {
	private String nome;
	private time horario;
	private int idade;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCargo(time horario) {
		this.horario = horario;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public time getHorario() {
		return horario;
	}
	public int getIdade() {
		return idade;
	}
    public void mostrarinfo () {
    	System.out.println("Funcionário: " + nome);
        System.out.println("\nHorario: " + horario);
        System.out.println("\nIdade: " + idade);
    }
}
