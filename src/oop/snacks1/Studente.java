package oop.snacks1;

/*Scrivi una classe Studente con i seguenti attributi: nome, cognome, età. 
Implementa un costruttore che accetta tre parametri per inizializzare questi attributi. 
Aggiungi un metodo che restituisca una stringa concatenata dei valori 
(es. Anselmo Bitta, 24 anni).*/

public class Studente {
			private String nome;
		    private String cognome;
		    private int eta;

		public Studente(String nome, String cognome, int eta) {
		    this.nome = nome;
		    this.cognome = cognome;
		    this.eta = eta;
		}

		public String getValori() {
			return nome + " " + cognome + ", " + eta + " anni";
		}

		public String getNome() {
		    return nome;
		}

		public String getCognome() {
			return cognome;
		}

		public int getEta() {
			return eta;
		}

	}
