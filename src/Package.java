public class Package {
    Address origin;
    Address destination;
    double weight;
    double height;
    double width;
    double length;

    public Package(Address origin, Address destination, double weight, double height, double length, double width){
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public Address getOrigin(){
        return origin;
    }
    public Address getDestination(){
        return destination;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public static Package generatePackage(){
        int[] zipArr = {rand(35004, 36925), rand(99501, 99950), rand(85001, 86886), rand(71601, 72959), rand(90001, 96162), rand(80001, 81658), rand(6001, 6928), rand(19701, 19980), rand(32003, 34997), rand(30002, 39901), rand(96701, 96898), rand(83201, 83877), rand(60001, 62999), rand(46001, 47997), rand(50001, 52809), rand(66002, 67954), rand(40003, 42788), rand(70001, 71497), rand(3901, 4992), rand(20588, 21930), rand(1001, 5544), rand(48001, 49971), rand(55001, 56763), rand(38601, 39776), rand(63001, 65899), rand(59001, 59937), rand(68001, 69367), rand(88901, 89883), rand(3031, 3897), rand(7001, 8989), rand(87001, 88439), rand(501, 14925), rand(27006, 28909), rand(58001, 58856), rand(43001, 45999), rand(73001, 74966), rand(97001, 97920), rand(15001,19640), rand(2801, 2940), rand(29001, 29945), rand(57001, 57799), rand(37010, 38589), rand(73301, 88595), rand(84001, 84791), rand(5001, 5907), rand(20101, 24658), rand(98001, 99403), rand(24701, 26886), rand(53001, 54990), rand(82001, 83414)};

        int zip1 = zipArr[rand(0, 49)];
        int zip2 = zipArr[rand(0, 49)];
        double weight = Math.random() * 80 + 0.1;
        Address origin = new Address("123", "Random Street", "3C", "City", "State", zip1);
        Address destination = new Address("123", "Random Street", "3C", "City", "State", zip2);
        double height = Math.random() * 20 + 2;
        double length = Math.random() * 20 + 2;
        double width = Math.random() * 20 + 2;
        return new Package(origin, destination, weight, height, length, width);
    }
    private static int rand(int min, int max){
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
