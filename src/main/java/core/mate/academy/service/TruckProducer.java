package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private static final int TRUCK_QUANTITY = 3;

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        for (int i = 0; i < TRUCK_QUANTITY; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
