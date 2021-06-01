package com.example.objetojava;

public class Veiculo {

    //atributos
    private String cor;
    private String rodas;
    private String marca;

    //construtor
    public  Veiculo(String cor, String rodas, String marca)
    {
        this.cor = cor;
        this.rodas = rodas;
        this.marca = marca;
    }

    //Métodos get para pegar os atributos da class veiculo
    //Cor
    public String getCor()
    {
        return  this.cor;
    }

    //Método set para setar os atributos da class veiculo
    public void setCor(String cor)
    {
        this.cor = cor;
    }

    //Rodas
    public String getRodas()
    {
        return this.rodas;
    }

    public void setRodas(String rodas)
    {
        this.rodas = rodas;
    }

    //Marca
    public String getMarca()
    {
        return this.marca;
    }
     public void setMarca(String marca)
     {
         this.marca = marca;
     }


    //métodos
    public void veiculoAndar(){
        System.out.println("Veiculo está andando");
    }

    public void veiculoFrear(){
        System.out.println("Veiculo freiou");
    }
}
