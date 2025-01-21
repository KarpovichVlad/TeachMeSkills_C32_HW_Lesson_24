package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.model.log.Logger;

import java.io.IOException;

@WebServlet("/aboutMe")
public class AboutMeServlet extends HttpServlet {

    @Override
    public void init() {
        Logger.log("Сервлет AboutMeServlet был инициализирован.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        Logger.log("Обрабатывается запрос /aboutMe");
        try {
            resp.getWriter().write("<!DOCTYPE html><html><head><title>About Me</title></head><body>");
            resp.getWriter().write("<h1>About Me</h1>");
            resp.getWriter().write("<ul>");
            resp.getWriter().write("<li>My name is Vlad</li>");
            resp.getWriter().write("<li>I am 18 years old</li>");
            resp.getWriter().write("<li>I am studying at the BNTU Faculty of Mechanical Engineering</li>");
            resp.getWriter().write("<li>I am a kind, empathetic, honest, slightly fearful, and responsible person</li>");
            resp.getWriter().write("</ul>");
            resp.getWriter().write("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        Logger.log("Сервлет AboutMeServlet уничтожен.");
    }
}







