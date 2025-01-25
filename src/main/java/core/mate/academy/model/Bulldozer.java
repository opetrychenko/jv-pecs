package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int trackLength;
    private boolean hasWheels;

    public Bulldozer() {
    }

    public Bulldozer(int trackLength, boolean hasWheels) {
        this.trackLength = trackLength;
        this.hasWheels = hasWheels;
    }

    public int getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(int trackLength) {
        this.trackLength = trackLength;
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started DEMOLISHING!!");
    }
}
