// Generated from C:/Users/a2sh2/IdeaProjects/Yapis_test/src\Main.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Main}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Main#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Main.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Main.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(Main.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(Main.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(Main.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(Main.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#catchBlock}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(Main.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#catchBlock}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(Main.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#catchClassTypes}.
	 * @param ctx the parse tree
	 */
	void enterCatchClassTypes(Main.CatchClassTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#catchClassTypes}.
	 * @param ctx the parse tree
	 */
	void exitCatchClassTypes(Main.CatchClassTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(Main.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(Main.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Main#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(Main.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Main#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(Main.ClassNameContext ctx);
}