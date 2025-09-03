import java.util.*;

public class currency_converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        double USD_to_INR = 83.0;
        double EURO_to_INR = 90.0;
        double YEN_to_INR = 0.56;
        double DIN_to_INR = 270.0;  

        System.out.println("*** Welcome to Currency Converter ***");
        System.out.println("Available currencies: INR, USD, EURO, YEN, DIN");

        System.out.print("Enter the currency you have: ");
        String c1 = sc.next().toUpperCase();

        System.out.print("Enter the currency you want to convert to: ");
        String c2 = sc.next().toUpperCase();

        System.out.print("Enter the amount in " + c1 + ": ");
        double val1 = sc.nextDouble();
        double inrValue = 0.0;
        switch (c1) {
            case "INR": inrValue = val1; break;
            case "USD": inrValue = val1 * USD_to_INR; break;
            case "EURO": inrValue = val1 * EURO_to_INR; break;
            case "YEN": inrValue = val1 * YEN_to_INR; break;
            case "DIN": inrValue = val1 * DIN_to_INR; break;
            default: System.out.println("Invalid source currency!"); return;
        }
        double val2 = 0.0;
        switch (c2) {
            case "INR": val2 = inrValue; break;
            case "USD": val2 = inrValue / USD_to_INR; break;
            case "EURO": val2 = inrValue / EURO_to_INR; break;
            case "YEN": val2 = inrValue / YEN_to_INR; break;
            case "DIN": val2 = inrValue / DIN_to_INR; break;
            default: System.out.println("Invalid target currency!"); return;
        }

        System.out.printf("%.2f %s = %.2f %s%n", val1, c1, val2, c2);

    }
}
