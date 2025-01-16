import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        double usdToInr = 82.00;
        double eurToInr = 89.00;
        double inrToUsd = 1/usdToInr;
        double inrToEur = 1/eurToInr;
        double usdToEur = usdToInr/eurToInr;
        double eurToUsd = eurToInr/usdToInr;

        System.out.println("+---------------------------------+");
        System.out.println("|       CURRENCY CONVERTER        |");
        System.out.println("+---------------------------------+");
        System.out.println("|1)       USD to INR              |");
        System.out.println("|2)       INR to USD              |");
        System.out.println("|3)       EUR to INR              |");
        System.out.println("|4)       INR to EUR              |");
        System.out.println("|5)       USD to EUR              |");
        System.out.println("|6)       EUR to USD              |");
        System.out.println("+---------------------------------+");

        System.out.println("ENTER YOUR CHOICE : ");
        int choice = scanner.nextInt();
        

        System.out.println("ENTER THE AMOUNT : ");
        double amount = scanner.nextDouble();
        double convertedAmount = 0;

        switch (choice) {
            case 1:
            convertedAmount = amount * usdToInr;
            System.out.println(amount + " USD is "+ convertedAmount+ " rupess" );
                break;
            case 2:
            convertedAmount = amount * inrToUsd;
            System.out.println(amount + " INR is "+ convertedAmount+ " dollors" );
                break;
            case 3:
            convertedAmount = amount * eurToInr;
            System.out.println(amount + " EUR is "+ convertedAmount+ " rupees" );
                break;
            case 4:
            convertedAmount = amount * inrToEur;
            System.out.println(amount + " INR is "+ convertedAmount+ " euros" );
                break;
            case 5:
            convertedAmount = amount * usdToEur;
            System.out.println(amount + " USD is "+ convertedAmount+ " euros" );
                break;    
            case 6:
            convertedAmount = amount * eurToUsd;
            System.out.println(amount + " EUR is "+ convertedAmount+ " dollors" );
                break;
            default:
            System.out.println("Invalid Choice");
                break;
        }
        scanner.close();

    }
    
}
