package com.example.servlethomework;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String position = request.getParameter("position");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "name  " + name + ", position " + position + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}