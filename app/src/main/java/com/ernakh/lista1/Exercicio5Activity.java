package com.ernakh.lista1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio5Activity extends AppCompatActivity {

    private CheckBox checkboxNotificacoes, checkboxModoEscuro, checkboxLembrarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio5);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkboxNotificacoes = findViewById(R.id.checkboxNotificacoes);
        checkboxModoEscuro = findViewById(R.id.checkboxModoEscuro);
        checkboxLembrarLogin = findViewById(R.id.checkboxLembrarLogin);

        Button botaoSalvar = findViewById(R.id.botaoSalvar);
        botaoSalvar.setOnClickListener(this::salvarPreferencias);
    }

    public void salvarPreferencias(View view) {
        StringBuilder preferencias = new StringBuilder();

        if (checkboxNotificacoes.isChecked()) preferencias.append("Receber notificações\n");
        if (checkboxModoEscuro.isChecked()) preferencias.append("Modo escuro\n");
        if (checkboxLembrarLogin.isChecked()) preferencias.append("Lembrar login\n");

        if (preferencias.length() == 0) {
            Toast.makeText(this, "Nenhuma preferência foi escolhida", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Preferências salvas:\n" + preferencias, Toast.LENGTH_LONG).show();
        }
    }

    public void Voltar(View view)
    {
        finish();
    }
}