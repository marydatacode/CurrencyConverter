import java.io.IOException;

public class CurrencyConverter {

    public static double convert(double amount, String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        double exchangeRate = ExchangeRateAPI.getExchangeRate(fromCurrency, toCurrency);
        return amount * exchangeRate;
    }
}
