package main.rules;

public class Symbol {

    private String name;
    public Symbol(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "main.rules.SymbolTable{" +
                "name='" + name + '\'' +
                '}';
    }
}
