package com.johnwilliam.poo;
import com.johnwilliam.poo.ingredientes.*;
public class Strogonof extends Comida {
    Frango frango;
    Molho molho;
    public Strogonof(String nome,String nacionalidade,Frango frango, Molho molho){
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.frango=frango;
        this.molho=molho;
        
    }
    @Override
    void estar_pronto(boolean esta_pronto) {
        
        super.estar_pronto(esta_pronto);
    }

}
