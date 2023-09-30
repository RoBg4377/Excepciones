package excepciones.manejoExcepciones;

public class MetodoInferior {
    //Creamos un método (metodoInferior)que lo único que hace es crear una excepción.
    //prparamos al mñetodo para lanzar la excepción con "throws"
    //y lanzamos la excepción creada con la palabra "throw".
    //Singue en la clase Metodomedio.
    public static void metodoInferior() throws Exception {
        throw new Exception("Excepción del método inferior");
    }
}
