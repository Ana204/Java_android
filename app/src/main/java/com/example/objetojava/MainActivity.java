package com.example.objetojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //chamo a minha class
    private Carro carro;
    private Moto moto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando meu objeto
        carro = new Carro("Verde", "4", "FORD");
        moto = new Moto("Preto", "2", "HONDA");

        System.out.println(carro.getCor() + " - " + carro.getRodas() + " - " + carro.getMarca());
        System.out.println(moto.getCor() + " - " + moto.getRodas() + " - " + moto.getMarca());
    }
}