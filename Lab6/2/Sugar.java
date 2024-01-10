public class Sugar implements Beverage{
    private Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return beverage.getCost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "sugar ";
    }



}
