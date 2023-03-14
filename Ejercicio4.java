import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> rows =  new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño de la matriz");
        String strInputSize = sc.nextLine();
        try {
            int sizeMatriz = Integer.parseInt(strInputSize);
            
            if(sizeMatriz>=1 && sizeMatriz<=100){
            boolean isMatrixDiag = true;
            for (int i = 0; i < sizeMatriz; i++) {
                boolean next = true;
                while (next) {
                    System.out.println("Ingrese el conjunto numero " + (i+1) + " recuerde que cada digito debe estar separado por un espacio");
                    String row = sc.nextLine();
                    if ((sizeMatriz + (sizeMatriz - 1)) == row.length()){
                        rows.add(row);
                        next = false;

                    }else{
                        System.out.println("Ingrese los numeros completos");
                    }
                    
                    
                }
                
            }
            int counterInd = 0;
            for (int i = 0; i < rows.size() - 1; i++) {

                String data1 = rows.get(i);
                String data2 = rows.get(i + 1);

                
                if(isMatrixDiag == true){
                    char a = data1.charAt(counterInd);
                    char b = data2.charAt(counterInd + 2);
                        
                    if (a != b){
                        isMatrixDiag = false;
                    }
                    counterInd = counterInd + 2;
                     
                
               
            }   
                   
        }


        if(isMatrixDiag == true){
            System.out.println("SI");
        }else{
            System.out.println("No");
        } 
    }else{
        System.out.println("el tamaño de la matriz debe de ser entre 1 y 100");
    }

        } catch (Exception e) {
           System.out.println("la entrada debe de ser un numero");
            
        }  
        
    }

    


}
