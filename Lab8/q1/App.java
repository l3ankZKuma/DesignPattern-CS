public class App {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
        manager.setRenderer(new TVRenderer());
		manager.show();
    }
}
