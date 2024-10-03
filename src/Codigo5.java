import java.util.Scanner; // Se importa la clase java.util.Scanner

public class Codigo5 {

	public static void main (String[] args) { // Se agrega main
		
		Scanner sc = new Scanner(System.in); // Se agrega el inputStream para la entrada de datos
	    System.out.print("Introduzca un número: "); // Se corrigen las comillas "'
	    
	    String ni = sc.nextLine(); // Captura el num como String
	    int num = Integer.parseInt(ni); // Se convierte String a int
	    
	    int afo = 0; // Variable contador para afortunados inicializado en 0
	    int noAfo = 0; // Variable contador para no aofrtunados inicializado en 0
	    
	    while (num > 0) { // Se utiliza "num" para evaluar
		  int digito = num % 10; // Se obtiene el último dígito del número
		  
	      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) { // Se verifica si el número es afo
			afo++;
	      } else {
			noAfo++;
	      } // Se cierra else
		  
		  num /= 10; // Elimina el último dígito del num
	    } // while
	      
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado."); // Se corrige prinln
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
	    
	    sc.close(); // Se cierra Scanner
	    
	}// main
}// class Codigo 5