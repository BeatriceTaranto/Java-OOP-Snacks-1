package oop.snacks1;

/*Crea una classe ContoBancario con attributi per numero di conto e saldo. 
Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto 
e ottenere il saldo corrente.*/

public class ContoBancario {
	private String numeroConto;
    private double saldo;
    
    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }
    
    public void deposita(double importo) {
        if (importo > 0) {
        	saldo = saldo + importo;
            System.out.println("Deposito di " + importo + " effettuato.");
        } else {
            System.out.println("Importo non valido");
        }
    }
    
    public void preleva(double importo) {
        if (importo <= saldo) {
        	saldo = saldo - importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else {
            System.out.println("Saldo insufficiente");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
}