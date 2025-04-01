package com.ernakh.lista1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Exercicio3Activity extends AppCompatActivity {

    private EditText nome, idade, uf, cidade, telefone, email;
    private RadioGroup tamanhoGrupo;
    private CheckBox corVermelho, corAzul, corPreto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_exercicio3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nome = findViewById(R.id.nome);
        idade = findViewById(R.id.idade);
        uf = findViewById(R.id.uf);
        cidade = findViewById(R.id.cidade);
        telefone = findViewById(R.id.telefone);
        email = findViewById(R.id.email);
        tamanhoGrupo = findViewById(R.id.tamanhoGrupo);
        corVermelho = findViewById(R.id.corVermelho);
        corAzul = findViewById(R.id.corAzul);
        corPreto = findViewById(R.id.corPreto);

        Button botaoCadastrar = findViewById(R.id.botaoCadastrar);
        botaoCadastrar.setOnClickListener(this::cadastrarUsuario);
    }

    public void Voltar(View view)
    {
        finish();
    }

    public void cadastrarUsuario(View view) {
        String nomeUser = nome.getText().toString();
        String idadeUser = idade.getText().toString();
        String ufUser = uf.getText().toString();
        String cidadeUser = cidade.getText().toString();
        String telefoneUser = telefone.getText().toString();
        String emailUser = email.getText().toString();

        int selectedTamanhoId = tamanhoGrupo.getCheckedRadioButtonId();
        RadioButton tamanhoSelecionado = findViewById(selectedTamanhoId);
        String tamanho = (tamanhoSelecionado != null) ? tamanhoSelecionado.getText().toString() : "Não informado";

        StringBuilder coresPreferidas = new StringBuilder();
        if (corVermelho.isChecked()) coresPreferidas.append("Vermelho ");
        if (corAzul.isChecked()) coresPreferidas.append("Azul ");
        if (corPreto.isChecked()) coresPreferidas.append("Preto ");

        Toast.makeText(this, "Cadastro com sucesso!", Toast.LENGTH_LONG).show();
    }

}