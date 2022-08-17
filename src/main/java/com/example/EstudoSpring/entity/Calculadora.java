package com.example.EstudoSpring.entity;

public class Calculadora {

    private Integer numA = 10;

    private Integer numb = 20;

    public Calculadora(Integer numA, Integer numb) {
        this.numA = numA;
        this.numb = numb;
    }

    public Integer getNumA() {
        return numA;
    }

    public void setNumA(Integer numA) {
        this.numA = numA;
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }
}
