package nye.progtech.hf2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);

        System.out.println("Add meg a neved:");
        String name = be.nextLine();
        System.out.println("Adj meg egy nyelvet");
        String ny = be.nextLine();

        if (ny.equals("hun"))
            System.out.println("Szia " + name);

        else if (ny.equals("en"))
            System.out.println("Hi " + name);

        else if (ny.equals("haw"))
            System.out.println("Aloha " + name);

        else System.out.println("Szia "+ name + "!");


    }
}
