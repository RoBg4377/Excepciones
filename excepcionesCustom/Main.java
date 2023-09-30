public class Main {
    public static void main(String[] args) {
        int edad = 4;
        try {
            autoriza(edad);
        }catch(ExceptionMayoriaDeEdad emde){
            System.out.println(emde.getMessage());
        }
        System.out.println("PROCESO TERMINADO");
    }
    public static void autoriza(int edad) throws ExceptionMayoriaDeEdad{
        if(edad < 18){
            throw new ExceptionMayoriaDeEdad();
        }else{
            System.out.println("Autorizado. ¡Bienvenido a la disco!");
        }
    }
    
}
