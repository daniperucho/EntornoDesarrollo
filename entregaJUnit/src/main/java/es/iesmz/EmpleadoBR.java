package es.iesmz;

public class EmpleadoBR {

    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra){

        if (tipus == null || ventasMes < 0 || horasExtra < 0){
            return -1;
        }
        float salarioBase = 0;
        if (tipus == TipoEmpleado.venedor){
            salarioBase = 1000;
        } else if (tipus == TipoEmpleado.encarregat){
            salarioBase = 1500;
        }
        if (ventasMes >= 1500) {
            salarioBase += 200;
        } else if (ventasMes >= 1000) {
            salarioBase += 100;
        }
        salarioBase += horasExtra * 20;

        return salarioBase;
    }

    public static float calculaSalarioNeto(float salarioBruto){

        if (salarioBruto < 0){
            return -1;
        }
        float retencion;
        if (salarioBruto >= 1500){
            retencion = 18;
        } else if (salarioBruto >= 1000){
            retencion = 16;
        } else {
            retencion = 0;
        }

        return salarioBruto * (1 - (retencion/100));
    }
}
