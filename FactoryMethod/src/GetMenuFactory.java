public class GetMenuFactory {
    public Menu getMenu(String menuType){
       if(menuType.equalsIgnoreCase("French")){
           return new FrenchMenu();
       }
       else if(menuType.equalsIgnoreCase("English")){
           return new EnglishMenu();
       }
       return null;
    }
}
