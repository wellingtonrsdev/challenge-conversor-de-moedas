package entities;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateClient {

    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";
    private static final String API_KEY = "REMOVIDO";

    public static ExchangeRateResponse convertExchangeRate(String from, String to, double amount) {

        URI address = URI.create(BASE_URL + API_KEY + "/pair/" + from + "/" + to + "/" + amount);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), ExchangeRateResponse.class);
        } catch (Exception e) {
            throw new RuntimeException("Não conseguimos fazer a sua conversão, algo saiu inesperado");
        }

    }
}
