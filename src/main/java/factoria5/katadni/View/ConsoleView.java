package factoria5.katadni.View;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    public String promptDni() {
        System.out.println("Introduce el número del DNI (0-99999999): ");
        return scanner.nextLine();
    }

    public void showInvalidInputMessage() {
        System.out.println("El dato introducido es incorrecto");
    }

    public void showDniResult(int dni, char letter) {
        System.out.println("El NIF es: " + dni + letter);
    }
}
