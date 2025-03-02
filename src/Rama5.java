import java.util.Random;
import java.util.Scanner;

public class Rama5 {

    public static double realizarOperacion(int num1, int num2, String operacion) {
        switch (operacion) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return (double) num1 / num2;
            case "^":
                return Math.pow(num1, num2);
            case "%":
                return num1 % num2;
            default:
                System.out.println("Error: Operación no válida.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        while (true) {
            int num1 = ale.nextInt(100) + 1;
            int num2 = ale.nextInt(100) + 1;

            System.out.println("Números generados: " + num1 + " y " + num2);

            System.out.print("Ingrese la operación a realizar (+, -, *, /, ^, %): ");
            String ope = teclado.next().trim();

            double resul= realizarOperacion(num1, num2, ope);

            if (!Double.isNaN(resul)) {
                System.out.println("Resultado: " + num1 + " " + ope + " " + num2 + " = " + resul);
            }

            System.out.print("¿Desea realizar otra operación? (1/2): ");
            String continuar = teclado.next().trim();

            if (!continuar.equalsIgnoreCase("1")) {
                System.out.println("Calculadora finalizada.");
                break;
            }
        }

        teclado.close();
    }
}