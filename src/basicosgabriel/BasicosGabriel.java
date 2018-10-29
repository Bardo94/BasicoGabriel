package basicosgabriel;

/**
 *
 * @author Gabriel
 */
public class BasicosGabriel
{
    public static void main(String[] args)
    {
        logicos();
    }
    
    public static void logicos()
    {
        //Declaración
        int int1;
        int int2;
        int int3;
        String string1;

        //Asignación
        int1 = 1;
        int2 = 2;
        int3 = 3;
        string1 = "El operador funciona.";

        //Presentación
        int suma = int1 + int2;
        if(suma == int3)
        {
            System.out.println(string1);  
        }
    }
}