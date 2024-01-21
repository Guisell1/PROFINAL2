import java.util.Scanner;

public class triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las longitudes de los lados del triángulo:");

        System.out.print("Lado 1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Lado 2: ");
        int lado2 = scanner.nextInt();

        double area = calcularArea(lado1, lado2);
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }

    // Método estático para calcular el área del triángulo
    public static double calcularArea(int lado1, int lado2) {
        // Supongamos que estamos trabajando con
