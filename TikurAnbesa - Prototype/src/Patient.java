public class Patient extends Prototype{
    private Double id;
    private Double payment;
    private String name,address;

    public Patient(Double payment, String name, String address) {
        this.id = Math.random();
        this.payment = payment;
        this.name = name;
        this.address = address;
    }
    public Patient(Patient p) {
        this.id = p.id;
        this.payment = p.payment;
        this.name = p.name;
        this.address = p.address;
    }

    @Override
    public Patient copy() {
        return new Patient(this);
    }
    public void display(){
        System.out.println("---Patient---");
        System.out.println("id--"+id.toString());
        System.out.println("name--"+name);
        System.out.println("address--"+address);
        System.out.println("payment--"+payment.toString());
    }
}
