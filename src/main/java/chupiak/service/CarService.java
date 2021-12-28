package chupiak.service;

import chupiak.model.Car;
import chupiak.model.Driver;
import java.util.List;

public interface CarService extends GenericService<Car> {
    void addDriverToCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}
