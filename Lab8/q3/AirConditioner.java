
public class AirConditioner {
    private String location = "";
    
    public AirConditioner(String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println("The AC is on... in " + location);
        System.out.println("The temp is set to 25 in " + location);
    }
    
    public void off() {
        System.out.println("The AC is off... in " + location);
    }
}
