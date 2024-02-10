
public class ACOffCommand implements Command {
    AirConditioner ac;
    
    public ACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }
    
    public void execute() {
        ac.off();
    }
    
    public void undo() {
        ac.on();
    }
}
