package services;

import entities.ExchangeRateClient;
import entities.ExchangeRateResponse;

public class ExchangeRateService {

    public void processOption(int option, double amount) {
        ExchangeRateResponse response;

        switch (option) {
            case 1:
                response = ExchangeRateClient.convertExchangeRate("USD", "ARS", amount);
                printConversionResult(amount, "USD", response.conversionResult(), "ARS");
                break;
            case 2:
                response = ExchangeRateClient.convertExchangeRate("ARS", "USD", amount);
                printConversionResult(amount, "ARS", response.conversionResult(), "USD");
                break;
            case 3:
                response = ExchangeRateClient.convertExchangeRate("USD", "BRL", amount);
                printConversionResult(amount, "USD", response.conversionResult(), "BRL");
                break;
            case 4:
                response = ExchangeRateClient.convertExchangeRate("BRL", "USD", amount);
                printConversionResult(amount, "BRL", response.conversionResult(), "USD");
                break;
            case 5:
                response = ExchangeRateClient.convertExchangeRate("USD", "COP", amount);
                printConversionResult(amount, "USD", response.conversionResult(), "COP");
                break;
            case 6:
                response = ExchangeRateClient.convertExchangeRate("COP", "USD", amount);
                printConversionResult(amount, "COP", response.conversionResult(), "USD");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }


    private void printConversionResult(double amount, String from, double result, String to) {
        System.out.println("Valor " + String.format("%.2f", amount) + "[" + from + "] corresponde ao valor final de =>>> " + String.format("%.2f", result) + "[" + to + "]");
    }
}


