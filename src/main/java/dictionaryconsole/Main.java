package dictionaryconsole;


import dictionaryconsole.enums.DictionaryType;
import dictionaryconsole.factories.DictionaryFactory;
import dictionaryconsole.interfaces.Dictionary;

public class Main {
    public static void main(String[] args) {

        Dictionary latinDictionary = DictionaryFactory.createDictionary("src/main/resources/latinDictionary.txt", DictionaryType.LATIN);
        latinDictionary.addPair("side", "rideлглр");
        latinDictionary.addPair("goal", "tid555e");
        latinDictionary.addPair("gold", "Han87");
        latinDictionary.addPair("hold", "Garаа");
        latinDictionary.addPair("adas", "frogаа");
        System.out.println(latinDictionary.getPairList());
        latinDictionary.removePair("adas55");
        latinDictionary.removePair("gol88d");
        System.out.println(latinDictionary.getPairList());

        Dictionary numericDictionary = DictionaryFactory.createDictionary("src/main/resources/numericDictionary.txt", DictionaryType.NUMBER);
        numericDictionary.addPair("12345", "5453456кд");
        numericDictionary.addPair("98765", "45312лор");
        System.out.println(numericDictionary.getPairList());
        numericDictionary.removePair("12345");
        System.out.println(numericDictionary.getPairList());


    }
}
