package com.example.objetojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //chamo a minha class
    public Veiculo veiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando meu objeto
        veiculo = new Veiculo("Vermelho", "4", "FORD");


        veiculo.setCor("Azul");
        veiculo.setRodas("4");
        veiculo.setMarca("FIAT");

        System.out.println(veiculo.getCor() + " - " + veiculo.getRodas() + " - " + veiculo.getMarca());


    }
}