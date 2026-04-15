package salao;

public class Corte {

	private String tipo;
	private double preco;
  
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo() {
		return tipo;
	}
	public double getPreco() {
		return preco;
	}
    public void mostrarinfo () {
    	System.out.println("Funcionário: " + tipo);
        System.out.println("\ndouble: " + preco);
    }
}
