package foo.bar;

public class ShelterEmployee {

    public static final int DAILY_NORM = 5;

    public void feed(Cat cat) {
        if (cat.getFishEaten() < DAILY_NORM) {
            cat.feed();
        }
    }
}
