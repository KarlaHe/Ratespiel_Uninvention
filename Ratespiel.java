

import java.io.*;


public class Ratespiel
{
    private int zahl;
    private int eingabe;
    private boolean test = false;
    
    /* public void getZahl(){}
    
    public void setZahl(){}
    
    public void getEingabe(){}
    
    public void setEingabe(){} */
    
    public Ratespiel()throws IOException{
		//Erschaffung einer zufälligen Zahl zwischen 1 und 100
        Zufallszahl();
        do{
			//Spielerin nach Eingabe fragen
            Eingabe();
			
			//Zahl prüfen. größer oder kleiner?
            Vergleich();
			
			//prüfen ob die Zahlen gleich sind
			//Falls falsch, erneute abfrage
        }while(zahl != eingabe);
		
		//Falls richtig: glückwunsch und Spiel beenden
        RichtigeZahl();
    
    }
    
    public void Vergleich(){
        if(zahl < eingabe){
            System.out.println("Die gesuchte Zahl ist kleiner als die Eingabe.");
        }
        else if(zahl > eingabe){
            System.out.println("Die gesuchte Zahl ist größer als die Eingabe.");
        }
        
    }
    
    public void RichtigeZahl(){
        System.out.println("Glückwunsch, " + eingabe + " ist die richtige Zahl.");
    }
    
    public void Eingabe()throws IOException{
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein:");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String eingabestring = br.readLine();
            eingabe = Integer.parseInt(eingabestring);
            if(eingabe < 0 || eingabe > 100){
                System.out.println("falsche Eingabe.");
                Eingabe();
            }
    }
    
    public void Zufallszahl(){
       
        zahl = (int) (Math.random()*100);
        if(test){
            System.out.println(zahl);
        }
    }
    
    public static void main(String[] args)throws IOException{
        
       Ratespiel ratespiel = new Ratespiel();
    
    }
}












