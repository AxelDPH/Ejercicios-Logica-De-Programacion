package ejercicio9;


import java.util.HashMap;
import java.util.Scanner;



public class ejercicio9 {

	
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

        // Solicitar una palabra en español al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase();  // Convertir a minúsculas para hacer la búsqueda insensible a mayúsculas y minúsculas

        // Buscar la traducción en el diccionario
        if (dictionary.containsKey(palabraEspañol)) {
            String palabraInglés = dictionary.get(palabraEspañol);
            System.out.println("La traducción al inglés es: " + palabraInglés);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }//else
  
}// main
	
	
}
