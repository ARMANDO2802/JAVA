package test;

import model.Client;

public class Test {

    public static void main(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
    }
    
    public void escenarioClient(){
        Client cliente1 = new Client("Raúl");

        boolean test1 = asserEquals("Raúl", cliente1.getNombre());
        //(condition)? responseTrue: responseFalse 
        System.out.println((test1)? "Paso la prueba de nombre":"Error el nombre no es igual");
    }
    
    public boolean asserEquals(String expected, String received){
        if (expected.equalsIgnoreCase(received)){
            return true;
        }
        return false;
    }

    public boolean asserNotNull(Object objeto){
        if(objeto != null){
            return true;
        }
        return false;
    }
}
