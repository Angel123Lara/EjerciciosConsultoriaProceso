import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    static boolean next = false;
    public static void main(String[] args) {
        
        while (next==false){
            System.out.println("Ingrese un año y te dire si es bisiesto o no");
            String strInput = sc.nextLine();
            
            try {
                int years = Integer.valueOf(strInput);
                if(years>1600 && years < 3000){
                    if ((years%4 == 0 && years%100 != 0) || (years%100==0 && years%400==0) ){
                        System.out.println("S");

                    }else{
                        System.out.println("N");
                    }

                    next = checkResponse();

                }else{
                    System.out.println("ingrese un numero entre 1600 y 3000");
                }

            } catch (Exception e) {
                System.out.println("Ingrese solo numeros");
            }
    }
}

    public static boolean checkResponse(){
        int respondeClient = 0;
                while (respondeClient == 0 ){
                    System.out.println("¿Desea seguir convirtiendo? 1 = si 2 = No");
                try{
                    respondeClient = Integer.parseInt(sc.nextLine()); 
                    
                    if(respondeClient != 1 && respondeClient != 2){
                        System.out.println("ingrese un numero valido");
                        respondeClient = 0;
                    }

                }
                    catch(NumberFormatException ex){
                        System.out.println("ingrese un numero valido");
                        respondeClient = 0;
                    }
                
                }
                if (respondeClient == 2) {
                    return true;
                }
                return false;
                
        
    };
    
}

