package sk.itsovy.kutka.main;

import sk.itsovy.kutka.exception.StackOverflowException;
import sk.itsovy.kutka.stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException {
        Stack<Integer> stack = new Stack<>(10);
        stack.push(17);
        stack.push(30);
        stack.push(55);
        stack.push(9);
        stack.push(10);
        System.out.println();
    }
}
