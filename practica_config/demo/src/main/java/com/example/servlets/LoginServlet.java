package com.example.servlets;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.example.services.UserService;
import com.example.views.UsersView;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    private UserService service;
    private Gson encoder;
    private UsersView view;
    @Override
    public void init() throws ServletException {
        encoder = new Gson();
        ApplicationContext context = 
                WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        service = context.getBean(UserService.class);
        view=new UsersView();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }


}
