package com.example.unius.contadordepessoas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int countMale = 0;
    int countFemale = 0;
    int countPeople = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando componentes definidos no content main
        final TextView fieldText = (TextView) findViewById(R.id.textP);
        final Button male = (Button) findViewById(R.id.buttonM);
        final Button female = (Button) findViewById(R.id.buttonF);
        final Button reset = (Button) findViewById(R.id.buttonR);

        //Função de click no botão Azul
        male.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                //Incrementando quantidade de pessoas e homens
                countMale++;
                countPeople++;

                //Convertendo valores para String e colocando no layoyut
                String message = Integer.toString(countPeople);
                fieldText.setText("Pessoas: " + message);
                male.setText(Integer.toString(countMale));
            }
        });

        //Função de click no botão Rosa
        female.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                //Incrementando quantidade de pessoas e mulheres
                countFemale++;
                countPeople++;

                //Convertendo valores para String e colocando no layoyut
                String message = Integer.toString(countPeople);
                fieldText.setText("Pessoas: " + message);
                female.setText(Integer.toString(countFemale));
            }
        });

        //Função de click no botão Rosa
        reset.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

                //Incrementando quantidade de pessoas e mulheres
                countFemale = 0;
                countMale = 0;
                countPeople = 0;

                //Convertendo valores para String e colocando no layoyut
                String message = Integer.toString(countPeople);
                fieldText.setText("Pessoas: " + message);
                male.setText(Integer.toString(countMale));
                female.setText(Integer.toString(countFemale));
            }
        });
    }
}
