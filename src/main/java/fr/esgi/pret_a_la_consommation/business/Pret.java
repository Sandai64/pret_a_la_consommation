package fr.esgi.pret_a_la_consommation.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pret
{
    private        long          id;
    private        double        montantDemande;
    private        double        montantMensualite;
    private        LocalDateTime dateSouscription;
    private        LocalDate     dateEffet;
    private        String        observations;
    private static long          compteur = 0L;

    // Inherited class members
    private List<Mensualite> mensualites;

    public Pret(long id, double montantDemande, double montantMensualite, LocalDateTime dateSouscription, LocalDate dateEffet, String observations)
    {
        this.id = id;
        this.montantDemande = montantDemande;
        this.montantMensualite = montantMensualite;
        this.dateSouscription = dateSouscription;
        this.dateEffet = dateEffet;
        this.observations = observations;

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

    public double getMontantDemande()
    {
        return montantDemande;
    }

    public void setMontantDemande(double montantDemande)
    {
        this.montantDemande = montantDemande;
    }

    public double getMontantMensualite()
    {
        return montantMensualite;
    }

    public void setMontantMensualite(double montantMensualite)
    {
        this.montantMensualite = montantMensualite;
    }

    public LocalDateTime getDateSouscription()
    {
        return dateSouscription;
    }

    public void setDateSouscription(LocalDateTime dateSouscription)
    {
        this.dateSouscription = dateSouscription;
    }

    public LocalDate getDateEffet()
    {
        return dateEffet;
    }

    public void setDateEffet(LocalDate dateEffet)
    {
        this.dateEffet = dateEffet;
    }

    public String getObservations()
    {
        return observations;
    }

    public void setObservations(String observations)
    {
        this.observations = observations;
    }

    public static long getCompteur()
    {
        return compteur;
    }
}
