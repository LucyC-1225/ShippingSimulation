import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit){
            System.out.println("________________________________________________");
            System.out.println("What would you like to do?");
            System.out.println("1. Calculate cost of one package");
            System.out.println("2. Simulate packages");
            System.out.println("3. How package costs are calculated");
            System.out.println("4. Exit");
            System.out.print("Input: ");
            String choice = sc.nextLine();
            System.out.println("________________________________________________");

            if (choice.equals("1")){
                System.out.print("Enter the zip code of the origin package: ");
                String input = sc.nextLine();
                int zip1 = Integer.parseInt(input);
                System.out.print("Enter the zip code of the destination package: ");
                input = sc.nextLine();
                int zip2 = Integer.parseInt(input);
                System.out.print("Enter the weight of the package: ");
                input = sc.nextLine();
                double weight = Double.parseDouble(input);
                boolean validWeight = false;
                while(!validWeight){
                    if (weight >= 0.1){
                        validWeight = true;
                    } else {
                        System.out.println("Invalid weight! The weight must be at least 0.1 pounds!");
                        System.out.print("Enter the weight of the package: ");
                        weight = Double.parseDouble(sc.nextLine());
                    }
                }
                System.out.print("Enter the height of the package: ");
                input = sc.nextLine();
                double height = Double.parseDouble(input);
                boolean validHeight = false;
                while(!validHeight){
                    if (height >= 2){
                        validHeight = true;
                    } else {
                        System.out.println("Invalid height! The height must be at least 2 inches!");
                        System.out.print("Enter the height of the package: ");
                        height = Double.parseDouble(sc.nextLine());
                    }
                }
                System.out.print("Enter the length of the package: ");
                input = sc.nextLine();
                double length = Double.parseDouble(input);
                boolean validLength = false;
                while(!validLength){
                    if (length >= 2){
                        validLength = true;
                    } else {
                        System.out.println("Invalid length! The length must be at least 2 inches!");
                        System.out.print("Enter the length of the package: ");
                        length = Double.parseDouble(sc.nextLine());
                    }
                }
                System.out.print("Enter the width of the package: ");
                input = sc.nextLine();
                double width = Double.parseDouble(input);
                boolean validWidth = false;
                while(!validWidth){
                    if (width >= 2){
                        validWidth = true;
                    } else {
                        System.out.println("Invalid width! The width must be at least 2 inches!");
                        System.out.print("Enter the width of the package: ");
                        width = Double.parseDouble(sc.nextLine());
                    }
                }
                System.out.println("Cost: " + PostageCalculator.calculatePostage(zip1, zip2, weight, height, length, width));
                System.out.println("________________________________________________");
                System.out.println("Click enter to return to menu");
                sc.nextLine();
            } else if (choice.equals("2")){
                System.out.print("How many packages would you like to simulate? ");
                int num = sc.nextInt();
                sc.nextLine();
                ArrayList<Package> packages = new ArrayList<Package>();
                while (num > 0){
                    packages.add(Package.generatePackage());
                    num--;
                }
                double totalCost = 0.0;
                System.out.println("Randomly generated packages info: ");
                for(int i = 0; i < packages.size(); i++){
                    System.out.println("Package " + (i + 1) + ": ________________________________________________");
                    System.out.println("Origin address: " + packages.get(i).getOrigin().toString());
                    System.out.println("Destination address: " + packages.get(i).getDestination().toString());
                    System.out.println("Weight: " + packages.get(i).getWeight() + " pounds");
                    System.out.println("Height: " + packages.get(i).getHeight() + " inches");
                    System.out.println("Length: " + packages.get(i).getLength() + " inches");
                    System.out.println("Width: " + packages.get(i).getWidth() + " inches");
                    System.out.println("Cost: " + PostageCalculator.calculatePostage(packages.get(i)));
                    totalCost += PostageCalculator.calculatePostage(packages.get(i));
                }
                System.out.println("________________________________________________");
                System.out.println("Total Cost of all packages: " + (int)((totalCost + 0.005) * 100) / 100.0);
                System.out.println("________________________________________________");
                System.out.println("Click enter to return to menu");
                sc.nextLine();

            } else if (choice.equals("3")){
                System.out.println("- The base cost of the package is $2.75.");
                System.out.println("- Every 1/10 pound of the package costs $0.05.");
                System.out.println("- Packages more than 40 pounds are oversized and will be charged $0.10 per 1/10 pound over the 40 pound limit.");
                System.out.println("- Any package that exceeds a combined 36 inches will cost an additional 10 cents per inch.");
                System.out.println("- The difference between the country codes of the origin and destination address divided by 100 is added to the total cost.");
                System.out.println("- Note that all packages must weigh at least 0.1 pounds and the heights, widths, and lengths of all packages must be at least 2 inches");
            } else if (choice.equals("4")){
                exit = true;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
