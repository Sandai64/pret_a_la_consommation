package fr.esgi.pret_a_la_consommation.business;

import java.util.List;

public class Client
{
    private        long   id;
    private        String nom;
    private        String prenom;
    private static long   compteur = 0L;

    // Inherited class members
    private List<Pret> prets;

    public Client(long id, String nom, String prenom)
    {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

        compteur++;
    }


}
