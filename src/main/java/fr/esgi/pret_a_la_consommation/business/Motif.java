package fr.esgi.pret_a_la_consommation.business;

import java.util.List;

public class Motif
{
    private        long   id;
    private        String nom;
    private        String description;
    private static long   compteur = 0L;

    // Inherited class members
    private List<Taux> taux;

    public Motif(long id, String nom, String description)
    {
        this.id = id;
        this.nom = nom;
        this.description = description;

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

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public static long getCompteur()
    {
        return compteur;
    }
}
