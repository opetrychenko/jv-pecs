package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double dipperCapacity;
    private String machineType;

    public Excavator() {
    }

    public Excavator(double dipperCapacity, String machineType) {
        this.dipperCapacity = dipperCapacity;
        this.machineType = machineType;
    }

    public double getDipperCapacity() {
        return dipperCapacity;
    }

    public void setDipperCapacity(double dipperCapacity) {
        this.dipperCapacity = dipperCapacity;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started DIGGING VIGOROUSLY!!");
    }
}
