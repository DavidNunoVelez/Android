package com.david.morfeo.numerosprimos;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by morfe on 26/01/2018.
 */

public class Calculadora {

    public static Map<Integer, Integer> primos = new HashMap<Integer, Integer>();
    public static int resultado;

    private Principal principal = new Principal();

    public Calculadora() {
    }

    public void calcular(int numero) {

        int numeroAMandar = 1;
        int registroPrimos = 0;
        int primosTotales = numero;
        int resultadoLocal = 0;

        do {
            if (esPrimo(numeroAMandar)) {
                registroPrimos++;
                resultadoLocal = numeroAMandar;
                primos.put(numero,resultadoLocal);
            }
            numeroAMandar++;
        } while (registroPrimos < primosTotales);
        resultado = resultadoLocal;


    }

    public boolean esPrimo(int num) {
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo)
            return true;
        else
            return false;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }


}
