package excepciones.manejoExcepciones;

public class Division {
    //creamos un método estático para dividir.
    //Como dividir puede traer alguna excepciones, 
    //y no queremos manejarla en esta misma clase, por cualquier motivo,
    //lanzamos dicha exc. para ser lanzada a donde se utilice dicho método.
    //Esto se realiza con la palabra throws.
    public static int dividir(int numA, int numB)throws ArithmeticException{
        return numA /numB;
    }
}
