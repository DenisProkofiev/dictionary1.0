package dictionaryconsole.interfaces;

import java.util.List;

public interface Dictionary {

    public List<String> getPairList();

    public boolean removePair(String key);

    public String getValue(String key);

    public boolean addPair(String key, String value);

}
