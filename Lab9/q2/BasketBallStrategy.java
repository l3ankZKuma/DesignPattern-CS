
public class BasketBallStrategy implements GameStrategy {
    @Override
    public void initialize() {
        System.out.println("BasketBall Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("BasketBall Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("BasketBall Game Finished!");
    }
}
