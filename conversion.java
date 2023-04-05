 package samira.anani;


import java.util.*; 


public class conversion {
public static void main(String args[]) {
	
	int afficher= conversion();
	System.out.println("le degré rentré donne"+afficher+"en degré fahrenheit.");
	
    }


public static int conversion(){
	
	System.out.println("Entrer le  degré ");
	Scanner scanner=new Scanner (System.in);
	int nombre= scanner.nextInt(); 
	
	double F = (nombre * 1.8) + 32;
	return (int) F;
			
        }
	
  }



