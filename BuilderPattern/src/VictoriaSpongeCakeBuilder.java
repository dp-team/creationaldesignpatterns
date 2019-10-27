public class VictoriaSpongeCakeBuilder extends CakeBuilder {
    @Override
    public void buildCream() {
        cake.setCream("vanilla");
    }

    @Override
    public void buildEggs() {
        cake.setEggs(4);

    }

    @Override
    public void buildFlour() {
        cake.setFlour("225g self-raising");

    }

    @Override
    public void buildButter() {
        cake.setButter("225g");

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
