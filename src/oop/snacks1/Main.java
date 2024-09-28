package oop.snacks1;

public class Main {
		public static void main(String[] args) {
		Studente studente = new Studente("Anselmo", "Bitta", 24);
		System.out.println(studente.getValori());
		
		ContoBancario conto = new ContoBancario("IT30X0262844401000000124653");
        conto.deposita(800);
        conto.preleva(400);
        System.out.println("Saldo corrente: " + conto.getSaldo());
        
        RegistroStudenti registro = new RegistroStudenti();
        registro.aggiungiStudente(new Studente("Anselmo", "Bitta", 24));
        registro.aggiungiStudente(new Studente("Giulia", "Rossi", 22));
        registro.aggiungiStudente(new Studente("Luca", "Verdi", 23));
      
        registro.listaStudenti();
    }
}
    
