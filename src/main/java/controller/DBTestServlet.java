package controller;

import java.io.IOException;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import util.DBConnection;

@WebServlet("/DBTestServlet")
public class DBTestServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        try (Connection con = DBConnection.getConnection()) {

            response.getWriter().println("<h2>Database Connected Successfully!</h2>");

        } catch (Exception e) {

            response.getWriter().println("<h2>Database Connection Failed!</h2>");
            e.printStackTrace();
        }
    }
}