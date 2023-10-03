import java.util.Scanner;

public class App {
    static Scanner lector  = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //metodos
        // no requieren datos de entradad ni devulven datos de salida 
       //que no requieren datos de entrada pero devuelven datos de salida
       //requieren datos de entrada  pero no devuelven datos de salida
       //---------------------------------------------------
       //Metodos Sobrecargados
       //Consiste en reutilizar el nombre de un metodo pero con distintas listas
       //de parametros de entrada
       mostrarHora();
       mostrarHora(2,15,36);
       mostrarHora(2,0);

    }
    //Declaracion de metodos 
    public static void mostrarHora(){
        System.out.print("Horas: ");
        int hr = lector.nextInt();
        System.out.print("Minutos: ");
        int  Mn = lector.nextInt();
         System.out.print("Segundos: ");
        int Sg = lector.nextInt();
        System.out.println("La hora es : "+hr+":" +Mn+":"+Sg);
    }
    public static void mostrarHora(int hr , int Mn, int Sg){
        System.out.println("La hora es : "+hr+":" +Mn+":"+Sg);
    }
    public static void mostrarHora(int hr , int Mn){
        int Sg = 46;
         System.out.println("La hora es : "+hr+":" +Mn+":"+Sg);

    }
}
