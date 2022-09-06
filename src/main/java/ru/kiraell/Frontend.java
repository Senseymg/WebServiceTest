package ru.kiraell;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Frontend extends HttpServlet { // в каждом http сервлете можно разместить две функции дугет и дупост
    private String login = "";

    public void doGet(HttpServletRequest request, // в реквесте джетти сообщает все переменные которые могут понадобится пользователю
                      HttpServletResponse response) // в респонзе пишем строку которая превратится в страницу у поьзователя
            throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {

    }
}
