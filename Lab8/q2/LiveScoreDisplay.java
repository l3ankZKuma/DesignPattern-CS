public class LiveScoreDisplay implements Observer {
    @Override
    public void update(Score score) {
        System.out.println("Live result: " + score.getMatchResult());
    }
}
