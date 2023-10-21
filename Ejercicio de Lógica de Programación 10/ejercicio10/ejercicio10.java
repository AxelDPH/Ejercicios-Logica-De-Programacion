package ejercicio10;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class ejercicio10 {

	   public static void main(String[] args) {
	        // Crear un diccionario Español-Inglés
	        HashMap<String, String> dictionary = new HashMap<>();
	        dictionary.put("gato", "cat");
	        dictionary.put("garras", "claws");
	        dictionary.put("orejas", "ears");
	        dictionary.put("bigotes", "whiskers");
	        dictionary.put("rasguñar", "scratch");
	        dictionary.put("arena", "sand");
	        dictionary.put("pelusa", "fluff");
	        dictionary.put("esponjoso", "fluffy");
	        dictionary.put("maullido", "meow");
	        dictionary.put("ronroneo", "purr");
	        dictionary.put("ratón", "mouse");
	        dictionary.put("rascar", "scrape");
	        dictionary.put("comida", "food");
	        dictionary.put("mantequilla", "butter");
	        dictionary.put("manchas", "spots");
	        dictionary.put("cazar", "hunt");
	        dictionary.put("acicalar", "groom");
	        dictionary.put("amasar", "knead");
	        dictionary.put("bufido", "hiss");
	        dictionary.put("cola", "tail");

	        // Lista para almacenar palabras aleatorias del diccionario
	        ArrayList<String> wordsList = new ArrayList<>(dictionary.keySet());

	        // Solicitar al usuario la traducción al inglés de cada palabra
	        Scanner scanner = new Scanner(System.in);
	        int rightAnswers = 0;
	        int wrongAnswers = 0;

	        for (int i = 0; i < 5; i++) {
	            // Generar un índice aleatorio para seleccionar una palabra del diccionario
	            int randomIndex = new Random().nextInt(wordsList.size());
	            String spanishWord = wordsList.get(randomIndex);
	            System.out.print("Traduce '" + spanishWord + "' al inglés: ");
	            String userAnswer = scanner.nextLine().toLowerCase();

	            if (dictionary.containsKey(spanishWord)) {
	                String rightTranslation = dictionary.get(spanishWord);

	                if (userAnswer.equals(rightTranslation)) {
	                    System.out.println("¡Correcto!");
	                    rightAnswers++;
	                } else {
	                    System.out.println("Incorrecto. La respuesta correcta es '" + rightTranslation + "'.");
	                    wrongAnswers++;
	                }
	            } else {
	                System.out.println("La palabra no se encuentra en el diccionario.");
	                wrongAnswers++;
	            } //else

	            // Eliminar la palabra del diccionario temporal
	            wordsList.remove(randomIndex);
	        } // cierre for

	        // Mostrar el resultado al usuario
	        System.out.println("Respuestas correctas: " + rightAnswers);
	        System.out.println("Respuestas incorrectas: " + wrongAnswers);
	    } // class main
	
	
}
