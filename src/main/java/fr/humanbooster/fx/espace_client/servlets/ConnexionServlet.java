package fr.humanbooster.fx.espace_client.servlets;

import fr.humanbooster.fx.espace_client.business.CarteBancaire;
import fr.humanbooster.fx.espace_client.business.Client;
import fr.humanbooster.fx.espace_client.service.ClientService;
import fr.humanbooster.fx.espace_client.service.impl.ClientServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet(urlPatterns = "/connexion", loadOnStartup = 1)
public class ConnexionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ClientService clientService = null;

    /**
     * Default constructor
     */
    public ConnexionServlet() {

        clientService = new ClientServiceImpl();

        Random rand = new Random();
        int maxNumber = 10;
        int randomNumber = rand.nextInt(maxNumber)+1;

        Client client1 = new Client("","","client1@hb.fr","client1");
        Client client2 = new Client("","","client2@hb.fr","client1");
        Client client3 = new Client("","","client3@hb.fr","client1");
        Client client4 = new Client("","","client4@hb.fr","client1");
        Client client5 = new Client("","","client5@hb.fr","client1");
        Client client6 = new Client("","","client6@hb.fr","client1");
        Client client7 = new Client("","","client7@hb.fr","client1");
        Client client8 = new Client("","","client8@hb.fr","client1");
        Client client9 = new Client("","","client9@hb.fr","client1");
        Client client10 = new Client("","","client10@hb.fr","client1");


        CarteBancaire cb1 = new CarteBancaire("5507824049723976",04,2024,"561", client1);
        CarteBancaire cb2 = new CarteBancaire("5297060608001843",05,2021,"640", client1);
    }


    /**
     * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse resp)
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //On récupère les données saisies sur le formulaire de connexion
        String email = req.getParameter("mail");
        String motDePasse = req.getParameter("mdp");
        //System.out.println(email);
        //System.out.println(motDePasse);

        // On essaie de récupérer un client avec ses données
        Client client = clientService.recupererClient(email, motDePasse);
        if((email.equals("client1@hb.fr") && motDePasse.equals("client1")) ||
                (email.equals("client2@hb.fr") && motDePasse.equals("client2")) ||
                (email.equals("client3@hb.fr") && motDePasse.equals("client3")) ||
                (email.equals("client4@hb.fr") && motDePasse.equals("client4")) ||
                (email.equals("client5@hb.fr") && motDePasse.equals("client6")) ||
                (email.equals("client7@hb.fr") && motDePasse.equals("client7")) ||
                (email.equals("client8@hb.fr") && motDePasse.equals("client8")) ||
                (email.equals("client9@hb.fr") && motDePasse.equals("client9")) ||
                (email.equals("client10@hb.fr") && motDePasse.equals("client10"))){
            //Le client a saisie le bon email + mdp

            System.out.println("Connexion de qqun");
            //On passe le relai à la servlet TableauDeBord
            //resp.sendRedirect("tableauBord");
            req.getRequestDispatcher("WEB-INF/tableauDeBord.jsp").forward(req, resp);
        } else {
            req.setAttribute("erreur", "email et/ou mot de passe incorrect");
            req.getRequestDispatcher("WEB-INF/index.jsp").forward(req,resp);
        }
    }


}
