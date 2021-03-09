package dictionaryconsole.factories;

import dictionaryconsole.dictionaryimpl.LatinRealization;
import dictionaryconsole.dictionaryimpl.NumericRealization;
import dictionaryconsole.enums.DictionaryImpl;
import dictionaryconsole.interfaces.Dictionary;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DictionaryFactory {
    public static Dictionary createDictionary(String path, DictionaryImpl implementation) {
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
