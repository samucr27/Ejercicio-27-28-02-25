import java.text.DecimalFormat;
import java.util.Scanner;
public class Rama3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el peso en Kg:");
        double peso = teclado.nextDouble();

        System.out.println("Ingrese la estatura en m:");
        double estatura = teclado.nextDouble();

        double imc = peso/(estatura * estatura);

        System.out.println("Tu masa corporal es: "+imc);

        if (imc<18.5){
            System.out.println("Tiene bajo peso");
        } else if (imc >= 18.5 && imc <=24.9) {
            System.out.println("Esta normal en peso");
        } else if (imc >= 25 && imc <=26.9) {
            System.out.println("Tiene sobrepeso grado 1");
        } else if (imc >= 27 && imc <=29.9) {
            System.out.println("Tiene sobrepeso grado 2");
        } else if (imc >= 30 && imc <=34.9) {
            System.out.println("Tiene obesidad grado 3");
        } else if (imc >= 35 && imc <=39.9) {
            System.out.println("Tiene obesidad grado 2");
        } else if (imc >= 40 && imc <=49.9) {
            System.out.println("Tiene obesidad grado 3");
        } else if (imc>50) {
            System.out.println("Tiene obesidad grado 4");
        } else {
            System.out.println("Los datos ingresados son erroneos ");
        }
    }
}