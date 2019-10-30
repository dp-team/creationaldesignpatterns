import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo {
    public static void main(String args[]) throws IOException {
        GetVehicleFactory vehicleFactory = new GetVehicleFactory();
        System.out.print("choose type of transportation, Goods or Person:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tType = br.readLine();
        Vehicle v = vehicleFactory.getVehicle(tType);
        v.display();
    }
}
