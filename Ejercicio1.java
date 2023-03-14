import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);
    public static int firstInput = 0;
    public static String strG = "";
    public static int iteracion =  0;
    public static int pencilToSearch = 0;
    public static ArrayList<Integer> pencils =  new ArrayList<>();
    public static int counter = 0;
public static void main(String[] args) {

    System.out.println("introduce numero de lapices y seguido el lapiz que deseas contar");
    strG = sc.nextLine();
    firstInput = Integer.parseInt(strG);
    iteracion = firstInput/10;
    pencilToSearch = firstInput - iteracion*10;
    for (int i = 0; i < iteracion; i++) {
        if (i == 0 ){
        System.out.println("introduce el primer lapiz");
        }
        else{
            System.out.println("introduce el siguiente lapiz"); 
        }
        String str = sc.nextLine();
        int input = Integer.parseInt(str);
        pencils.add(input);
        if ( input == pencilToSearch){
            counter++;
        }
    }

    System.out.println("Numero de lapices " + counter);


    



}   


}

