package com.johnwilliam.poo;

import com.johnwilliam.poo.ingredientes.*;

public class Main {
    public static void main(String[] args) {
        Frango flango= new Frango(15, "perdidão");
        Molho molho= new Molho(5, "variados");
        Strogonof strogonof= new Strogonof("strogonof_do_pai", "Russia", flango, molho);
        strogonof.estar_pronto(true);
    
    }
}