package com.company.zadanie1.stack;

import com.company.zadanie1.classes.Animal;
import com.company.zadanie1.interfaces.Stosator;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class StackOperations implements Stosator {
    private List<Animal> stackList;

    public StackOperations(int listSize) {
        this.stackList = new ArrayList<>(listSize);
    }

    @Override
    public void addToStack(Animal animal) {
        if(getStackObjectsAmount() != stackList.size()-1) {
            stackList.add(animal);
        }else {
            throw new IndexOutOfBoundsException("Stack is overflown");
        }
    }

    @Override
    public void deleteFromStack() throws IndexOutOfBoundsException {
        stackList.remove(stackList.size()-1);
    }

    @Override
    public int getStackObjectsAmount() {
        Object[] objectsOnStack = stackList.toArray();
        return objectsOnStack.length;
    }
}
