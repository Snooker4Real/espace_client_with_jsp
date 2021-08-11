package fr.humanbooster.fx.espace_client.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/tableauBord", loadOnStartup = 1)
public class TableauDeBordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TableauDeBordServlet() {

    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest req, HttpServletResponse res)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

    }

}
