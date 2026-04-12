package es.iesmz.tests;

public class DiasLluvia {

    private boolean[] lluviaDias;

    public DiasLluvia(){
        lluviaDias = new boolean[365];
    }
    public boolean registroDia(int dia, int mes, boolean lluvia){
        int index = convertirADiaAnual(dia, mes);
        if (index == -1) return false;

        lluviaDias[index] = lluvia;
        return true;
    }
    public boolean consultarDia(int dia, int mes){
        int index = convertirADiaAnual(dia, mes);
        if (index == -1) return false;

        return lluviaDias[index];
    }
    public int contarDiasLluviosos(){
        int contador = 0;
        for (boolean llovio : lluviaDias){
            if (llovio)
                contador++;
        }
        return contador;
    }
    public int trimestreLluvioso() {
        int[] trimestres = new int[4];

        // Trimestre 1: dies 0-89
        for (int i = 0; i < 90; i++) if (lluviaDias[i]) trimestres[0]++;

        // Trimestre 2: dies 90-181
        for (int i = 90; i < 182; i++) if (lluviaDias[i]) trimestres[1]++;

        // Trimestre 3: dies 182-273
        for (int i = 182; i < 274; i++) if (lluviaDias[i]) trimestres[2]++;

        // Trimestre 4: dies 274-364
        for (int i = 274; i < 365; i++) if (lluviaDias[i]) trimestres[3]++;

        int max = 0;
        for (int i = 1; i < 4; i++) {
            if (trimestres[i] > trimestres[max]) max = i;
        }

        return max + 1;
    }
    public int primerDiaLluvia() {
        for (int i = 0; i < 365; i++) {
            if (lluviaDias[i]) return i + 1;
        }
        return 0;
    }
    private int convertirADiaAnual(int dia, int mes) {
        int[] diesMes = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (mes < 1 || mes > 12) return -1;
        if (dia < 1 || dia > diesMes[mes - 1]) return -1;

        int index = 0;
        for (int i = 0; i < mes - 1; i++) {
            index += diesMes[i];
        }

        return index + (dia - 1);
    }
}
