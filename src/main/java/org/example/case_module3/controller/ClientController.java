package org.example.case_module3.controller;

import org.example.case_module3.service.Client.ClientDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClientServlet", urlPatterns = "/client")
public class Client extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClientDAO clientDAO=new ClientDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(req, resp);
                break;
            case "edit":
                showEditForm(req, resp);
                break;
            case "delete":
                showDeleteForm(req, resp);
                break;
            default:
                listClients(req, resp);
                break;
        }
    }

    private void listClients(HttpServletRequest req, HttpServletResponse resp) {
        List<Client> clientList = clientDAO.selectAll();
        req.setAttribute("listPresent", clientList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("present/list.jsp");
        try {
            requestDispatcher.forward(req, resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showDeleteForm(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showEditForm(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void showCreateForm(HttpServletRequest req, HttpServletResponse resp) {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertClient(req, resp);
                break;
            case "edit":
                updateClient(req, resp);
                break;
            case "delete":
                deleteClient(req, resp);
                break;
            default: {
                break;
            }
        }    
    }

    private void deleteClient(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void updateClient(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void insertClient(HttpServletRequest req, HttpServletResponse resp) {
    }
}
