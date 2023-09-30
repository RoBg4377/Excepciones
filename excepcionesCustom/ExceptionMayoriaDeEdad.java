public class ExceptionMayoriaDeEdad extends RuntimeException{

    public ExceptionMayoriaDeEdad(String message){
        super(message + "No eres mayor de edad ");
    }
    public ExceptionMayoriaDeEdad() {
        this("No puedes pasar ");
    }
    
}