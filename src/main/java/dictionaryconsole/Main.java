package dictionaryconsole;


import dictionaryconsole.enums.DictionaryType;
import dictionaryconsole.factories.DictionaryFactory;
import dictionaryconsole.interfaces.Dictionary;

public class Main {
    public static void main(String[] args) {

        Dictionary latinDictionary = DictionaryFactory.createDictionary("src/main/resources/latinDictionary.txt", DictionaryType.LATIN);
        latinDictionary.addPair("side", "ride");
        latinDictionary.addPair("goal", "tide");
        latinDictionary.addPair("gold", "Hand");
        latinDictionary.addPair("hold", "Gard");
        latinDictionary.addPair("adas", "frog");
        System.out.println(latinDictionary.getPairList());
        latinDictionary.removePair("adas");
        latinDictionary.removePair("gold");
        System.out.println(latinDictionary.getPairList());

        Dictionary numericDictionary = DictionaryFactory.createDictionary("src/main/resources/numericDictionary.txt", DictionaryType.NUMBER);
        numericDictionary.addPair("12345", "54534");
        numericDictionary.addPair("98765", "45312");
        System.out.println(numericDictionary.getPairList());
        numericDictionary.removePair("12345");
        System.out.println(numericDictionary.getPairList());


    }
}
