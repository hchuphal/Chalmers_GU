package org.graphwalker.calculator;

public class Calculator {

    private int result = 0;

    public void add(int x, int y) {
        result = x + y;
    }

    public int getResult() {
        return result;
    }
}
