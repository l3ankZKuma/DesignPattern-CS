public class Alarm implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void triggerAlarm() {
        System.out.println("Alarm triggered.");
        mediator.notify(this, "Alarm");
    }
}