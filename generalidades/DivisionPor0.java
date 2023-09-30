package excepciones.generalidades;
import java.util.Scanner;  

public class DivisionPor0 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            //creamos un programa para dividir
            System.out.println("PROGRAMA PARA DIVIDIR");
            System.out.println("--------------------------------");
            int num1, num2, result;
            System.out.print("divdir:");
            num1 = sc.nextInt();
            System.out.print("entre: ");
            num2 = sc.nextInt();
            //al ser la division de números enteros existe la posibilidad de
            //tratar de dividir entre 0.
            //Para poder seguir ejecutando cualquier programa luego de la división pese a la exc
            //debemos manejarla con la siguiente estructura: try, catch, finally.
            
            // Excepciones verificadas
            // controlar el uso de try catch en tiempo de compilacion 
            // Es obligatorio usar try catch para poder comiplar
            // Heredan de Exception
            
            // Excepciones no verificadas
            // no obligan el uso de try catch en tiempo de compilacion
            // Heredan RuntimeException

            try {
                //Se ordena que trate de ejecutar la función a controlar y que no se ejecutará si
                //existe una excepción
                result = num1 / num2;
                System.out.println("el Resultado de tu division es: " + result);
            }catch(ArithmeticException exc){
                //catch recibe como parámetros el tipo de exc. y una variable donde seguardará diche exc.
                //luego en el cuerpo, se pone el código que se ejecutará si se produce la exception
                System.out.println("ES UN ERROR TRATAR DE DIVIDIR ENTRE 0");
            }finally{
                //El finally es obligatorio para cerrar los recursos que no se utilicen luego de la exception
                //puede contener un código para ello
                System.out.println("cierre de recursos del programa de division");
            }
            System.out.println("PROGRAMA TERMINADO");
        }
        //Luego de manejada la exception el programa sigue corriendo.

        
    }
    

