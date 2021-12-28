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
import chupiak.model.Manufacturer;
import chupiak.service.CarService;
import chupiak.service.ManufacturerService;

@WebServlet(urlPatterns = "/cars/create")
public class CreateCarController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("chupiak");
    private final CarService carService = (CarService) injector.getInstance(CarService.class);
    private final ManufacturerService manufacturerService =
            (ManufacturerService) injector.getInstance(ManufacturerService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Manufacturer> allManufacturers = manufacturerService.getAll();
        req.setAttribute("manufacturers", allManufacturers);
        req.getRequestDispatcher("/WEB-INF/views/cars/create_car.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String model = req.getParameter("model");
        String manufacturerId = req.getParameter("manufacturer_id");
        try {
            Manufacturer manufacturer = manufacturerService.get(Long.parseLong(manufacturerId));
            Car car = new Car(model, manufacturer);
            carService.create(car);
        } catch (NoSuchElementException e) {
            req.getRequestDispatcher("/WEB-INF/views/incorrect/input_error.jsp").forward(req, resp);
        }
        req.setAttribute("car", model);
        req.getRequestDispatcher("/WEB-INF/views/cars/car_created.jsp").forward(req, resp);
    }
}
