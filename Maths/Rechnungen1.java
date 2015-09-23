/**
  *
  * Beschreibung
  * Calculator
  * @version 1.1 vom 18.09.2015
  * @author 
  */

public class Rechnungen1 {
  
  public static void main(String[] args) {
    System.out.print("Geben Sie die erste Zahl ein: ");
    double zahl1 ;
    zahl1 =Tastatur.leseKommazahl();
    System.out.println("zahl1 ist: "+zahl1);
    
    System.out.print("Geben Sie die zweite Zahl ein: ");
    double zahl2 ;
    zahl2 =Tastatur.leseKommazahl();
    System.out.println("zahl2 = "+zahl2);
    
    System.out.println("W�hlen Sie den gew�nschten Operator: ");
    System.out.println("1 = Addition");
    System.out.println("2 = Subtraktion");
    System.out.println("3 = Multiplikation");
    System.out.println("4 = Division");
    System.out.println("5 = n-te Wurzel aus");
    System.out.println("6 = Potenzieren");
    
    int operator;
    operator = Tastatur.leseZahl();
    
    double ergebnis1 ;
    double ergebnis2 ;
    double ergebnis3 ;
    double ergebnis4 ;
    double ergebnis5 ;
    double ergebnis6 ;
    
    if (operator == 1) {
      ergebnis1 = zahl1+zahl2 ;
      System.out.println("zahl1 + zahl2 = "+zahl1+" + "+zahl2+" = "+ergebnis1);  
    } else if (operator == 2) {
      ergebnis2 = zahl1-zahl2 ;
      System.out.println("zahl1 - zahl2 = "+zahl1+" - "+zahl2+" = "+ergebnis2);  
    } else if (operator == 3) {
      ergebnis3 = zahl1*zahl2 ;
      System.out.println("zahl1 * zahl2 = "+zahl1+" x "+zahl2+" = "+ergebnis3);    
    } else if (operator == 4) {
      if (zahl2 == 0){
        System.out.println("ERROR Divisor = 0");
      } 
      else{
        ergebnis4 = zahl1/zahl2;
        System.out.println("zahl1 / zahl2 = "+zahl1+" : "+zahl2+" = "+ergebnis4);
      }
    } else if (operator == 5) {
      if (zahl2 < 0){
         System.out.println("ERROR Number < 0");
      } 
      else{
        double operation = 1.0/zahl1; 
        ergebnis5 = Math.pow(zahl2, operation);                  
        System.out.println("zahl1-te Wurzel aus zahl2 = "+zahl1+"-te Wurzel aus "+zahl2+" = "+ergebnis5);
      }                    
    } else if (operator == 6) {
      ergebnis6 = Math.pow(zahl1, zahl2);                  
      System.out.println("zahl1 ^ zahl2 = "+zahl1+" ^ "+zahl2+" = "+ergebnis6);
    } else {
      System.out.println("Fehlerhafter Operator gew�hlt!"); 
    } // end of if-else
  
  }  // end of main
  
} // end of class Rechnungen1
