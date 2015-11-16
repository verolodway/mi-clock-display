
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // variable que represent la hora actual
        private String horaAct;
    // variable que representa las horas
        private NumberDisplay horas;
    // variable que representa los minutos
        private NumberDisplay minutos;
    
    /**
     * Costructor con dos parámetros de tipo int que representa la hora
     */
    public ClockDisplay(int horasX, int minutosX)
    {
       horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
       horas.setValue(horasX);
       minutos.setValue(minutosX);
       horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
     /**
     * Constructor que pone la hora en 00:00 sin parámetros
     */
    public ClockDisplay()
    {
        horas.setValue(00);
        minutos.setValue(00);
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        horaAct = "00:00";
    }
    
    /**
     * Método que acepta los int y fija las horas y los minutos
     */
    public void setTime(int horasX, int minutosX)
    {
        horas.setValue(horasX);
        minutos.setValue(minutosX);
        horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
    }
    
    /**
     * Método que devuelve la hora y los minutos como cadena de 5 caracteres
     */public String getTime()
    {
        return horaAct;
    }
    
    /**
     * Método que hace avanzar un minuto la hora actual
     */public void timeTick()
    {
        if (minutos.getValue() == 59)
        {
            minutos.increment();
            horas.increment();
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        }
        else 
        {
            minutos.increment();
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        }
    }
}
