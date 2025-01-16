package func;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        func funcionario = new func(1000.00, "nome");

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Salario: " + funcionario.salario);

    }
}
