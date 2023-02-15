package main.rules;

import java.util.HashMap;

public class SymbolTable {

    private HashMap<String, Symbol> map;

    public SymbolTable() {

        map = new HashMap<String, Symbol>();
    }

    public void add(Symbol symbol) {

        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }

    public Symbol get(String name) {

        return map.get(name);
    }
}
