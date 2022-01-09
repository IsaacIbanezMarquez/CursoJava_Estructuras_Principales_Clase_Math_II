





public class Calculos_Con_Math
{
    public static void main (String[] args)
    {
        float num1 = 5.85F;

        int resultado = Math.round(num1);

        System.out.println(resultado);
    }





    // Ejercicio 2
    // Éste problema es el último en el que jugaremos un poco con números y cosas así, simples.
    // Conéste quiero mostrarles más que nada el manejo de variables, y cómo ocuparlas para obtener unpequeño resultado.
    // El código muestra, en una forma muy sencilla, cuántos años tienen los datosingresados, y
    // los extiende a meses, días, etc



    public static class Problema2
    {
        int añonacimiento;int añoactual;
        public void calculoExtendido()
        {
            int ac = añoactual-añonacimiento;
            int dia = ac*365;
            int mes = ac*12;
            int hora = dia*24;
            int minuto = hora*60;
            int segundo = minuto*60;

            System.out.println("Haz vivido:\n"+ac+" años \n"+mes+" meses\n"+dia+" dias\n"+hora+"horas\n"+minuto+" minutos\n"+segundo+" segundos");
        }
        public static void main(String args[])
        {
            Problema2 b= new Problema2();
            b.añonacimiento=1990;
            b.añoactual=2010;
            b.calculoExtendido();
        }
    }
}
