
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
    // variable que representa la fecha actual
    private String fechaAct;
    // variable que representa las horas
    private NumberDisplay horas;
    // variable que representa los minutos
    private NumberDisplay minutos;
    // variable que determina si queremos un reloj en formato 12 o 24h
    private boolean formato;
    // varialbe que representa el año 
    private NumberDisplay año;
    // variable que representa el mes
    private NumberDisplay mes;
    // variable que representa el día
    private NumberDisplay dia;
    /**
     * Costructor con dos parámetros de tipo int que representa la hora
     */
    public ClockDisplay(int horasX, int minutosX, boolean formato, int añoX, int mesX, int diaX)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        año = new NumberDisplay(99);
        mes = new NumberDisplay(12);
        dia = new NumberDisplay(30);
        horas.setValue(horasX);
        minutos.setValue(minutosX);
        año.setValue(añoX);
        mes.setValue(mesX);
        dia.setValue(diaX);
        horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        fechaAct = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
    }

    /**
     * Método que permite alternar entre los modos del reloj
     */
    public void changeFormat()
    {
        if (formato) {
            formato = false;
        }
        else {
            formato = true;
        }	
    }

    /**
     * Constructor que pone la hora en 00:00 sin parámetros
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        año = new NumberDisplay(99);
        mes = new NumberDisplay(12);
        dia = new NumberDisplay(30);
        horas.setValue(24);
        minutos.setValue(00);
        año.setValue(15);
        mes.setValue(11);
        dia.setValue(20);
        horas = new NumberDisplay(12);
        minutos = new NumberDisplay(60);
        horaAct = "12:00 m";
        fechaAct = "20/11/15";
    }

    /**
     * Cuando formato vale true estamos indicando que queremos el formato en 24h
     */
    public void formato (int horasX, int minutosX)
    {
        if (formato == true)
        { 
            horas.setValue(horasX);
            minutos.setValue(minutosX);
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        } 

        else 
        {
            if (horasX <= 12)
            { 
                horas.setValue(horasX);
                minutos.setValue(minutosX);
                horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "a.m";
                fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
            } 
            else if (horasX == 12 & minutosX == 00)
            {
                horaAct = 12 + 00 + "m";
                fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
            }

            else 
            {
                horas.setValue(horasX-12);
                minutos.setValue(minutosX);
                horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "p.m";
                fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
            }
        }
    }

    /**
     * Método que acepta los int y fija las horas y los minutos
     */
    public void setTime(int horasX, int minutosX, int añoX, int mesX, int diaX)
    {
        if (horasX <= 12)
        { 
            horas.setValue(horasX);
            minutos.setValue(minutosX);
            año.setValue(añoX);
            mes.setValue(mesX);
            dia.setValue(diaX);
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "a.m";
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        } 
        else if (horasX == 12 & minutosX == 00)
        {
            año.setValue(añoX);
            mes.setValue(mesX);
            dia.setValue(diaX);
            horaAct = 12 + 00 + "m";
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }

        else 
        {
            horas.setValue(horasX-12);
            minutos.setValue(minutosX);
            año.setValue(añoX);
            mes.setValue(mesX);
            dia.setValue(diaX);
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue() + "p.m";
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
    }

    public void updateHoraActual()
    {   if (formato == true) {
            String formato = "a.m";
            int horaAhora = horas.getValue(); 
            if (horaAhora >= 12){
                formato = "p.m.";
            }

            if (horaAhora > 12) {
                horaAhora = horaAhora - 12;
            }
            else if (horaAhora == 0) {
                horaAhora = 12;
            }
            horaAct = horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        else {
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        String formato = "a.m";
        int horaAhora = horas.getValue(); 
        if (horaAhora >= 12){
            formato = "p.m.";
        }

        if (horaAhora > 12) {
            horaAhora = horaAhora - 12;
        }
        if (horaAhora == 0) {
            horaAhora = 12;
        }
        horaAct = horaAhora + ":" + minutos.getDisplayValue() + " " + formato;
        fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
    }

    /**
     * Método que devuelve la hora y los minutos como cadena de 5 caracteres
     */public String getTime()
    {
        return horaAct + " " + fechaAct;
    }

    /**
     * Método que hace avanzar un minuto la hora actual
     */public void timeTick()
    {   if (dia.getValue() == 30)
        {
            dia.increment();
            mes.increment();
            fechaAct = " " + "1" + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        else
        {
            dia.increment();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        
        if (mes.getValue() == 12)
        {
            mes.increment();
            año.increment();
            fechaAct = " " + dia.getDisplayValue() + "/" + "1" + "/" + año.getDisplayValue();
        }
        else
        {
            mes.increment();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        
        if (minutos.getValue() == 59)
        {
            minutos.increment();
            horas.increment();
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
        else 
        {
            minutos.increment();
            horaAct = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
            fechaAct = " " + dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + año.getDisplayValue();
        }
    }
}
