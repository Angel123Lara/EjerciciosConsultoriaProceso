import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> ListaEspera = new ArrayList<>();
    static ArrayList<String> ListaEventos = new ArrayList<>();
    // private String Evento;
    // private String Nombre;
    // private int prioridad;
    static String event;
    static String name;
    static int pp;



    // public eventos (String Evento, String Nombre, int prioridad){
    //     this.Evento = Evento;
    //     this.Nombre = Nombre;
    //     this.prioridad = prioridad;
    // }


    public static void main(String[] args) {

        
        try {
            
            System.out.println("ingrese numero de eventos");
            String strEventNum = sc.nextLine();
            int EventNum = Integer.parseInt(strEventNum);
            
            if(EventNum>= 1 && EventNum<=50000){
            for (int i = 0; i < EventNum; i++) {
                
                System.out.println("ingrese evento numero " + (i + 1));
                String eventInput = sc.nextLine();
                ListaEventos.add(eventInput);
            }

            for (int i = 0; i < ListaEventos.size(); i++) {
                String data = ListaEventos.get(i);
                int beginSpace = 2 ;
                int counter = 1;
                event = String.valueOf(data.charAt(0));
                
                for (int j = 2; j < data.length(); j++) {
                    if(counter == 1 && data.charAt(j)== ' '){
                        name = data.substring(beginSpace, j);
                        counter =2 ;
                        beginSpace = j + 1;
                    }
                    if(counter == 2 && j==data.length()){
                        pp = Integer.parseInt(data.substring(beginSpace, j));
                        
                    }

                    
                }
                System.out.println(event);
                System.out.println(name);
                System.out.println(pp);
                
                

            }

            


        
            }else{
                System.out.println("Numero de evento debe de estar entre 1 y 50000");
            }




        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
