import org.graalvm.compiler.replacements.ReplacementsUtil;

public class App {

    private String nombre;
    private int edad;
    private char sexo;
    private double estatura;
    private float peso;
    private boolean estadoCivil;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //tipos de datos y operadores
        String res = "Hola";
        int resultado = 15 + 32;
        int resultado3 = 125 - 32;
        double resultado2 = 25/3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;
        //operadores unarios #Permiten cambiar el valor de una variable.
        resultado++; //resultado = resultado + 1
        resultado--; //resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;
        //operadores logicos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 <= 8;
        respuesta = 5 >= 8;
        respuesta = 5 != 8;
        respuesta = 5 == 8;
        respuesta = 12 < 5 && 4 > 1; //En python && significa and
        respuesta = 14 < 25 || 1 > 5; //En pytho || significa for
        //Operadores bit a bit
        // & es como un and en python pero lo hace bit a bit
        // ^ sirve para sacar la potencia o representa la compuerta sor y la xfor cuando se comparan dos expresiones lógicas.
        // | hace algunas operaciones
        
        //Estructuras de control
        if (respuesta) {
            //Aquí va el bloque de código si se cumple
        }
        if (respuesta) {
            //bloque de código si se cumple
        } else if (respuesta) {
            //bloque de código si no se cumple
        }
        
    }
}
