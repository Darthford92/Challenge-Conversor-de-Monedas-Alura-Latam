package com.AluraCursos;

public class ConversorMoneda {
    private final ConsultaAPI consultaAPI = new ConsultaAPI();

    public void convertir(int opcion, double cantidad) {
        String from = "";
        String to = "";

        switch (opcion) {
            case 1 -> { from = "USD"; to = "ARS"; }
            case 2 -> { from = "ARS"; to = "USD"; }
            case 3 -> { from = "USD"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "USD"; }
            case 5 -> { from = "USD"; to = "COP"; }
            case 6 -> { from = "COP"; to = "USD"; }
        }

        Moneda moneda = consultaAPI.obtenerTasa(from, to);
        if (moneda != null) {
            double resultado = cantidad * moneda.conversion_rate();
            System.out.printf("%.2f %s = %.2f %s%n", cantidad, from, resultado, to);
        } else {
            System.out.println("Error al obtener la conversión. Intente más tarde.");
        }
    }
}
