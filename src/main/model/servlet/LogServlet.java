package main.model.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import main.model.constants.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

@WebServlet("/logs")
public class LogServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String logContent = new String(Files.readAllBytes(Paths.get(Constants.LOG_FILE_PATH)), StandardCharsets.UTF_8);

        response.getWriter().write("<html><body><pre>" + logContent + "</pre></body></html>");
    }
}





