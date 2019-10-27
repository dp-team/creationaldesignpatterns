public class Chef {
    private CakeBuilder cakeBuilder;

    public void setCakeBuilder(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }
    public void getCake(){
       Cake cake = cakeBuilder.getCake();
        System.out.println("---Your Cake---");
        System.out.println("cream-"+cake.getCream());
        System.out.println("butter-"+cake.getButter());
        System.out.println("sugar-"+cake.getSugar());
        System.out.println("flour-"+cake.getFlour());
        System.out.println("eggs-"+cake.getEggs().toString());
        System.out.println("milk-"+cake.getMilk());

    }
    public void makeCake(){
        cakeBuilder.newCake();
        cakeBuilder.buildButter();
        cakeBuilder.buildCream();;
        cakeBuilder.buildEggs();
        cakeBuilder.buildFlour();
        cakeBuilder.buildMilk();
        cakeBuilder.buildSugar();
    }
}
