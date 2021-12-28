package chupiak.controller;

import chupiak.lib.Injector;
import chupiak.model.Driver;
import chupiak.service.DriverService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/drivers/create")
public class CreateDriverController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("chupiak");
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/drivers/create_driver.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        String licenseNumber = req.getParameter("license");
        Driver driver = new Driver(name, licenseNumber);
        driverService.create(driver);
        req.setAttribute("driver", name);
        req.getRequestDispatcher("/WEB-INF/views/drivers/driver_created.jsp").forward(req, resp);
    }
}
