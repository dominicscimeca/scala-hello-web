package com.cj.dscimeca.scala;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public abstract class HttpApp extends HttpServlet
{
    public abstract void handle(HttpServletRequest request, HttpServletResponse response);

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("inside and our");
        handle(req, resp);
//        super.service(req, resp);
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
