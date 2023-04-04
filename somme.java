package samira.anani;




import java.util.*;

public class somme {

	public static void main(String args[]) {
		int resultat=somme();
		System.out.println("resultat="+resultat+".");
		System.out.println("");
		}
	
	public static int somme(){
		int a;
		int b;
		
		System.out.println("Entrer le premier nombre");
		Scanner scanner=new Scanner (System.in);
		a= scanner.nextInt(); 
		System.out.println("Entrer le second nombre");
		b= scanner.nextInt();
		int nombre= a+ b;
				return nombre;
		
	}
	
}
