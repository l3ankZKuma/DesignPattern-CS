public class Main {
    public static void main(String[] args) {
        FootballScore score = new FootballScore();
        Observer observer1 = new LiveScoreDisplay();
        Observer observer2 = new LiveScoreDisplay();

        score.attach(observer1);
        score.attach(observer2);

        score.setScore(new Score("Thai 1-0 UAE"));
        score.setScore(new Score("Thai 2-0 UAE"));
    }
}
