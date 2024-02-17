
public class FootBallStrategy implements GameStrategy {
    @Override
    public void initialize() {
        System.out.println("FootBall Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("FootBall Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("FootBall Game Finished!");
    }
}
