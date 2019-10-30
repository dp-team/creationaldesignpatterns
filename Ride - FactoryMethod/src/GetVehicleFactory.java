public class GetVehicleFactory {
    public Vehicle getVehicle(String transportation){
        if(transportation.equalsIgnoreCase("Person")){
            return new Automobile();
        }
        else if(transportation.equalsIgnoreCase("Goods")){
            return new Motor();
        }
        return null;
    }
}
