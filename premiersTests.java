import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String str1 = "bonjour";
		String str2 = "bonjour";
		
		
		//test1 sur str2 et str1
		
		if(str1 == str2){
		    System.out.println(str1 + " est egal a " + str2);
		    
		}
		else{
		     System.out.println(str1 + " est different de " + str2);
		}
		
		//test2 sur str1 et la chaine "bonjour" saisie par 
		// l utilisateur
	    System.out.println("saisir :  bonjour");
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		if(str1 == s){
		    System.out.println("test2 : "+ s + " est egal a " + str1);
		    
		}
		else{
		     System.out.println("test2 : " + s + " est different de " + str1);
		}
		
	
	
	//Remarque : on observe que lorsque les chaines de caracteres
	//sont initialisees dans le programme l egalite fonctionne,
	//en revanche lorsque les chaines sont saisies par l utilisateur
	//l operation " == " ne fonctionne plus.
	
	//test3 : une autre egalite
	
	if(str1.equals(s)){
		    System.out.println("test3 : " + s+ " est egal a " + str1);
		    
		}
		else{
		     System.out.println("test2 : " + s + " est different de " + str1);
		}
		
}
}