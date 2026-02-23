package com.example.views;

import java.util.List;

import com.example.model.Avatar;

public class AvatarView {
     public String listUsers(List<Avatar> users){
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");
        builder.append("<theader>");
        builder.append("<tr>");
            builder.append("<th> Name </th>");
            builder.append("<th> UserName </th>");
            builder.append("<th> Email </th>");
        builder.append("</tr>");
        builder.append("</theader>");
        builder.append("<tbody>");
        for (Avatar user : users) {
            builder.append("<tr>");
            builder.append("<td>"+user.getName()+"</td>");
            builder.append("<td>"+user.getUsername()+"</td>");
            builder.append("<td>"+user.getEmail()+"</td>");
            builder.append("</tr>");
            
        }
        builder.append("</tbody>");
        builder.append("</table>");

        return builder.toString();
    }
}
