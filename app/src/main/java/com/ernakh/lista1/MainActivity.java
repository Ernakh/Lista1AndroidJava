package com.ernakh.lista1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/*

Exercício 1
 • Crie um App onde o usuário informa o nome e a idade
 • Mostre em tela a informação se ele é maior de idade ou não

Exercício 2
• Crie um App calculadora simples.
• Que recebe 2 valores e possua 1 botão para cada operação
básica

Exercício 3
 • Faça um app que simule o cadastro de usuários para uma loja de
roupas.
 • Ocadastrodevepossuir:
 • Nome
 • Idade
 • UF
 • Cidade
 • Telefone
 • Email
 • RadioButtonpara o usuário selecionar o tamanho padrão de roupas
 • Uma listagem (checkboxes) para selecionar as cores de preferência dentro de
uma lista de opções

Exercício 4
 • Faça o usuário digitar o nome e mostre na tela de forma dinâmica
1 checkbox para cada letra do nome

Exercício 5
 • Em uma tela, adicione três CheckBoxcom as opções:
 • Receber notificações
 • Modo escuro
 • Lembrar login
 • Adicione um Button chamado "Salvar Preferências".
 • Ao pressionar o botão, exiba um Toastlistando as opções
marcadas.
 • Se nenhuma opção for selecionada, exiba "Nenhuma preferência
foi escolhida".


Exercício 6
 • Construa uma Activityinicial com botões que permitem navegar
entre as soluções de cadaum dos exercícios.

Exercício 7
 • Crie um repositório no GitHub e suba a aplicação desenvolvida
que contenha a solução de todos os exercícios.

* */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Exercicio1(View view)
    {
        Intent i = new Intent(this,  Exercicio1Activity.class);
        startActivity(i);
    }

    public void Exercicio2(View view)
    {
        Intent i = new Intent(this,  Exercicio2Activity.class);
        startActivity(i);
    }

    public void Exercicio3(View view)
    {
        Intent i = new Intent(this,  Exercicio3Activity.class);
        startActivity(i);
    }

    public void Exercicio4(View view)
    {
        Intent i = new Intent(this,  Exercicio4Activity.class);
        startActivity(i);
    }

    public void Exercicio5(View view)
    {
        Intent i = new Intent(this,  Exercicio5Activity.class);
        startActivity(i);
    }
}