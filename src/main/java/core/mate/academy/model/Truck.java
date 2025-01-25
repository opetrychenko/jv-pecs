package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private boolean hasDumper;

    public Truck() {
    }

    public Truck(int loadCapacity, boolean hasDumper) {
        this.loadCapacity = loadCapacity;
        this.hasDumper = hasDumper;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean getHasDumper() {
        return hasDumper;
    }

    public void setHasDumper(boolean hasDumper) {
        this.hasDumper = hasDumper;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
