package com.AluraCursos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMoneda conversor = new ConversorMoneda();

        int opcion;
        do {
            System.out.println("======== Challenge Conversor de monedas - Alura Latam ========");
            System.out.println("===== Bienvenido al conversor de monedas de Rodrigo Vera =====");
            System.out.println("1. Dólar (USD) -> Peso Argentino (ARS)");
            System.out.println("2. Peso Argentino (ARS) -> Dólar (USD)");
            System.out.println("3. Dólar (USD) -> Real Brasileño (BRL)");
            System.out.println("4. Real Brasileño (BRL) -> Dólar (USD)");
            System.out.println("5. Dólar (USD) -> Peso Colombiano (COP)");
            System.out.println("6. Peso Colombiano (COP) -> Dólar (USD)");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();
                conversor.convertir(opcion, cantidad);
            } else if (opcion != 7) {
                System.out.println("Opción inválida, intente de nuevo.");
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
    }
}
