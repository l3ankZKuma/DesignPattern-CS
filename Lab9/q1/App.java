public class App {
    public static void main(String[] args) {
        Game game = new FootBall();
        game.play();
        System.out.println();
        game = new BasketBall();
        game.play();
    }
}
