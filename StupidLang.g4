grammar StupidLang;

@header {
    import main.rules.Symbol;
    import main.rules.SymbolTable;
    import main.rules.Variable;
    import java.util.ArrayList;
}

@members {
    private int _tipo;
    private String _varName;
    private String _varValue;
    private Symbol symbol;
    private SymbolTable symbolTable = new SymbolTable();
}

programa: 'inicio:' decl bloco 'fim;';

decl: (variaveis)+;

bloco: (cmd) +;

cmd: cmdleitura | cmdescrita  | cmdattrib;

cmdleitura: 'leia' AP
    VALOR {
        String v = _input.LT(-1).getText();
        System.out.println("VALOR " + v);
    }
    FP
    SC;

cmdescrita: 'escreva' AP VALOR FP SC;

cmdattrib: VALOR ATTR expr SC;

expr: termo (OP termo) *;

termo: VALOR| NUMBER;

variaveis: tipo VALOR {
           _varName = _input.LT(-1).getText();
           _varValue = null;

           symbol = new Variable(_varName, _tipo, _varValue);

           if(!symbolTable.exists(_varName)) {
               symbolTable.add(symbol);
           } else {
            System.out.println("Exists variable");
            System.exit(1);
          }
       } (VIRGULA VALOR {
         _varName = _input.LT(-1).getText();
         _varValue = null;

         symbol = new Variable(_varName, _tipo, _varValue);

         if(!symbolTable.exists(_varName)) {
             symbolTable.add(symbol);
         }else {
            System.out.println("Exists variable");
            System.exit(1);
         }
    })* SC;

tipo:
    'numero' {_tipo = Variable.NUMBER; }|
    'texto' { _tipo = Variable.TEXT; };

VIRGULA: ',';

AP: '(';

FP: ')';

SC: ';';

OP: '+' | '-' | '*' | '/';

ATTR: '=';

VALOR: [a-z] ([a-z] | [A-Z] | [0-9]) *;

ID: VALOR;

NUMBER: [0-9] + ('.' [0-9] + ) ?;

WHITESPACE: ( ' ' | '\t' | '\n' | '\r' ) -> skip;