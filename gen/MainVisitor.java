// Generated from C:/Users/a2sh2/IdeaProjects/Yapis_test/src\Main.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Main}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Main#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Main.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(Main.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(Main.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#catchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchBlock(Main.CatchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#catchClassTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClassTypes(Main.CatchClassTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(Main.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Main#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(Main.ClassNameContext ctx);
}