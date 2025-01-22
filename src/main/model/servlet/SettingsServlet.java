package main.model.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/settings")
public class SettingsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        String appName = getServletContext().getInitParameter("appName");
        String appVersion = getServletContext().getInitParameter("appVersion");
        String developerName = getServletContext().getInitParameter("developerName");
        String supportEmail = getServletContext().getInitParameter("supportEmail");

        try {
            resp.getWriter().write("<h1>App Settings</h1>");
            resp.getWriter().write("<p>App Name: " + appName + "</p>");
            resp.getWriter().write("<p>App Version: " + appVersion + "</p>");
            resp.getWriter().write("<p>Developer Name: " + developerName + "</p>");
            resp.getWriter().write("<p>Support Email: " + supportEmail + "</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}








