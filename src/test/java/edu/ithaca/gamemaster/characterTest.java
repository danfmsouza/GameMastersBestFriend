package edu.ithaca.gamemaster;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class characterTest {
    @Test
    void createCharacterTest(){
        Action test = new Action("Fireball");
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Elvish");
        ArrayList<Action> actions = new ArrayList<Action>();
        actions.add(test);

        //Correct Character test
        Character testCharacter = new Character("Bilbo");
        testCharacter.setHP(100);
        testCharacter.setStrength(18);
        testCharacter.setDexterity(10);
        testCharacter.setConstitution(14);
        testCharacter.setIntelligence(15);
        testCharacter.setWisdom(11);
        testCharacter.setCharisma(12);
        testCharacter.setSpeed(50);
        testCharacter.setArmor(60);
        testCharacter.setAlignment("Lawful Evil");
        testCharacter.setLanguages(languages);
        testCharacter.setActions(actions);


        assertEquals("Bilbo", testCharacter.getName());
        assertEquals(100,testCharacter.getHP());
        assertEquals(18,testCharacter.getStrength());
        assertEquals(10,testCharacter.getDexterity());
        assertEquals(14,testCharacter.getConstitution());
        assertEquals(15,testCharacter.getIntelligence());
        assertEquals(11,testCharacter.getWisdom());
        assertEquals(12,testCharacter.getCharisma());
        assertEquals(50,testCharacter.getSpeed());
        assertEquals(60,testCharacter.getArmor());
        assertEquals("Lawful Evil",testCharacter.getAlignment());
        assertEquals("[English, Elvish]",testCharacter.getLanguages());
        assertEquals("Fireball, ", testCharacter.getActions());
    }

    @Test
    void createInvalidCharacterTest(){
        Action test = new Action("Fireball");
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Elvish");
        ArrayList<Action> actions = new ArrayList<Action>();
        actions.add(test);

        Character testCharacter = new Character("Bilbo");
        testCharacter.setHP(100);
        assertThrows(IllegalArgumentException.class, ()->testCharacter.setStrength(21));
        testCharacter.setDexterity(10);
        testCharacter.setConstitution(14);
        testCharacter.setIntelligence(15);
        testCharacter.setWisdom(11);
        testCharacter.setCharisma(12);
        testCharacter.setSpeed(50);
        testCharacter.setArmor(60);
        testCharacter.setAlignment("Lawful Evil");
        testCharacter.setLanguages(languages);
        testCharacter.setActions(actions);
    }
    @Test
    void addingToCharacterInternalListTest(){
        Action test = new Action("Fireball");
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Elvish");
        ArrayList<Action> actions = new ArrayList<Action>();
        actions.add(test);

        //creates character
        Character testCharacter = new Character("Bilbo");
        testCharacter.setHP(100);
        testCharacter.setStrength(18);
        testCharacter.setDexterity(10);
        testCharacter.setConstitution(14);
        testCharacter.setIntelligence(15);
        testCharacter.setWisdom(11);
        testCharacter.setCharisma(12);
        testCharacter.setSpeed(50);
        testCharacter.setArmor(60);
        testCharacter.setAlignment("Lawful Evil");
        testCharacter.setLanguages(languages);
        testCharacter.setActions(actions);

        testCharacter.addLanguage("Orcish");
        assertEquals("[English, Elvish, Orcish]",testCharacter.getLanguages());
    }
}
