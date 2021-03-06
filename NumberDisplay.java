
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author Verónica Serrano 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables
    private int display;
    private  int limit;
    /**
     * Constructor que da límite al display y lo inicializa a 0
     */
    public NumberDisplay(int limite)
    {
        limit = limite;
        display = 0;
    }
    /**
     * Da valor al display con un número introducido que no supere el límite.
     */
    public void setValue(int numeroInicial)
    {
        if (numeroInicial < limit && numeroInicial >= 0)
        {
            display = numeroInicial;
        }
    }
    
    /**
     * Devuelve el valor actual de display en forma de cadena de dos carácteres
     */
    public String getDisplayValue()
    {
        if(limit < 10) {
            return "0" + display;
        }
        else {
            return "" + display;
        }
    }
    
    
    /**
     * Devuelve el valor actual de display como entero
     */
    public int getValue()
    {
        return display;
    }
    
    
    /**
     * Incrementa en 1 a display y al alcanzar el límite vuelve al principio
     */public void increment()
    {
        int limitTiem = limit -1;
        if (display == limitTiem)
        {
            display = 0;
        }
        else 
        {
            display = display + 1;
        }
    }
}
