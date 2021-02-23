package casting.y.operador.ternario;

public class CastingYOperadorTernario {

    public static void main(String[] args) {
    
    // El casting es util si queremos sumar variables cuyos tipos son distimtos
    // resultado= ()valor+valor
    float decimal= 5.5f;
    int entero= 7;
    
    int resultado= (int)decimal+entero;  //ponemos entre parentesis el valor al que deseamos convertir ej. float, int, etc...
    System.out.println(resultado);
    
    //Operador ternario o IFTTT (if this then this
    //?
    // expresion1? expresion2:expresion3 donde expresion1 evaluara un booleano
    
    String mensaje= 10>9? "es mayor":"es menor";
    System.out.println(mensaje);
    //Si expresion1 es true se mostrara expresion2 y si es false se mostrara expresion3
   //Expresion2 y expresion3 deberan ser del mismo tipo que expresion1
    
    }
    
}
