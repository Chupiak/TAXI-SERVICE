package chupiak.dao;

import java.util.List;
import chupiak.model.Car;

public interface CarDao extends GenericDao<Car> {
    List<Car> getAllByDriver(Long driverId);

}
