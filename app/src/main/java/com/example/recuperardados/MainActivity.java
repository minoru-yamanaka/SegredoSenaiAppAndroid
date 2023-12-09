package com.example.recuperardados;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonSalvar;
    private EditText editNome;
    private TextView textResultado;
    private static final String   ARQUIVO_PREFERENCIA  = "ArquivoPreferencia";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        textResultado = findViewById(R.id.textResultado);
        editNome = findViewById(R.id.editNome);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences
                        (ARQUIVO_PREFERENCIA, 0);
                SharedPreferences.Editor editor = preferences.edit();
                if (editNome.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "Preencha o nome",
                            Toast.LENGTH_SHORT).show();
                }else {
                    String segredo= editNome.getText().toString();
                    editor.putString("segredo", segredo);
                    editor.commit();
                    textResultado.setText("Seu Segredo é ...\n " + segredo);
                }
                // recupera dados

            }
        });
        SharedPreferences preferences = getSharedPreferences
                (ARQUIVO_PREFERENCIA,0);

        if (preferences.contains("nome")){
            String segredo = preferences.getString("nome",
                    "usuario não definido");
            textResultado.setText("Seu Segredo é ...\n " + segredo);
        } else {
            textResultado.setText("Ola, usuário não definido");
        }

    }
}