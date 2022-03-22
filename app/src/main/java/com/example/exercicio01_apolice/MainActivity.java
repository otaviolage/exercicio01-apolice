package com.example.exercicio01_apolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    char sexo = 'n';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularValorDaApolice(View view) {
        EditText nome = findViewById(R.id.nome);
        Apolice apolice = new Apolice(R.id.numero, nome.getText().toString(), R.id.idade, sexo, R.id.valorAutomovel);
        double valor = apolice.calcularValor();

        Toast.makeText(this, String.valueOf(valor), Toast.LENGTH_SHORT).show();
    }

    public void radioSexoClick(View view){
        RadioButton radio = (RadioButton) view;

        switch (radio.getId()) {
            case R.id.radioButtonMasculino:
                if(radio.isChecked())
                    sexo = 'M';
                break;
            case R.id.radioButtonFeminino:
                if(radio.isChecked())
                    sexo = 'F';
                break;
        }
    }
}