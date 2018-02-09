package com.david.morfeo.numerosprimos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Principal extends AppCompatActivity implements View.OnClickListener {

    Calculadora cal;
    Button botonCalcular;
    EditText numeroUsuario;
    TextView respuesta;
    int numero;
    int resultadoGeneral = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        numeroUsuario = (EditText) findViewById(R.id.numUsu);
        respuesta = (TextView) findViewById(R.id.labelrespuesta);
        botonCalcular = (Button) findViewById(R.id.botonCalcular);
        botonCalcular.setOnClickListener(this);
        cal = new Calculadora();
    }

    public void onClick(View vista) {
        numero = Integer.parseInt(numeroUsuario.getText().toString());
        if (Calculadora.primos.containsKey(numero)) {
            String cadena = String.valueOf(Calculadora.primos.get(numero));
            respuesta.setText(cadena);
        } else {
            cal.setPrincipal(this);
            cal.calcular(numero);
            resultadoGeneral = Calculadora.resultado;
            String cadena = String.valueOf(resultadoGeneral);
            respuesta.setText(cadena);
        }


    }


}
