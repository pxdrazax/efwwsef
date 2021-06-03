import java.util.Scanner;

public class Refactorizar{
	
	public static void main(String[] args) {
		
		String nombre,dni,numeroVacunacion="",vacunaUno="",vacunaDos="",mesVacuna1="",mesVacuna2="";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombre = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dni = teclado.next();
		System.out.println("¿Vacuna 1 o 2?");
		numeroVacunacion = teclado.next();
		
		if(numeroVacunacion.equals("1")) {
			System.out.println("Introduzca la vacuna 1: ");
			vacunaUno = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 1:");
			mesVacuna1 = teclado.next();
			
		}else if(numeroVacunacion.equals("2")) {
			
			System.out.println("Introduzca la vacuna 2: ");
			vacunaDos = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 2:");
			mesVacuna2 = teclado.next();
			
		}else {
			System.out.println("Error");
		}
						
		System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
		System.out.println("Vacuna 1 "+ vacunaUno +" Fecha:"+mesVacuna1);
		System.out.println("Vacuna 2 "+ vacunaDos+" Fecha:"+mesVacuna2);
}
	
	
	
	
	/**
	 * 
	 * @param dni es el atributo dni
	 * @param nombre es el nombre
	 * @param vacuna1 es la primera vacuna
	 * @param vacuna2 es la segunda vacuna
	 * @param mesVacuna1 es el primer mes de la vacuna
	 * @param mesVacuna2 es el segundo mes de la vacuna
	 */
	private static void ComprobarPAciente(String dni,String nombre,String vacuna1,String vacuna2,String mesVacuna1,String mesVacuna2){
		System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni + "_________________");
		System.out.println("Vacuna 1 "+ vacuna1 +" Fecha:"+mesVacuna1);
		System.out.println("Vacuna 2 "+ vacuna2+" Fecha:"+mesVacuna2);
		
		if(vacuna2.equals("")) {
			if(vacuna1.equals("Moderna")) {
				System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
			}else if(vacuna1.equals("Pfizer")) {
				System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
			}else if(vacuna1.equals("Janssen")) {
				System.out.println("El paciente está ya vacuando");
			}else {
				System.out.println("El paciente "+ nombre + " está ya vacunado ");
			}
		}		
}
	}
	
	
	
	
	
	
	
	
	

	