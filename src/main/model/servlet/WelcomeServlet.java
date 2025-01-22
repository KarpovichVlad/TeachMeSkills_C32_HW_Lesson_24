package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("<!DOCTYPE html><html><head><title>Добро пожаловать</title></head><body>");
        resp.getWriter().write("<h1>Добро пожаловать в наше приложение!</h1>");
        resp.getWriter().write("<p>Спасибо за визит.</p>");
        resp.getWriter().write("</body></html>");
    }
}


