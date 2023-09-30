package excepciones;

public class MetodoSuperior {
    //Aquí creamos un método que ejecuta el método "metodoMedio" de la clse MetodoMedio
    //Obiamente como va a producir una exepción tratamos esa excepción y a la vez,
    //nos preparamos para lanzarla
    public static void metodoSuperior() throws Exception {
        //tratamos de ejecutar el metodoInferior que roduce una exepción
        try{
            MetodoMedio.metodoMedio();//va a producir una exepción porque ejecutar el metodoInferior que es una exepción
        }catch (Exception e){//capturamos dicha escepción (que contien tambien otra excpción) y lo guardamoe en la variable e
            throw new Exception("Excepción del método superior", e);
            //a su vez el metodoSuperior podría tener una exc. (la va a tener porque arrastra las otras excepciones)
            //por lo que la lanzamos a otro metodo que vaya a utiliar junto a la excepción que capturó del metodoMedio
            //que a su vez tiene la excepción del metodoInferior.
        }
    }
}
