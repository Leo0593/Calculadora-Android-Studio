package com.example.app1_2024_25_calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText numero1;   //Definim un objecte del tipus EditText
    private EditText numero2;    //Definim un objecte del tipus EditText
    private TextView resul;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = (EditText)findViewById(R.id.num1);
        numero2 = (EditText)findViewById(R.id.num2);
        resul = (TextView) findViewById(R.id.resultado);
    }

    public void sumar(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        double suma=n1+n2;

        String resultat;
        if (suma == (long) suma) {
            resultat = String.format("%d", (long) suma);
        } else {
            resultat = String.format("%.2f", suma);
        }
        resul.setText(resultat);


    }

    public void resta(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        double resta=n1-n2;

        String resultat;
        if (resta == (long) resta) {
            resultat = String.format("%d", (long) resta);
        } else {
            resultat = String.format("%.2f", resta);
        }
        resul.setText(resultat);
    }
    public void division(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);

        String resultat;
        if (n2 == 0) {

            resultat = "ERROR: División por cero";
        } else {
            double divi = n1 / n2;

            if (divi == (long) divi) {
                resultat = String.format("%d", (long) divi);
            } else {
                resultat = String.format("%.2f", divi);
            }
        }

        resul.setText(resultat);
    }
    public void multiplicacion(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        double multi=n1*n2;

        String resultat;
        if (multi == (long) multi) {
            resultat = String.format("%d", (long) multi);
        } else {
            resultat = String.format("%.2f", multi);
        }
        resul.setText(resultat);
    }

    public void potenciacion(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        double potencia = Math.pow(n1, n2);

        String resultat;
        if (potencia == (long) potencia) {
            resultat = String.format("%d", (long) potencia);
        } else {
            resultat = String.format("%.2f", potencia);
        }
        resul.setText(resultat);
    }

    public void mood(View dibuix){

        String valor1= numero1.getText().toString();
        String valor2= numero2.getText().toString();

        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        String resultat;

        if (n2 == 0) {
            resultat = "ERROR: División por cero";
        } else {
            double modulo = n1 % n2;

            if (modulo == (long) modulo) {
                resultat = String.format("%d", (long) modulo);
            } else {
                resultat = String.format("%.2f", modulo);
            }
        }
        resul.setText(resultat);
    }

    public void combinado(View dibuix){

        String valor1 = numero1.getText().toString();
        String valor2 = numero2.getText().toString();


        double n1=Double.parseDouble(valor1);
        double n2=Double.parseDouble(valor2);
        String resultat;

        if (n1 < 0 || n2 < 0 || n2 > n1) {
            resultat = "ERROR: El factorial no está definido para números negativos o si n2 es mayor que n1.";
        } else {

            double nf1 = 1;
            for (int i = 1; i <= n1; i++) {
                nf1 *= i;
            }

            double nf2 = 1;
            for (int a = 1; a <= n2; a++) {
                nf2 *= a;
            }

            double nf3 = 1;
            double parentesis = n1 - n2;
            for (int e = 1; e <= parentesis; e++) {
                nf3 *= e;
            }


            double combinacion = (double) nf1 / (nf3 * nf2);

            if (combinacion == (long) combinacion) {
                resultat = String.format("%d", (long) combinacion);
            } else {
                resultat = String.format("%.2f", combinacion);
            }
        }

        resul.setText(resultat);
    }


}