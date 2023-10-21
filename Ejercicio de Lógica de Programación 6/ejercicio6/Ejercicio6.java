package ejercicio6;
import java.util.*;

	

	public class Ejercicio6 {

	 public static void main(String[] args) {
	  Scanner Scan = new Scanner(System.in);
	System.out.println("Ingresa una frase para que se muestre al revés");
	String phrase = Scan.nextLine();
	Scan.close();
	char [] arrayPhrase= phrase.toCharArray();
	String reversed = "";

	for (int i = arrayPhrase.length-1; i>=0; i --) {
	 reversed += arrayPhrase[i];
	}//cierrefor
	System.out.println("Tu frase de forma inversa es:  " + reversed);


	 }//cierre main

	}//clase ejercicio


