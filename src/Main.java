import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] supportedCurrencies = {"USD", "EUR", "GBP", "JPY", "AUD", "CAD"};

        System.out.println("******************************");
        System.out.println("Welcome to Currency Converter!");
        System.out.println("******************************");

        try {
            while (true) {
                System.out.println("Choose the desired conversion:");
                System.out.println("1. USD to EUR");
                System.out.println("2. EUR to USD");
                System.out.println("3. GBP to JPY");
                System.out.println("4. JPY to GBP");
                System.out.println("5. AUD to CAD");
                System.out.println("6. CAD to AUD");
                System.out.println("0. Out");

                System.out.print("Option: ");
                int option = scanner.nextInt();

                if (option == 0) {
                    break;
                }

                String fromCurrency = "";
                String toCurrency = "";

                switch (option) {
                    case 1:
                        fromCurrency = "USD";
                        toCurrency = "EUR";
                        break;
                    case 2:
                        fromCurrency = "EUR";
                        toCurrency = "USD";
                        break;
                    case 3:
                        fromCurrency = "GBP";
                        toCurrency = "JPY";
                        break;
                    case 4:
                        fromCurrency = "JPY";
                        toCurrency = "GBP";
                        break;
                    case 5:
                        fromCurrency = "AUD";
                        toCurrency = "CAD";
                        break;
                    case 6:
                        fromCurrency = "CAD";
                        toCurrency = "AUD";
                        break;
                    default:
                        System.out.println("Invalid option! Please choose a valid option.");
                        continue;
                }

                System.out.print("Enter the value you want to convert: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Please enter a valid number.");
                    scanner.next();
                }
                double amount = scanner.nextDouble();

                double convertedAmount = CurrencyConverter.convert(amount, fromCurrency, toCurrency);
                System.out.printf("%.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);

                System.out.print("Do you want to do another conversion? (y/n):");
                String continueConversion = scanner.next().toLowerCase();
                if (!continueConversion.equals("y")) {
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

        System.out.println("Program finished.");
    }
}
