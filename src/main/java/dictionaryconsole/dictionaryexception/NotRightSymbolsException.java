package dictionaryconsole.dictionaryexception;

import dictionaryconsole.utils.Helper;

public class NotRightSymbolsException extends Exception {
    public NotRightSymbolsException() {
    }

    public NotRightSymbolsException(String s) {
        Helper.writeMessage(s);
    }


}
