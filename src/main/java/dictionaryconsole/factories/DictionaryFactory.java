package dictionaryconsole.factories;

import dictionaryconsole.dictionaryimpl.LatinRealization;
import dictionaryconsole.dictionaryimpl.NumericRealization;
import dictionaryconsole.enums.DictionaryType;
import dictionaryconsole.interfaces.Dictionary;

public class DictionaryFactory {
    public static Dictionary createDictionary(String path, DictionaryType implementation) {
        Dictionary dictionary = null;

        switch (implementation) {
            case LATIN:
                dictionary = new LatinRealization(path);
                break;
            case NUMBER:
                dictionary = new NumericRealization(path);
                break;
        }
        return dictionary;
    }
}
