package com.example.exercicio01_apolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    char sexo = 'M';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularValorDaApolice(View view) {
        EditText editTextNumero = (EditText) findViewById(R.id.numero);
        int numero = Integer.parseInt(editTextNumero.getText().toString());

        EditText nome = findViewById(R.id.nome);

        EditText editTextIdade = (EditText) findViewById(R.id.idade);
        int idade = Integer.parseInt(editTextIdade.getText().toString());

        EditText editTextValorAutomovel = (EditText) findViewById(R.id.valorAutomovel);
        double valorAutomovel = Double.parseDouble(editTextValorAutomovel.getText().toString());

        System.out.println("valor antes de setar a apolice: " + valorAutomovel);

        Apolice apolice = new Apolice(numero, nome.getText().toString(), idade, sexo, valorAutomovel);
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