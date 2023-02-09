package fr.esgi.pret_a_la_consommation.business;

import java.util.List;

public class Duree
{
    private        long id;
    private        int  dureeEnMois;
    private static long compteur = 0L;

    // Inherited class members
    private List<Taux> taux;

    public Duree(long id, int dureeEnMois)
    {
        this.id = id;
        this.dureeEnMois = dureeEnMois;

        compteur++;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int getDureeEnMois()
    {
        return dureeEnMois;
    }

    public void setDureeEnMois(int dureeEnMois)
    {
        this.dureeEnMois = dureeEnMois;
    }

    public static long getCompteur()
    {
        return compteur;
    }
}
