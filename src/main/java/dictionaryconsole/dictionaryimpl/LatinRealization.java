package dictionaryconsole.dictionaryimpl;

import dictionaryconsole.dictionaryexception.NotRightLengthWordsException;
import dictionaryconsole.dictionaryexception.NotRightSymbolsException;

import java.nio.file.Path;

public class LatinRealization extends AbstractDictionary {
    public static final int KEY_AND_VALUE_SIZE = 4;
    public static final String LATIN_PATTERN = "^[a-zA-Z0-9]+$";

    public LatinRealization(String fileSource) {
        super(fileSource);
    }

    @Override
    public boolean dictionaryMatches(String keyCheck, String valueCheck, int keyLength, int valueLength) {

            if (keyLength == KEY_AND_VALUE_SIZE && valueLength == KEY_AND_VALUE_SIZE) {
                if (keyCheck.matches(LATIN_PATTERN) && valueCheck.matches(LATIN_PATTERN)) {
                    return true;
                } else {
                    try {
                        throw new NotRightSymbolsException();
                    } catch (NotRightSymbolsException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                try {
                    throw new NotRightLengthWordsException();
                } catch (NotRightLengthWordsException e) {
                    e.printStackTrace();
                }
            }
        return false;
    }

    public static int getKeyAndValueSize() {
        return KEY_AND_VALUE_SIZE;
    }

    public static String getLatinPattern() {
        return new String(LATIN_PATTERN);
    }
}
