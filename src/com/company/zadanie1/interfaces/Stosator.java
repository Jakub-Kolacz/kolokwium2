package com.company.zadanie1.interfaces;

import com.company.zadanie1.classes.Animal;

import java.util.NoSuchElementException;

public interface Stosator{
    void addToStack(Animal animal);
    void deleteFromStack() throws NoSuchElementException;
    int getStackObjectsAmount();

}
