package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import main.model.log.Logger;

import java.io.IOException;

@WebServlet("/reset")
public class ResetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        session.setAttribute("count", 0);
        Logger.log("Сброс счетчика посещений.");
        try {
            resp.getWriter().write("Visit count has been reset.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




