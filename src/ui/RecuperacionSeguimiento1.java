package ui;

import java.util.Scanner;
import java.lang.Math;

public class RecuperacionSeguimiento1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1: Ingrese tres números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Cantidad de números iguales: " + contarIguales(num1, num2, num3));

        // Ejercicio 2
        System.out.println("Ejercicio 2: Ingrese un nombre y un número (1 o 0):");
        String nombre = scanner.next();
        int opcion = scanner.nextInt();
        System.out.println(saludoODespedida(nombre, opcion));

        // Ejercicio 3
        System.out.println("Ejercicio 3: Ingrese tres palabras:");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();
        System.out.println("Cantidad de palabras con 4 o más caracteres: " + contarLargas(palabra1, palabra2, palabra3));

        // Ejercicio 4
        System.out.println("Ejercicio 4: Ingrese dos palabras:");
        String palabraA = scanner.next();
        String palabraB = scanner.next();
        System.out.println("Los caracteres en la posición 2 son iguales: " + compararPosicion(palabraA, palabraB));

        // Ejercicio 5
        System.out.println("Ejercicio 5: Ingrese los coeficientes a, b y c de la ecuación cuadrática:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        calcularRaices(a, b, c);

        scanner.close();
    }

    // Ejercicio 1
    public static int contarIguales(int a, int b, int c) {
        int iguales = 0;
        if (a == b) iguales++;
        if (b == c) iguales++;
        if (a == c) iguales++;
        return iguales;
    }

    // Ejercicio 2
    public static String saludoODespedida(String nombre, int opcion) {
        if (opcion == 1) {
            return "Hola " + nombre;
        } else if (opcion == 0) {
            return "Chao " + nombre;
        } else {
            return "Error entradas inválidas";
        }
    }

    // Ejercicio 3
    public static int contarLargas(String a, String b, String c) {
        int contador = 0;
        if (a.length() >= 4) contador++;
        if (b.length() >= 4) contador++;
        if (c.length() >= 4) contador++;
        return contador;
    }

    // Ejercicio 4
    public static boolean compararPosicion(String a, String b) {
        if (a.length() < 3 || b.length() < 3) {
            System.out.println("Error: Ambas palabras deben tener al menos 3 caracteres.");
            return false;
        }
        return a.charAt(2) == b.charAt(2);
    }

    // Ejercicio 5
    public static void calcularRaices(double a, double b, double c) {
        if (a == 0) {
            System.out.println("El coeficiente 'a' no puede ser cero en una ecuación cuadrática.");
            return;
        }
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La raíz doble es: " + raiz);
        } else {
            System.out.println("No hay raíces reales.");
        }
    }
}