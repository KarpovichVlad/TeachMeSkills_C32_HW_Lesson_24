package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.model.log.Logger;

import java.io.IOException;

@WebServlet("/myGoals")
public class MyGoalsServlet extends HttpServlet {

    @Override
    public void init() {
        Logger.log("Сервлет MyGoalsServlet был инициализирован.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        Logger.log("Обрабатывается запрос /myGoals");
        try {
            resp.getWriter().write("<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"><title>My Goals</title></head><body>");
            resp.getWriter().write("<h1>My Goals</h1>");
            resp.getWriter().write("<ul>");
            resp.getWriter().write("<li>Completion of Java Development courses</li>");
            resp.getWriter().write("<li>Successful completion of all exams at the university</li>");
            resp.getWriter().write("<li>Sports activities</li>");
            resp.getWriter().write("<li>Be less nervous</li>");
            resp.getWriter().write("</ul>");
            resp.getWriter().write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        Logger.log("Сервлет MyGoalsServlet уничтожен.");
    }
}
