package fr.esgi.pret_a_la_consommation.service.impl;

import fr.esgi.pret_a_la_consommation.business.Duree;
import fr.esgi.pret_a_la_consommation.service.DureesInterface;

import java.util.ArrayList;
import java.util.List;

public class DureesService implements DureesInterface
{
    private final List<Duree> durees;

    public DureesService()
    {
        this.durees = new ArrayList<>();

        this.durees.add(new Duree(0, 12));
        this.durees.add(new Duree(1, 24));
    }

    @Override
    public List<Duree> getDurees()
    {
        return this.durees;
    }
}
