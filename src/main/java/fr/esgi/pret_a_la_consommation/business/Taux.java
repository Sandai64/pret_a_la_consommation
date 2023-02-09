package fr.esgi.pret_a_la_consommation.business;

public class Taux
{
    private        long   id;
    private        double valeur;
    private static long   compteur = 0L;

    public Taux(long id, double valeur)
    {
        this.id = id;
        this.valeur = valeur;

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

    public double getValeur()
    {
        return valeur;
    }

    public void setValeur(double valeur)
    {
        this.valeur = valeur;
    }

    public static long getCompteur()
    {
        return compteur;
    }
}
