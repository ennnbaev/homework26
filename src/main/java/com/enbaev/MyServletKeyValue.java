package com.enbaev;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class MyServletKeyValue extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String[]> allRequest = request.getParameterMap();
        allRequest.forEach((keys, values) -> {
            try {
                response.getWriter().println(keys + " = " + values[0]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
