public class EnglishMenu extends Menu{
    @Override
    void configureMenu() {
        currency = "dollars";
        menuItems = new String[]{"Cupcake","spicy cake","Waffles","Sponge cake"};
        priceList = new Double[]{90.69,80.80,160.30,50.90};

    }
}
