package fr.esgi.pret_a_la_consommation;

import fr.esgi.pret_a_la_consommation.business.Client;
import fr.esgi.pret_a_la_consommation.business.Duree;
import fr.esgi.pret_a_la_consommation.business.Motif;
import fr.esgi.pret_a_la_consommation.business.Taux;
import fr.esgi.pret_a_la_consommation.service.impl.ClientsService;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
        // Instantiate default objects beforehand. We'll ask for input later.
        List<Client> appClients = new ClientsService().getClients();
        List<Motif>  appMotifs  = new ArrayList<>();
        List<Duree>  appDurees  = new ArrayList<>();
        List<Taux>   appTaux    = new ArrayList<>();



    }
}
