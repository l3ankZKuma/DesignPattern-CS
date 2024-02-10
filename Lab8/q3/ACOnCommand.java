
public class ACOnCommand implements Command {
    AirConditioner ac;
    
    public ACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }
    
    public void execute() {
        ac.on();
    }
    
    public void undo() {
        ac.off();
    }
}
