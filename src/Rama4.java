import java.util.Random;
import java.util.Scanner;

public class Rama4 {
    public static void main(String[] args) {
        int min = 1;
        int max = 3;
        int num, dinero;
        int respuesta = 1;
        int ronda = 0; // Contador de rondas

        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el dinero a apostar: ");
        dinero = teclado.nextInt();

        if (dinero <= 0) {
            System.out.println("Debes ingresar una cantidad de dinero positiva.");
            return;
        }

        do {
            num = ale.nextInt((max - min + 1)) + min;
            ronda++;

            if (num == 1) {
                dinero *= 2;
                System.out.println("Duplicaste tu dinero, tu dinero actual es: " + dinero);
            } else if (num == 2) {
                dinero /= 2;
                System.out.println("Perdiste la mitad de tu dinero, tu dinero actual es: " + dinero);
            } else {
                dinero = 0;
                System.out.println("Perdiste tu dinero, tu dinero actual es: " + dinero);
            }

            if (dinero <= 0) {
                System.out.println("No tienes dinero para seguir jugando. Acabo el juego.");
                break;
            }

            System.out.println("Quieres seguir jugando? (1: Si / 2: No)");
            respuesta = teclado.nextInt();

            while (respuesta != 1 && respuesta != 2) {
                System.out.println("Ingresa 1 para continuar o 2 para salir.");
                respuesta = teclado.nextInt();
            }

        } while (respuesta == 1);

        System.out.println("Te retiraste del juego. Tu dinero final es: " + dinero);
        System.out.println("Número total de rondas jugadas: " + ronda);
    }
}