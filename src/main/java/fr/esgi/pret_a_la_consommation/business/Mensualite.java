package fr.esgi.pret_a_la_consommation.business;

import java.time.LocalDate;

public class Mensualite
{
    private        long      id;
    private        LocalDate datePrelevement;
    private        double    partInteretsRembourses;
    private        double    partCapitalRembourse;
    private static long      compteur = 0L;

    public Mensualite(long id, LocalDate datePrelevement, double partInteretsRembourses, double partCapitalRembourse)
    {
        this.id = id;
        this.datePrelevement = datePrelevement;
        this.partInteretsRembourses = partInteretsRembourses;
        this.partCapitalRembourse = partCapitalRembourse;

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

    public LocalDate getDatePrelevement()
    {
        return datePrelevement;
    }

    public void setDatePrelevement(LocalDate datePrelevement)
    {
        this.datePrelevement = datePrelevement;
    }

    public double getPartInteretsRembourses()
    {
        return partInteretsRembourses;
    }

    public void setPartInteretsRembourses(double partInteretsRembourses)
    {
        this.partInteretsRembourses = partInteretsRembourses;
    }

    public double getPartCapitalRembourse()
    {
        return partCapitalRembourse;
    }

    public void setPartCapitalRembourse(double partCapitalRembourse)
    {
        this.partCapitalRembourse = partCapitalRembourse;
    }

    public long getCompteur()
    {
        return compteur;
    }
}
