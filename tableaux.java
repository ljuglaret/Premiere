


class tableaux {
    
    //Exemple1 : afficher tous les élements d un tableau
    
    public static void aff(int[] t){
        for(int e : t){
            System.out.print(e+" ");
        }
    }
    
    // Pareil : 
    
    public static void aff(int[] t){
        for(int i = 0 ; i<t.length;i++){
            System.out.print(t[i]+" ");
        }
    }


    public static int presenceEntier (int[] t, int n) {
        // Compléter pour retourner le nombre de fois où l entier n est présent dans le tableau t
    }
    

    public static int presenceEntier2 (int[] t, int n) {
      // Pareil mais avec une syntaxe différente
      // => for (int x  : t )
    }

    public static boolean existeDoublons (int[] t ){
        boolean doublons = false;
        for(int i = 0 ; i< t.length; i++){
            for(int j = i + 1 ; j < t.length -1  ; j++){
                if (t[i] == t[j]){
                    doublons = true;
                }
            }  
        }
        return doublons;
    }


   
// On peut aussi utiliser des tableaux à deux dimensions (comme une grille de jeux)

    public static int parite (int[][] t){
      //  Cette fonction doit compter le nombre d élements pairs du tableau t.

    }

/*

C est votre tour : 

1) Dans un tableau d entiers de dimension 1 afficher le maximum et son indice.
2) Dans un tableau d entiers de dimension 1 retourner la moyenne.
3) Dans un tableau d entiers de dimensions 2 avec autant de lignes et de colonnes retourner
    ce tableau mais en inversant lignes etécolonnes.
    Exemple
         1 2 5        1 3 7
         3 4 6    =>  2 4 8
         7 8 9        5 6 9

4) Dans un tableau d entiers  de dimension 2 afficher la somme des lignes et celles des colonne.
    (La question 3 peut servir)


5) Une fonction pour afficher une tableau  à deux dimensions.

*/

    
    public static void main (String[] args){
       int[] t =  {1,3,1,4,4,5,2,3,3,3,7,1};
       int[] t2 =  {1,0,7,4,8,9};
        int [][]t3= {{1,2,9,8},{3,4,5}};
       System.out.println(existeDoublons(t));
       System.out.println(existeDoublons(t2));
        System.out.println(parite(t3));
        
    }
    }
    
    public static void main (String[] args){
       int[] t =  {1,3,1,4,4,5,2,3,3,3,7,1};
       int[] t2 =  {1,0,7,4,8,9};

       System.out.println(existeDoublons(t));
       System.out.print(existeDoublons(t2));

        
    }
    }
