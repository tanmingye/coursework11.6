import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        String studentNumber = "32804245";

        int vanillaPrice = Integer.parseInt(studentNumber.substring(6, 8));
        int chocolatePrice = Integer.parseInt(studentNumber.substring(4, 6));
        int strawberryPrice = Integer.parseInt(studentNumber.substring(2, 4));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
        char flavourChoice = scanner.next().charAt(0);

        boolean validFlavour = false;
        int pricePerScoop= 0;
        switch (flavourChoice) {
            case 'v':
                validFlavour = true;
                pricePerScoop= vanillaPrice;
                break;
            case 'c':
                validFlavour = true;
                pricePerScoop = chocolatePrice;
                break;
            case 's':
                validFlavour = true;
                pricePerScoop = strawberryPrice;
                break;
            default:
                System.out.println("We don't have that flavour.");
                scanner.close();
                return;
        }

        if (validFlavour) {
            System.out.print("How many scoops would you like? ");
            int numberOfScoops = scanner.nextInt();

            if (numberOfScoops < 1 || numberOfScoops > 3) {
                System.out.println("That's too many scoops to fit in a cone.");
            } else if (numberOfScoops == 0) {
                System.out.println("We don't sell just a cone.");
            } else {
                int totalPricePence = 100 + (pricePerScoop * numberOfScoops);

                int pounds = totalPricePence / 100;
                int pence = totalPricePence % 100;

                System.out.printf("That will be %.2f please.%n", pounds + pence / 100.0 + (pence % 100) / 100.0 / 100);
            }
        }

        scanner.close();
    }
}
