package Veiculo;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.locomover();

        Moto moto = new Moto();
        moto.locomover();

        Carro carro = new Carro();
        carro.locomover();

    }
}
