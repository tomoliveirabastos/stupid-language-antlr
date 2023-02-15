// Generated from java-escape by ANTLR 4.11.1
package main.parser;

    import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StupidLangParser}.
 */
public interface StupidLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(StupidLangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(StupidLangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(StupidLangParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(StupidLangParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(StupidLangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(StupidLangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(StupidLangParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(StupidLangParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(StupidLangParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(StupidLangParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(StupidLangParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(StupidLangParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(StupidLangParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(StupidLangParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StupidLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StupidLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(StupidLangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(StupidLangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void enterVariaveis(StupidLangParser.VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#variaveis}.
	 * @param ctx the parse tree
	 */
	void exitVariaveis(StupidLangParser.VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(StupidLangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(StupidLangParser.TipoContext ctx);
}