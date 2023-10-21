package ejercicio7;



	
	import java.util.Scanner;
	import java.time.DayOfWeek;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
	import java.time.temporal.ChronoUnit;

	public class ejercicio7 {
	    public static void main(String[] args) {
	        // Crear un objeto Scanner para la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar al usuario un día de la semana (Lunes - Viernes)
	        System.out.print("Ingresa un día de la semana (Lunes - Viernes): ");
	        String diaIngresado = scanner.nextLine().trim();

	        // Solicitar al usuario una hora (horas y minutos)
	        System.out.print("Ingresa una hora en formato HH:mm: ");
	        String horaIngresada = scanner.nextLine().trim();

	        // Cerrar el Scanner
	        scanner.close();

	        // Mapear el día ingresado a un valor DayOfWeek
	        DayOfWeek diaObjetivo = mapearDiaDeLaSemana(diaIngresado);

	        if (diaObjetivo != null) {
	            // Crear la fecha y hora objetivo
	            LocalDateTime fechaHoraObjetivo = LocalDateTime.now()
	                    .with(diaObjetivo)
	                    .with(LocalTime.parse(horaIngresada));

	            // Calcular la diferencia en minutos entre la fecha actual y el fin de semana (Viernes a las 15:00 hrs)
	            LocalDateTime inicioDelFinDeSemana = LocalDateTime.now().with(DayOfWeek.FRIDAY).with(LocalTime.of(15, 0));
	            long minutosRestantes = ChronoUnit.MINUTES.between(fechaHoraObjetivo, inicioDelFinDeSemana);

	            if (minutosRestantes > 0) {
	                System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");
	            } else {
	                System.out.println("¡Es fin de semana!");
	            }
	        } else {
	            System.out.println("Día de la semana no válido.");
	        }
	    }

	    // Método para mapear un String a un valor DayOfWeek
	    private static DayOfWeek mapearDiaDeLaSemana(String diaIngresado) {
	        switch (diaIngresado.toLowerCase()) {
	            case "lunes":
	                return DayOfWeek.MONDAY;
	            case "martes":
	                return DayOfWeek.TUESDAY;
	            case "miércoles":
	                return DayOfWeek.WEDNESDAY;
	            case "jueves":
	                return DayOfWeek.THURSDAY;
	            case "viernes":
	                return DayOfWeek.FRIDAY;
	            default:
	                return null;
	        }
	    }
	}

	

	
	

