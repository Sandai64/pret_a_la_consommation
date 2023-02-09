package fr.esgi.pret_a_la_consommation.service.impl;

import fr.esgi.pret_a_la_consommation.business.Client;
import fr.esgi.pret_a_la_consommation.service.ClientsInterface;

import java.util.ArrayList;
import java.util.List;

public class ClientsService implements ClientsInterface
{
    private final List<Client> clients;

    public ClientsService()
    {
        this.clients = new ArrayList<>();
        this.clients.add(new Client(0, "Albert",    "Thomas"));
        this.clients.add(new Client(1, "Allon",     "Muske"));
        this.clients.add(new Client(2, "Dieu",      "Donné"));
        this.clients.add(new Client(3, "Gérard",    "Dapardia"));
        this.clients.add(new Client(4, "Dominique", "Strass-Kauhn"));
    }

    @Override
    public List<Client> getClients()
    {
        return this.clients;
    }
}
