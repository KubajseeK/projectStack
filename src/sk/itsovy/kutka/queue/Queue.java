package sk.itsovy.kutka.queue;

import sk.itsovy.kutka.exception.QueueOverflowException;
import sk.itsovy.kutka.exception.QueueUnderflowException;
import sk.itsovy.kutka.exception.StackOverflowException;
import sk.itsovy.kutka.exception.StackUnderflowException;

import java.util.ArrayList;

public class Queue<T> {
    private int capacity;
    private int size;
    private ArrayList<T> list;

    public Queue(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void dequeue() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Na! Podceklo si.");
        } else {
            size--;
            list.remove(0);
        }
    }

    public void enqueue(T obj) throws QueueOverflowException {
        if (obj == null) {
            return;
        }
        if (!isFull() && obj != null) {
            list.add(obj);
            size++;
        } else throw new QueueOverflowException("Si debil?! Šak si pretiekol!!");
    }

    public T front() {
        if (isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    public void empty() {
        list.clear();
    }
}
