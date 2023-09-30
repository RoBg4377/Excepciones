package excepciones;

public class Main {
    public static void main(String[] args) {
        //Aquí vamos a utilizar el método de la clase División
        //y vamos a manejar la excepción lanzada en dicha clase
        //para ello usamos el try, catch y finally.
        try{
            int result = Division.dividir(8, 0);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("NO SE PUEDE DIVIDIR ENTRE O");
        }finally {
            System.out.println("cerrando los recursos");
        }
        System.out.println("El programa sigue...");
        System.out.println("================================");
        System.out.println("COMIENZA UN NUEVO PROGRAMA");

        //Ejecutamos metodoSuperior de la clse MetodoSuperior
        //Por obias razones dará una excepción, entoces usamos el try, catch y finally.
        try{
            MetodoSuperior.metodoSuperior();
        }catch (Exception e){
            //capturamos la exceptición de dicho método que a us vez trae las excepciones de los metodos
            //más profundos.
            //le pedimos que imprima el conjunto de exepciones con el método printStackTrace()
            e.printStackTrace();
        }finally {
            System.out.println("Cerrando Recursos");
        }
        System.out.println("El programa sigue...");
        System.out.println("resultado de la segunda división: " + Division.dividir(48, 8));
    }
    
}
