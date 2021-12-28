package chupiak.controller;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chupiak.lib.Injector;
import chupiak.model.Car;
import chupiak.model.Driver;
import chupiak.service.CarService;
import chupiak.service.DriverService;

@WebServlet(urlPatterns = "/cars/drivers/add")
public class AddDriverToCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("chupiak");
    private final CarService carService = (CarService) injector.getInstance(CarService.class);
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Car> cars = carService.getAll();
        List<Driver> drivers = driverService.getAll();
        req.setAttribute("drivers", drivers);
        req.setAttribute("cars", cars);
        req.getRequestDispatcher("/WEB-INF/views/drivers/cars/add_driver.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        Long driverId = Long.valueOf(req.getParameter("driver_id"));
        Long carId = Long.valueOf(req.getParameter("car_id"));
        try {
            Car car = carService.get(carId);
            Driver driver = driverService.get(driverId);
            req.setAttribute("driver", driver.getName());
            req.setAttribute("car", car.getModel());
            carService.addDriverToCar(driver, car);
        } catch (NoSuchElementException e) {
            req.getRequestDispatcher("/WEB-INF/views/incorrect/input_error.jsp").forward(req, resp);
        }
        req.getRequestDispatcher("/WEB-INF/views/drivers/cars/driver_added.jsp").forward(req, resp);
    }
}
