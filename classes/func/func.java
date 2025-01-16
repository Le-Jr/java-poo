package func;

import java.util.Scanner;

/**
 * func
 */
public class func {
    public String nome;
    public double salario;

    public func(double salario, String nome) {
        Scanner leitor = new Scanner(System.in);
        this.nome = leitor.nextLine();
        leitor.close();

        this.salario = salario;
    }

}
