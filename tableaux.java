


class tableaux {

    public static int presenceEntier (int[] t, int n) {
        int cpt= 0 ;
        for (int i = 0 ; i < t.length; i++){
            if (n == t[i]){
                cpt++;
            }
        }
        return cpt;
    }
    

    public static int presenceEntier2 (int[] t, int n) {
        int cpt= 0 ;
        for (int x  : t ){
            if (x == n){
                cpt++;
            }
        }
        return cpt;
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


   
    
    public static void main (String[] args){
       int[] t =  {1,3,1,4,4,5,2,3,3,3,7,1};
       int[] t2 =  {1,0,7,4,8,9};

       System.out.println(existeDoublons(t));
       System.out.print(existeDoublons(t2));

        
    }
    }
