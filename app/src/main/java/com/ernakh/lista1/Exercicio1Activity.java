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

public class Exercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Voltar(View view)
    {
        finish();
    }

    public void verificarIdade(View view) {

        EditText edtNome = findViewById(R.id.editTextNome);
        EditText edtIdade = findViewById(R.id.editTextIdade);

        Integer idade = Integer.parseInt(edtIdade.getText().toString());

        if (idade >= 18) {
            Toast.makeText(this, edtNome.getText() + " é maior de idade, ele possui " + idade + " anos.", Toast.LENGTH_LONG).show();
        } else if (18 > idade && idade >= 0) {
            Toast.makeText(this, edtNome.getText() + " é menor de idade, ele possui " + idade + " anos.", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Idade inválida.", Toast.LENGTH_LONG).show();
        }

    }
}