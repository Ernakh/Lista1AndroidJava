package com.ernakh.lista1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio2Activity extends AppCompatActivity {

    private EditText a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //solução da lógica do estudante Victor Alexandre Muller 2025/01

        a = findViewById(R.id.numeroX);
        b = findViewById(R.id.numeroY);

        findViewById(R.id.somar).setOnClickListener(this::Somar);
        findViewById(R.id.subtrair).setOnClickListener(this::Subtrair);
        findViewById(R.id.multiplicar).setOnClickListener(this::Multiplicar);
        findViewById(R.id.dividir).setOnClickListener(this::Dividir);
    }

    public void Voltar(View view)
    {
        finish();
    }

    private double getNumero(EditText campo) {
        String valor = campo.getText().toString().trim();
        if (valor.isEmpty()) {
            return Double.NaN;
        }
        return Double.parseDouble(valor);
    }
    public void Somar(View view) {
        double x = getNumero(a);
        double y = getNumero(b);
        if (Double.isNaN(x) || Double.isNaN(y)) {
            Toast.makeText(this, "Preencha os dois números corretamente!", Toast.LENGTH_SHORT).show();
            return;
        }
        double resultado = x + y;
        Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
    }

    public void Subtrair(View view) {
        double x = getNumero(a);
        double y = getNumero(b);
        if (Double.isNaN(x) || Double.isNaN(y)) {
            Toast.makeText(this, "Preencha os dois números corretamente!", Toast.LENGTH_SHORT).show();
            return;
        }
        double resultado = x - y;
        Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
    }

    public void Multiplicar(View view) {
        double x = getNumero(a);
        double y = getNumero(b);
        if (Double.isNaN(x) || Double.isNaN(y)) {
            Toast.makeText(this, "Preencha os dois números corretamente!", Toast.LENGTH_SHORT).show();
            return;
        }
        double resultado = x * y;
        Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
    }

    public void Dividir(View view) {
        double x = getNumero(a);
        double y = getNumero(b);
        if (Double.isNaN(x) || Double.isNaN(y)) {
            Toast.makeText(this, "Preencha os dois números corretamente!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (y == 0) {
            Toast.makeText(this, "Erro: divisão por zero!", Toast.LENGTH_SHORT).show();
            return;
        }
        double resultado = x / y;
        Toast.makeText(this, "Resultado: " + resultado, Toast.LENGTH_SHORT).show();
    }
}