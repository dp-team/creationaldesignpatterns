import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *       Factory method demonstration
 * Choose a language version of the menu to display, either French
 * or English and the factory method will generate
 * the appropriate object, which then display to the console.
 *
 */
public class Demo {
    public static void main(String args[]) throws IOException {
        GetMenuFactory menuFactory = new GetMenuFactory();
        System.out.print("choose the language of the menu to display:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String menuType = br.readLine();
        Menu m = menuFactory.getMenu(menuType);
        m.configureMenu();
        m.displayMenu();
    }
}
