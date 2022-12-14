package ru.kiraell;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class App {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();

        Server server = new Server(8080); // server jetty создаём сервер и задаём порт где будет работать
        ServletContextHandler context = // создание сервлет контейнера
                new ServletContextHandler(ServletContextHandler.SESSIONS);  //  http localhost:8080/authform
        server.setHandler(context);
        context.addServlet(new ServletHolder(frontend), "/authform"); // stepik 1.3-9 https://stepik.org/lesson/12196/step/9?unit=2765

        server.start();
        server.join();

    }
}
