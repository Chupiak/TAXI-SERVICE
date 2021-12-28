package chupiak.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import chupiak.lib.Injector;
import chupiak.model.Driver;
import chupiak.service.DriverService;

@WebServlet(urlPatterns = "/drivers")
public class GetAllDriversController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("chupiak");
    private final DriverService driverService =
            (DriverService) injector.getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Driver> drivers = driverService.getAll();
        req.setAttribute("drivers", drivers);
        req.getRequestDispatcher("WEB-INF/views/drivers/all_drivers.jsp").forward(req, resp);
    }
}
