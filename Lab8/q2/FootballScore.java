import java.util.ArrayList;
import java.util.List;

public class FootballScore implements Subject {
    private List<Observer> observers;
    private Score score;

    public FootballScore() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Score score) {
        for (Observer observer : observers) {
            observer.update(score);
        }
    }

    public void setScore(Score score) {
        this.score = score;
        notifyUpdate(score);
    }
}
