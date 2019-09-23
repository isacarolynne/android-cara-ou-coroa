package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Random;

public class CaraCoroa extends AppCompatActivity {

    private Button botaoJogar;
    private String[] opcao = {"cara","coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_cara_coroa);


        botaoJogar = findViewById(R.id.jogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Random randomico  = new Random();
                int numeroAleatorio = randomico.nextInt(2  );

                Intent intent = new Intent(CaraCoroa.this,RespostaActivity.class);

                intent.putExtra("opcao", opcao[numeroAleatorio]);
                startActivity(intent);


            }
        });



    }
}
