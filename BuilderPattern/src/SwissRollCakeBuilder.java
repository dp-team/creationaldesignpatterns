public class SwissRollCakeBuilder extends CakeBuilder {
    @Override
    public void buildCream() {
        cake.setCream("Jam");

    }

    @Override
    public void buildEggs() {
        cake.setEggs(3);

    }

    @Override
    public void buildFlour() {
        cake.setFlour("75g self-raising");

    }

    @Override
    public void buildButter() {
        cake.setButter("");

    }

    @Override
    public void buildMilk() {
        cake.setMilk("");

    }

    @Override
    public void buildSugar() {
        cake.setSugar("");

    }
}
