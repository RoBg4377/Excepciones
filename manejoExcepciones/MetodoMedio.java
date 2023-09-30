package excepciones.manejoExcepciones;

public class MetodoMedio {
    //Aquí creamos un método que ejecuta el método "metodoInferior" de la clse MetodoInferior
    //Obiamente como va a producir una exepción tratamos esa excepción y a la vez,
    //nos preparamos para lanzarla
    public static void metodoMedio()throws Exception{
        try{
            //tratamos de ejecutar el metodoInferior que roduce una exepción
            MetodoInferior.metodoInferior();
        }catch (Exception e){//capturamos dicha escepción y lo guardamoe en la variable e
            throw new Exception("Excepción del método medio", e);
            //a su vez el metodoMedio podría tener una exc. (En este caso la tiene sí o sí)
            //por lo que la lanzamos a otro metodo que vaya a utiliar junto a la excepción que capturó del metodoInferior.
        }
    }
}
