package question1;

import java.lang.String;
/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for (int i = 0; i < args.length; i++) {
            int fahrenheit = Integer.parseInt(args[i]);
            float celsius = fahrenheitEnCelsius(fahrenheit);
            
            System.out.println(fahrenheit + "\u00B0F -> " + String.format("%.1f", celsius) + "\u00B0C"); 
        }                                                                   
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        double result=0;
        double celsius = (float)5/9 * (f -32);
        result = Math.round(celsius*10)/10.0;
        
        return (float)result;
    }

}
