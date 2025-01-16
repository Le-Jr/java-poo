package Camiseta;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Camiseta camisaP = new Camiseta();
        Camiseta camisaM = new Camiseta();

        camisaP.setTecido("Algodão");
        camisaP.setTamanho('P');
        camisaM.setTecido("Jeans");
        camisaM.setTamanho('M');

        System.out.println("Tecido: " + camisaP.getTecido());
        System.out.println("Tamanho: " + camisaP.getTamanho());
        System.out.println("Tecido: " + camisaM.getTecido());
        System.out.println("Tamanho: " + camisaM.getTamanho());
    }
}
