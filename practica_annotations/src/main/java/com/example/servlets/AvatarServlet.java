package com.example.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.example.model.Avatar;
import com.example.services.AvatarService;
import com.example.views.AvatarView;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/avatars")
public class AvatarServlet extends HttpServlet  {
    private AvatarService avatarService;
    private Gson encoder;
    private AvatarView avatarView;
    @Override
    public void init(){
        encoder=new Gson();
        ApplicationContext context=WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        avatarService=context.getBean(AvatarService.class);
        avatarView=new AvatarView();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Avatar> avatars=avatarService.getAvatars();
        StringBuilder builder=new StringBuilder();
        builder.append("<html>");

        builder.append("<body>");
        builder.append(avatarView.listUsers(avatars));
        builder.append("</body>");
        builder.append("</html>");

        resp.setContentType("text/html");
        resp.getWriter().println(builder.toString());
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader=req.getReader();
        String body="";
        boolean end=false;
        while (!end) {
            String current = reader.readLine();
            if(current == null){
                end = true;
            }else{
                body += current;
            }
        }

        Map<String,String> data = encoder.fromJson(body, HashMap.class);
        System.out.println(data);
    }

    
}
