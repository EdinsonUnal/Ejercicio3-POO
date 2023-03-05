//Ejercicio Propuesto No 12.
public class Ejercicio3 {
    public static void main(String[] args) {
        int horasTrabajadas, valorHora;
        double pDeRetencion, retencion, salarioBruto, salarioNeto;

        horasTrabajadas = 48;
        valorHora = 5000;
        pDeRetencion = 0.125;
        salarioBruto = horasTrabajadas * valorHora;
        retencion = salarioBruto * pDeRetencion;
        salarioNeto = salarioBruto - retencion;

        System.out.println("El salario bruto del trabajador es: " + salarioBruto);
        System.out.println("La retención en la fuente es: " + retencion);
        System.out.println("El salario neto del trabajador es: " + salarioNeto);
    }
}
