
/**
 * 
 * 
 
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
    // variable que representa el am
        private boolean am;
    // variable que representa el pm
        private boolean pm;
    // variable que representa las horasAm
        private boolean horasAm;
    // variable que representa las horasPm
        private boolean horasPm;
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
        horas = new NumberDisplay(24);
       minutos = new NumberDisplay(60);
        horas.setValue(24);
        minutos.setValue(00);
        horas = new NumberDisplay(12);
        minutos = new NumberDisplay(60);
        horaAct = "12:00 m";
    }
    
    
    
    /**
     * Método que acepta los int y fija las horas y los minutos
     */
    public void setTime(int horasX, int minutosX)
    {
        if (horasAm == am)
        { 
            horas.setValue(horasX);
            minutos.setValue(minutosX);
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "a.m";
       } 
       else if (horasX == 12 & minutosX == 00)
       {
           horaAct = 12 + 00 + "m";
       }
    
       else 
       {
           horas.setValue(horasX-12);
           minutos.setValue(minutosX);
           horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "p.m";
       }
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
