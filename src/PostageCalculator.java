public class PostageCalculator {
    public static double calculatePostage(int zip1, int zip2, double weight, double height, double width, double length){
        //cost of weight
        double cost = 3.75;
        if (weight <= 40){
            cost += weight / 0.1 * 0.05;
        } else {
            cost += 40 / 0.1 * 0.05;
            cost += (weight - 40) / 0.1 * 0.1;
        }
        //cost of size
        //what does combined size mean?????
        double combinedSize = height + width + length;
        if (combinedSize > 36){
            cost += (combinedSize - 36) * 0.1;
        }
        //cost of zip
        cost = cost + Math.abs(((zip1 / 100) - (zip2 / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
    public static double calculatePostage(Address ad1, Address ad2, double weight, double height, double width, double length){
        //cost of weight
        double cost = 3.75;
        if (weight <= 40){
            cost += weight / 0.1 * 0.05;
        } else {
            cost += 40 / 0.1 * 0.05;
            cost += (weight - 40) / 0.1 * 0.1;
        }
        //cost of size
        //what does combined size mean?????
        double combinedSize = height + width + length;
        if (combinedSize > 36){
            cost += (combinedSize - 36) * 0.1;
        }
        cost = cost + Math.abs(((ad1.getZipCode() / 100) - (ad2.getZipCode() / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
    public static double calculatePostage(Package pack){
        //cost of weight
        double cost = 3.75;
        double weight = pack.getWeight();
        if (weight <= 40){
            cost += weight / 0.1 * 0.05;
        } else {
            cost += 40 / 0.1 * 0.05;
            cost += (weight - 40) / 0.1 * 0.1;
        }
        //cost of size
        //what does combined size mean?????
        double height = pack.getHeight();
        double width = pack.getWidth();
        double length = pack.getLength();
        double combinedSize = height + width + length;
        if (combinedSize > 36){
            cost += (combinedSize - 36) * 0.1;
        }
        cost = cost + Math.abs(((pack.getOrigin().getZipCode() / 100) - (pack.getDestination().getZipCode() / 100)) / 100.0);
        return (int)((cost + 0.005) * 100) / 100.0;
    }
}
