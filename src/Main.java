import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("What would you like to do?");
            System.out.println("1. Calculate cost of one package");
            System.out.println("2. Simulate packages");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            String choice = sc.nextLine();

            if (choice.equals("1")){
                System.out.print("Enter the zip code of the origin package: ");
                String input = sc.nextLine();
                int zip1 = Integer.parseInt(input);
                System.out.print("Enter the zp code of the destination package: ");
                input = sc.nextLine();
                int zip2 = Integer.parseInt(input);
                System.out.print("Enter the weight of the package: ");
                input = sc.nextLine();
                double weight = Double.parseDouble(input);
                System.out.println("Cost: " + PostageCalculator.calculatePostage(zip1, zip2, weight));
            } else if (choice.equals("2")){

            } else if (choice.equals("3")){
                exit = true;
            } else {
                System.out.println("Invalid choice!");
            }
        }

    }
}
