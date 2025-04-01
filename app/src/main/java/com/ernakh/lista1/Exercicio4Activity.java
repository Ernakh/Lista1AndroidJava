package com.ernakh.lista1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio4Activity extends AppCompatActivity {

    private EditText inputNome;
    private LinearLayout checkboxContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputNome = findViewById(R.id.inputNome);
        checkboxContainer = findViewById(R.id.checkboxContainer);
        Button botaoGerar = findViewById(R.id.botaoGerar);

        botaoGerar.setOnClickListener(this::gerarCheckBoxes);
    }

    public void gerarCheckBoxes(View view) {
        String nome = inputNome.getText().toString().trim();

        checkboxContainer.removeAllViews();

        if (nome.isEmpty()) {
            return;
        }

        for (char letra : nome.toCharArray()) {
            CheckBox checkBox = new CheckBox(this);
            checkBox.setText(String.valueOf(letra));
            checkboxContainer.addView(checkBox);
        }
    }


    public void Voltar(View view)
    {
        finish();
    }
}