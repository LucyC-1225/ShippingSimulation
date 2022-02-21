public class Package {
    Address origin;
    Address destination;
    double weight;

    public Package(Address origin, Address destination, double weight){
        this.origin = origin;
        this.destination = destination;
        if (weight < 0.1){
            //what do you do if the weight is invalid?
        }
        this.weight = weight;
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
}
