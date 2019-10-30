import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Patient name: ");
        String name = br.readLine();
        System.out.print("\n");
        System.out.print("Enter Patient address: ");
        String address = br.readLine();
        System.out.print("\n");
        System.out.print("Enter Patient payment: ");
        Double payment = Double.parseDouble(br.readLine());
        System.out.print("\n");

        Patient p = new Patient(payment,name,address);
        p.display();
        Patient p2 = (Patient) p.copy();
        p2.display();

    }

}
