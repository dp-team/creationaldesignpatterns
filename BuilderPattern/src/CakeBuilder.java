abstract class CakeBuilder {
    protected Cake cake;
    public Cake getCake(){
        return cake;
    }
    public void newCake(){
        cake = new Cake();
    }
    public abstract void buildCream();
    public abstract void buildEggs();
    public abstract void buildFlour();
    public abstract void buildButter();
    public abstract void buildMilk();
    public abstract void buildSugar();
}
