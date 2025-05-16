package application;

import services.ExchangeRateService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();

        int option = 0;
        double amount = 0.0;

        while (option != 7) {
            showMenu();
            option = scanner.nextInt();

            if (option == 7) break;

            System.out.print("Digite o valor que deseja converter: ");
            amount = scanner.nextDouble();

            service.processOption(option, amount);

        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("********************************************************************************************************");
        System.out.println("Seja bem-vindo(a) ao Conversor de Moeda =]\n");
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Real brasileiro");
        System.out.println("4) Real brasileiro => Dólar");
        System.out.println("5) Dólar => Peso colombiano");
        System.out.println("6) Peso colombiano => Dólar");
        System.out.println("7) Sair");
        System.out.println("********************************************************************************************************");
        System.out.print("Digite a opção desejada: ");
    }
}
