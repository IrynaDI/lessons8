package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


public class LoginServlet  extends HttpServlet {


    UsersList usersList = UsersList.getInstance();

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException  {
        String login = req.getParameter("login");
        String pass = req.getParameter("password");


        try {
            PrintWriter pw = res.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}