package br.com.senai.projeto2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Button voltar = (Button)  findViewById(R.id.btnVoltar);
        voltar.setOnClickListener(this);

        TextView textMensagem = (TextView) findViewById(R.id.idMedia);
        TextView textSituacao = (TextView) findViewById(R.id.idSituacao);
        Intent it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem.setText(params.getString("media"));
                textSituacao.setText(params.getString("situacao"));
            }
        }
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(Resultado.this,MainActivity.class );
        startActivity(it);
    }

}
