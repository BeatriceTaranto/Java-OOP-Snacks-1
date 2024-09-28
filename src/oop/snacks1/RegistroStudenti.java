package oop.snacks1;

/*Crea una classe RegistroStudenti che rappresenti un registro di studenti. 
 Utilizza un array privato per memorizzare oggetti Studente. 
 Implementa un costruttore senza parametri per inizializzare il registro vuoto 
 e un metodo pubblico per aggiungere studenti al registro. 
 Aggiungi un metodo che stampi la lista degli studenti.*/

public class RegistroStudenti {
	private Studente[] studenti;
	private int numeroStudenti;
	
	public RegistroStudenti() {
        studenti = new Studente[24]; 
        numeroStudenti = 0;            
    }
	
	 public void aggiungiStudente(Studente studente) {
	        if (numeroStudenti < studenti.length) {
	            studenti[numeroStudenti] = studente;  
	            numeroStudenti++;                     
	        } else {
	            System.out.println("Registro pieno, non puoi aggiungere nuovi studenti.");
	        }
	    }
	 
	 public void listaStudenti() {
	        System.out.println("Lista studenti:");
	        for (int i = 0; i < numeroStudenti; i++) {
	            System.out.println(studenti[i].getValori());
	        }
	    }
	}
	 
	 
