package com.example.objetojava;

public class Moto extends Veiculo{
    public Moto(String cor, String rodas, String marca) {
        super(cor, rodas, marca);
    }

    @Override
    public void veiculoAndar() {
        System.out.println("Moto esta andando!!");
    }

    @Override
    public void veiculoFrear() {
        System.out.println("Moto freou");
    }
}
