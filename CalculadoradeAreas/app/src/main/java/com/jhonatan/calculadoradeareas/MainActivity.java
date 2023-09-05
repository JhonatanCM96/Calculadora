package com.jhonatan.calculadoradeareas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText base, altura;
    TextView resultado;
    Button Calcular;

    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        base = findViewById(R.id.LadoUno);
        altura = findViewById(R.id.LadoDos);
        resultado = findViewById(R.id.resultado);
        Calcular = findViewById(R.id.Calcular);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valueOne = Float.parseFloat(base.getText().toString());
                float valueTwo = Float.parseFloat(altura.getText().toString());
                result = ((valueOne*valueTwo)/2);
                resultado.setText("El resultado es: " + String.valueOf(result));
            }
        });
    }
}