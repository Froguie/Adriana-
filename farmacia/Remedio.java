package farmacia;


public class Remedio{
  private String marca;
  private double preco;
  private String nome;
  private String mg;

  public Remedio (String marca, double preco, String nome, String mg ){
    this.marca = marca;
    this.preco = preco;
    this.nome = nome;
    this.mg = mg;
  }

  public String getMarca(){
    return marca;
    }
    public void setMarca(String marca){
      this.marca = marca;
    }

    public String getNome(){
      return nome;
    }

    public void setNome(String nome){
      this.nome = nome;
    }

    public String getMg(){
      return mg;
    }
    public void setMg(String mg){
      this.mg = mg;
    }
    public double getPreco(){
      return preco;
    }

    public void setPreco(double preco){
      this.preco = preco;
    }
public void aplicarDesconto(double porcentagem) {
    preco -= preco * (porcentagem / 100);
}
	public void atualizarPreco(double valor) {
    preco = valor;
}
    
}



