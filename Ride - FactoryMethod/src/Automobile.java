public class Automobile implements Vehicle {
    private final Double RATE = 12.00;
    @Override
    public Double calculateRate(Double meters) {
        return RATE * meters;
    }

    @Override
    public Double getSpeed() {
        return 40.00;
    }
    public void display(){

        System.out.println("---Ride Automobile---");
        System.out.println(RATE.toString()+"Birr/meter");
        System.out.println("40.00 Km/hr");
    }
}
