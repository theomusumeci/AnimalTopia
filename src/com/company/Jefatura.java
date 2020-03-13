package com.company;

import java.util.List;

public class Jefatura {
    private List<Animal> listaAnimales;
    private List<Tomador> listaTomadores;

    public Jefatura(List<Animal> listaAnimales, List<Tomador> listaTomadores) {
        this.listaAnimales = listaAnimales;
        this.listaTomadores = listaTomadores;
    }

    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);

    }
//todo HACER QUE LO AGREGUE SOLO EXCEPTO EL PEZ
    public void agregarTomador(Tomador tomador){
        listaTomadores.add(tomador);
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public List<Tomador> getListaTomadores() {
        return listaTomadores;
    }


   // public void prenderRobot() {
     //   listaTomadores.
    //}

}