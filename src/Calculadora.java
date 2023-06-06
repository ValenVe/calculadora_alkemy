import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresar: 1 para suma, 2 para resta, 3 para multiplicación, 4 para división, 5 para " +
                "potenciación, 6 para raíz cuadrada, 7 para obtener módulo, 8 para comvertir temperatura Fahrenheit" +
                " a Celsius: ");
        int operacion = scanner.nextInt();

        if (operacion == 1) {

            System.out.print("Ingresa el primer número: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno + numeroDos;

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 2) {

            System.out.print("Ingresa el número sobre el que quieras efectuar una resta: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el segundo que quieras restarle al número que ingresaste previamente: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno - numeroDos;

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 3) {

            System.out.print("Ingresa el primer número que quieras multiplicar: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el numero por el cual quieras multiplicar al numero ingresado previamente: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno * numeroDos;

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 4) {

            System.out.print("Ingresa el numero sobre el cual quieras dividir: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el numero por el cual quieras dividir al numero ingresado previamente: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno / numeroDos;

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 5) {

            System.out.print("Ingresa la base: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el exponente: ");
            int numeroDos = scanner.nextInt();

            double resultado = Math.pow(numeroUno, numeroDos);

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 6) {

            System.out.print("Ingresa el radicando : ");
            int numeroUno = scanner.nextInt();
            double resultado = Math.sqrt(numeroUno);

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 7) {

            System.out.print("Ingresa el primer número: ");
            int numeroUno = scanner.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numeroDos = scanner.nextInt();

            int resultado = numeroUno % numeroDos;

            System.out.println("El resultado es: " + resultado);

        } else if (operacion == 8) {

            System.out.print("Ingresar la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("La temperatura en Celsius es: " + celsius);

        }
    }
}
