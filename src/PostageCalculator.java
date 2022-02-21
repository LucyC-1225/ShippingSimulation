public class PostageCalculator {
    public static double calculatePostage(int zip1, int zip2, double weight){
        double cost = 3.75;
        while (weight >= 0.1){
            cost += 0.05;
            weight -= 0.1;
        }
        cost = cost + Math.abs(((zip1 / 100) - (zip2 / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
    public static double calculatePostage(Address ad1, Address ad2, double weight){
        double cost = 3.75;
        while (weight >= 0.1){
            cost += 0.05;
            weight -= 0.1;
        }
        cost = cost + Math.abs(((ad1.getZipCode() / 100) - (ad2.getZipCode() / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
    public static double calculatePostage(Package pack){
        double cost = 3.75;
        double weight = pack.getWeight();
        while (weight >= 0.1){
            cost += 0.05;
            weight -= 0.1;
        }
        cost = cost + Math.abs(((pack.getOrigin().getZipCode() / 100) - (pack.getDestination().getZipCode() / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
}
