package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {

    private Button botaoVoltar;
    private ImageView imagem;
    private TextView nomeMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_resposta);

        imagem = findViewById(R.id.moedaId);
        botaoVoltar = findViewById(R.id.voltarId);
        nomeMoeda = findViewById(R.id.respostaId);


        Bundle extra = getIntent().getExtras();

        if(extra!=null){

            String opcaoEscolhida = extra.getString("opcao");



            if(opcaoEscolhida.equals("cara")){

                //imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.cara));
                nomeMoeda.setText("Cara");

            }else{

                //imagem coroa
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.coroa));
                nomeMoeda.setText("Coroa");

            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ira finalizar a atividade atual
                finish();


            }
        });

    }
}
