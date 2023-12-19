public class CEO implements ICeo,IEmployee,IManager {

    @Override
    public void addBonus() {
        System.out.println("Adding bonus at the end of the year...");
    }

    @Override
    public void salary() {
        System.out.println("Getting the salary...");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Making decisions...");
    }

    @Override
    public void addStocks() {
        System.out.println("Getting shares of the company as a bonus...");
    }

    @Override
    public void hire(){

    }

    @Override
    public void train(){

    }
}
