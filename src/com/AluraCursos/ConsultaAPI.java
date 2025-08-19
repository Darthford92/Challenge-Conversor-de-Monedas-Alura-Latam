package com.AluraCursos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {
    private static final String API_KEY = "85109923cd4385138a76d416";
    private static final String URL = "https://v6.exchangerate-api.com/v6/";

    public Moneda obtenerTasa(String from, String to) {
        try {
            String direccion = URL + API_KEY + "/pair/" + from + "/" + to;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e.getMessage());
            return null;
        }
    }
}

