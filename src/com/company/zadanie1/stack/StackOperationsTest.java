package com.company.zadanie1.stack;

import com.company.zadanie1.classes.Cat;
import com.company.zadanie1.classes.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackOperationsTest {

    @Test
    public void addToStackTest(){
        //given
        StackOperations stack = new StackOperations(10);

        //when
        stack.addToStack(new Dog());
        stack.addToStack(new Dog());
        stack.addToStack(new Cat());

        //then
        Assertions.assertEquals(3, stack.getStackObjectsAmount());
    }

    @Test
    public void stackOverflown(){
        //given
        StackOperations stack = new StackOperations(2);
        stack.addToStack(new Cat());
        stack.addToStack(new Dog());

        //then
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()->  stack.addToStack(new Dog()));
    }

    @Test
    public void deleteFromStack(){
        //given
        StackOperations stack = new StackOperations(2);
        stack.addToStack(new Dog());
        stack.addToStack(new Cat());

        //when
        stack.deleteFromStack();

        //then
        Assertions.assertEquals(1, stack.getStackObjectsAmount());
    }

    @Test
    public void deleteFromStackException(){
        //given
        StackOperations stack = new StackOperations(1);

        //then
        Assertions.assertThrows(IndexOutOfBoundsException.class, stack::deleteFromStack);
    }
}