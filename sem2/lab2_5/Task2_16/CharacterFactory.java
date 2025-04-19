package org.knit.solutions.sem2.lab2_5.Task2_16;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<java.lang.Character, ConcreteCharacter> characterMap = new HashMap<>();

    public Character getCharacter(char symbol){
        characterMap.putIfAbsent(symbol, new ConcreteCharacter(symbol));
        return characterMap.get(symbol);
    }

    public int getTotalCharacters(){
        return characterMap.size();
    }
}
