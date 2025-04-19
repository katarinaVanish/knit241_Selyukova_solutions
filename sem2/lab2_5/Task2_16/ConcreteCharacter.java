package org.knit.solutions.sem2.lab2_5.Task2_16;

public class ConcreteCharacter implements Character{
    private final char symbol;

    public ConcreteCharacter(char symbol){
        this.symbol = symbol;
    }
    @Override
    public void render(int x, int y, String style){
        System.out.printf("Символ '%c' отображается в (%d, %d) со стилем [%s]%n",symbol, x, y, style);
    }
}
