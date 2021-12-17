package br.com.senai.projeto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_entrar = (Button)  findViewById(R.id.btn_entrar);
        btn_entrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent it = new Intent(MainActivity.this,Tela2.class );
        startActivity(it);
    }
}