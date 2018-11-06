import java.util.Scanner;
import java.util.Random;
public class pm{
    public static void fct(int nombre){
        int coups = 0 ;
        Scanner sc = new Scanner (System.in);
        Random r = new Random();
        int  saisie = r.nextInt(50) + 1;

    /*
    Demander la saisie d un entier;
    Si l entier est correct afficher un message indiquant que la partie
    est finie et le score.
    Sinon afficher une indication ("le nombre doit etre superieur/inferieur")
    */
        do {
             System.out.println("saisir un nombre");
            saisie = sc.nextInt();

            if (saisie<nombre){
                System.out.println("trop petit");
                coups++;
            }
            else {
                if  (saisie>nombre){
                System.out.println("trop grand");
                coups++;
            }
                else {
                    System.out.println("bravo, en " + coups + " coups ");
                }
            }
           
        }
 while(saisie != nombre);

    }
 
    public static void main (String[] args) {
        fct(x);
        /*
        Pour le moment c est correct mais l utilisateur ne peut effectuer qu une seule partie,
        modifier le code pour qu il puisse jouer autant de parties qu il le souhaite.
        Par exemple vous pouvez 
            - declarer une chaine de caractere s , l initialiser a "Oui" 
            - tant que la chaine vaut Y
                - lancer une partie
                - afficher "Souhaitez vous jouer de nouveau : Oui ou Non",
        */

    }
}
