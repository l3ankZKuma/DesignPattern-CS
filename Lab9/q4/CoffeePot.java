public class CoffeePot implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void pourCoffee() {
        System.out.println("CoffeePot started.");
    }
}