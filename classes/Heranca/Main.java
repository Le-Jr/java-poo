package Heranca;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();

        animal.setTerreno("Teste");

        cachorro.setTerreno("Catioro");
        cachorro.setRaca("Golden");

        System.out.println("Animal: " + animal.getTerreno());
        System.out.println("Terreno cachorro: " + cachorro.getTerreno());
        System.out.println("Raca cachorro: " + cachorro.getRaca());
    }
}
