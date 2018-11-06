import java.lang.Math;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class desAlea {

    public static int[] fct (){
       
        int [] t = new int[2];
       /*On declare deux entiers de1 et de2 et on les initialise aleatoirement */  
        t[0] = de1;
        t[1] = de2;
        return t;
    }

    public static int[][] plusieursLancers (int nbLancers) {
        int tab[][] = new int[nbLancers][2];
        for (int i = 0 ; i < nbLancers ; i++) {

                int val1  = fct()[0];
                int val2  = fct()[1];

                tab[i][0] = val1;
                tab[i][1] = val2;
            
        }
        return tab;
    }

    public static void lire (int t[][]){
        for (int[] x : t) {
            for (int y : x) {
            System.out.print(y + "  ");
        }
        }
    }

public static boolean ds(int[]t){
    if (t[0] == t[1]){
        return true;
    }
    else {
        return false;
    }
}

public static int doubleSix (int[][] t){
    List<List<Integer>> six = new ArrayList<List<Integer>>();
    int n = 0;
    for (int[] x : t) {
        if (ds (x)){
            n++;
            }
        }
    return n;
    }

public static char randomChar(){
/*
   -  generez un entier compris dans un intervalle  aleatoirement
   -  Pour chaque entier defini precedemment, associez un caractere.
   -  Par exemple 
                si l entier est 1 alors le caractere sera "/"
                si l entier est 2 alors le caractere sera "*"
                sinon le caractere sera "-"

*/
}

public static void dessin(){

    for (int i = 0  ; i <=9 ; i ++) {
        for (int j = 0 ; j <=9 ; j ++) {
            System.out.print(randomChar());
            System.out.print("\t");
        }
        System.out.println(" ");
    }

}

public static void main(String[] args){
}

}