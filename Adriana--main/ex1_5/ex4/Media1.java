package ex_Adriana1.ex4;

public class Media1 {
    public int soma;
    public int jan;
    public int fev;
    public int mar;
    public float media;

    public Media1() {
        jan = 15000;
        fev = 23000;
        mar = 17000;
        soma = (jan + fev + mar);
        media = soma / 3;
        System.out.printf("A soma de gastos eh: ", soma);
        System.out.printf("A media de gastos eh: ", media);
    }
}
