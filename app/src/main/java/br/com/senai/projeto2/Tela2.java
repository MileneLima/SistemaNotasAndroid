package br.com.senai.projeto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Button voltar = findViewById(R.id.btn_voltar);
        voltar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                voltarHome();
            }
        });

        Button resultado = (Button)  findViewById(R.id.btn_calcular);
        resultado.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(Tela2.this, Resultado.class );

        EditText nota1 = (EditText) findViewById(R.id.nota1);
        EditText nota2 = (EditText) findViewById(R.id.nota2);
        EditText nota3 = (EditText) findViewById(R.id.nota3);
        EditText nota4 = (EditText) findViewById(R.id.nota4);

        Bundle params = new Bundle();

        params.putString("nota1",nota1.getText().toString());
        params.putString("nota2",nota2.getText().toString());
        params.putString("nota3",nota3.getText().toString());
        params.putString("nota4",nota4.getText().toString());
        double valorNota1 = 0;
        double valorNota2 = 0;
        double valorNota3 = 0;
        double valorNota4 = 0;
        double media = 0;
        String situacao = "";

        valorNota1 = Integer.parseInt(nota1.getText().toString());
        valorNota2 = Integer.parseInt(nota2.getText().toString());
        valorNota3 = Integer.parseInt(nota3.getText().toString());
        valorNota4 = Integer.parseInt(nota4.getText().toString());
        media = (valorNota1 + valorNota2 + valorNota3 + valorNota4) /4;

        params.putString("media",String.valueOf(media));

        it.putExtras(params);
        startActivity(it);

        if(media >= 7){
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        params.putString("situacao", situacao);

        it.putExtras(params);
        startActivity(it);
    }

    public void voltarHome() {
        Intent it = new Intent(Tela2.this, MainActivity.class );
        startActivity(it);
    }
}