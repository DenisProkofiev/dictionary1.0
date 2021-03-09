package dictionaryconsole.dictionaryexception;

import dictionaryconsole.utils.Helper;

public class NotRightLengthWordsException extends Exception {

    public NotRightLengthWordsException() {
    }

    public NotRightLengthWordsException(String s) {
        Helper.writeMessage(s);
    }
}
