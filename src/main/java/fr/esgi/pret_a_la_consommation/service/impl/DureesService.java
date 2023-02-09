package fr.esgi.pret_a_la_consommation.service.impl;

import fr.esgi.pret_a_la_consommation.business.Client;
import fr.esgi.pret_a_la_consommation.business.Duree;

import java.util.ArrayList;
import java.util.List;

public class DureesService
{
    private final List<Duree> durees;

    public DureesService()
    {
        this.durees = new ArrayList<>();

        clients.add(new Client(0, "Albert",    "Thomas"));
        clients.add(new Client(1, "Allon",     "Muske"));
        clients.add(new Client(2, "Dieu",      "Donné"));
        clients.add(new Client(3, "Gérard",    "Dapardia"));
        clients.add(new Client(4, "Dominique", "Strass-Kauhn"));
    }

    @Override
    public List<Duree> getDurees()
    {
        return this.durees;
    }
}
