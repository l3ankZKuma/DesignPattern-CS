
public class App {
    public static void main(String[] args) {
        Game game = new Game(new BasketBallStrategy());
        game.play();

        System.out.println("Switching to FootBall Game");
        game.setGameStrategy(new FootBallStrategy());
        game.play();
    }
}
