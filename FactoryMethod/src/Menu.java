import java.util.List;

abstract class Menu {
    protected String[] menuItems;
    protected Double[] priceList;
    protected String currency;
    abstract void configureMenu();
    public void displayMenu(){

        System.out.println("---Design-Pattern Cafe---");
        for (int i = 0; i< menuItems.length;i++){
            System.out.println(menuItems[i]+"------"+priceList[i].toString()+" "+currency);
        }
    }
}
