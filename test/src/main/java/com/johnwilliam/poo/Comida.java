package com.johnwilliam.poo;

public class Comida {
    String nome="";
    String nacionalidade="";
    void estar_pronto(boolean esta_pronto){
        if (esta_pronto) {
            System.out.println("Seu pedido já está pronto!");
        }
        else{
            System.out.println("Seu pedido ainda não está pronto. Aguarde mais alguns instantes.");
        }
    }
}
