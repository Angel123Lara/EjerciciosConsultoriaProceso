import java.util.Scanner;

public class Ejercicio2 {
      static boolean next = false;
      static Scanner sc = new Scanner(System.in);
      static int minToConvert = 0;
      
    public static void main(String[] args) {
    
        while (next == false){
            System.out.println("Ingrese la cantidad de minutos que desea convertir a segundos");
            String strInput = sc.nextLine();
            try {
                minToConvert = Integer.parseInt(strInput);
                if (minToConvert > 1 && minToConvert < 100){
                    int segundos = minToConvert*60;
                    System.out.println(segundos);
                    

                }
                else{
                    System.out.println("El numero ingresado debe de estar entre 1 y 100");
                }
                int respondeClient = 0;
                while (respondeClient == 0 ){
                System.out.println("¿Desea seguir convirtiendo? 1 = si 2 = No");
                try{
                respondeClient = Integer.parseInt(sc.nextLine()); 
                if (respondeClient == 2) {
                    next = true;
                }
                if(respondeClient == 1){
                    respondeClient = 1;
                }
                if(respondeClient != 1 && respondeClient != 2){
                    System.out.println("ingrese un numero valido");
                    respondeClient = 0;
                }

                }
                catch(NumberFormatException ex){
                    System.out.println("ingrese un numero valido");
                }
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Ingrese solo un número entre 1 y 100");
                
            }

        }
        
    }
}
