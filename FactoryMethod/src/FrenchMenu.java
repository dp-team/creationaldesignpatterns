import java.util.ArrayList;

public class FrenchMenu extends Menu {
    @Override
    void configureMenu() {
        currency = "euro";
        menuItems = new String[]{"Muffins","pate a pain d'epices","pate a gaufress","pate a biscut"};
        priceList = new Double[]{100.99,120.80,120.30,50.90};
    }
}
