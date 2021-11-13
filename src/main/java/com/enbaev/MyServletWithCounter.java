package com.enbaev;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServletWithCounter extends HttpServlet {
    int counterGet;
    int counterPost;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Count of GET : " + counterGet++);
        response.getWriter().println("Count of POST : " + counterPost);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Count of GET : " + counterGet);
        response.getWriter().println("Count of POST : " + counterPost++);
    }
}