package sk.itsovy.kutka.stack;

import sk.itsovy.kutka.exception.StackOverflowException;
import sk.itsovy.kutka.exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size;
    private int capacity;
    private T[] array;
    private List<T> list;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T obj) throws StackOverflowException {
        if (obj == null){
            return;
        }
        if(!isFull() && obj != null) {
            list.add(obj);
            size++;
        } else throw new StackOverflowException("Si debil?! Šak si pretiekol!!");
    }

    public void pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Na! Podceklo si.");
        } else {
            list.remove(size - 1);
            size--;
        }
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        else {
            return list.get(size-1);
        }
    }

    public T topAndPop() throws StackUnderflowException {
        T temp = top();
        pop();
        return temp;
    }

    public void empty(){
        list.clear();
    }
    public void printStack() {
        for (T t:list) {
            System.out.print(t + ", ");

        }
    }
}
