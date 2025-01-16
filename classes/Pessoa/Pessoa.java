package Pessoa;

/**
 * Pessoa
 */
public class Pessoa {
    public String nome;
    public double peso;
    public double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public void calcImc() {

        double imc;
        imc = this.peso / (this.altura * this.altura);
        System.out.println("O IMC de " + this.nome + " é: " + imc);

    }

}
