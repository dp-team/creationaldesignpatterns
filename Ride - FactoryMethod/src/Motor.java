public class Motor implements Vehicle {
    private final Double RATE = 12.00;
    @Override
    public Double calculateRate(Double meters) {
        return RATE * meters;
    }

    @Override
    public Double getSpeed() {
        return 60.00;
    }
    public void display(){

        System.out.println("---Ride Motor---");
        System.out.println(RATE.toString()+"birr/meter");
        System.out.println("60.00 Km/hr");
    }
}
