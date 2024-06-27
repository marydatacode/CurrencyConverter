import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ExchangeRateAPI {

    private static final String API_KEY = "MY_API_KEY";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static double getExchangeRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        String address = BASE_URL + API_KEY + "/latest/" + fromCurrency;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
        JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

        return conversionRates.get(toCurrency).getAsDouble();
    }
}
