package fr.esgi.pret_a_la_consommation.util;

public class Formulas
{
    /**
     *
     * @param capital Self-explanatory
     * @param mensualiteCount Self-explanatory
     * @param annualInterest Expressed as a floating-point percentage (ie. 0.05 == 5%)
     * @return double
     */
    static double computeMensualites(float capital, int mensualiteCount, float annualInterest)
    {
        float mensualInterest = annualInterest / 12;
        return (capital * mensualInterest / (1 - Math.pow(1 + mensualInterest, -mensualiteCount)));
    }
}
