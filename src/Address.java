public class Address {
    String streetNum;
    String streetName;
    String aptNum;
    String city;
    String state;
    int zipCode;

    public Address(String streetNum, String streetName, String aptNum, String city, String state, int zipCode){
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address a){
        this.streetNum = a.streetNum;
        this.streetName = a.streetName;
        this.aptNum = a.aptNum;
        this.city = a.city;
        this.state = a.state;
        this.zipCode = a.zipCode;
    }
    public Address(String address){
        String part1 = address.substring(0, address.indexOf(","));
        String part2 = address.substring(address.indexOf(",") + 2);
        streetNum = part1.substring(0, part1.indexOf(" "));
        part1 = part1.substring(part1.indexOf(" ") + 1);
        if (part1.indexOf("Apt") != -1){
            aptNum = part1.substring(part1.indexOf("Apt") + 4);
            streetName = part1.substring(0, part1.indexOf("Apt") - 1);
        } else {
            aptNum = "";
            streetName = part1;
        }
        city = part2.substring(0, part2.indexOf(","));
        part2 = part2.substring(part2.indexOf(",") + 2);
        state = part2.substring(0, part2.indexOf(" "));
        zipCode = Integer.parseInt(part2.substring(part2.indexOf(" ") + 1));
    }
    public boolean compare(Address address){
        if (this.streetNum.equals(address.streetNum) && this.streetName.equals(address.streetName) && this.city.equals(address.city) && this.aptNum.equals(address.aptNum) && this.state.equals(address.state) && this.zipCode == address.zipCode){
            return true;
        } else {
            return false;
        }
    }
    public int getZipCode(){
        return zipCode;
    }
    public String toString(){
        String str = "";
        str += streetNum + " " + streetName;
        if (!(aptNum.equals(""))){
            str += " Apt " + aptNum;
        }
        str += ", " + city + ", " + state + " " + zipCode;
        return str;
    }
}
