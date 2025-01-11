package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Animal data = new Animal("Pikseli", "Hedgehog", 13);
        System.out.println(data.name);
        System.out.println(data.species);
        System.out.println(data.age);
    }
}
