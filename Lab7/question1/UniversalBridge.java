public class UniversalBridge extends Bridge{

    public UniversalBridge(IImage image) {
        super(image);
    }

    @Override
    public void display() {
        image.display();
    }

}
