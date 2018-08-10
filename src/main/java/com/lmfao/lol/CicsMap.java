package com.lmfao.lol;

import java.util.HashMap;
import java.util.Map;

public class CicsMap {

    private Map<String, Cics> cicsMap = new HashMap<String, Cics>();

    public CicsMap() {
    }

    public Map<String, Cics> getCicsMap() {
        return cicsMap;
    }

    public void setCicsMap(Map<String, Cics> cicsMap) {
        this.cicsMap = cicsMap;
    }
}
