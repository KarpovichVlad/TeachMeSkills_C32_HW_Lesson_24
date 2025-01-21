package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import main.model.log.Logger;

import java.io.IOException;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 0;
        }
        count++;
        session.setAttribute("count", count);
        Logger.log("Обрабатывается запрос /count. Число посещений: " + count);
        try {
            resp.getWriter().write("Number of visits: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








