import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        Chef chef = new Chef();
        System.out.print("choose the language of the menu to display:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cakeType = br.readLine();
        if(cakeType.equalsIgnoreCase("SwissRoll")){
            CakeBuilder swissRoll = new SwissRollCakeBuilder();
            chef.setCakeBuilder(swissRoll);
            chef.makeCake();
            chef.getCake();

        }
        else if(cakeType.equalsIgnoreCase("VictoriaSponge")){
            CakeBuilder victoriaSponge = new VictoriaSpongeCakeBuilder();
            chef.setCakeBuilder(victoriaSponge);
            chef.makeCake();
            chef.getCake();
        }
        else {
            System.out.println("we don't have that cake in the menu");
        }
    }
}
