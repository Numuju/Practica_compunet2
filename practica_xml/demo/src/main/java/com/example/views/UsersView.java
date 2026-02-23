package com.example.views;
import java.util.List;
import com.example.model.User;
public class UsersView {
    public String listUsers(List<User> users){
        StringBuilder builder=new StringBuilder();
        builder.append("<table>");
        builder.append("<theader>");
        builder.append("<tr>");
            builder.append("<th> ID</th>");
            builder.append("<th> Name </th>");
            builder.append("<th> UserName</th>");
        builder.append("</tr>");    
        builder.append("<tbody>");
        for (User user:users){
            builder.append("<tr>");
            builder.append("<td>"+user.getId()+"</td>");
            builder.append("<td>"+user.getName()+"</td>");
            builder.append("<td>"+user.getUsername()+"</td>");

            builder.append("</tr>");
        }
        builder.append("</tbody>");
        builder.append("</theader>");

        return builder.toString();
    }
}
