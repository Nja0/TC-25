// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(MiLenguajeParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(MiLenguajeParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#c}.
	 * @param ctx the parse tree
	 */
	void enterC(MiLenguajeParser.CContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#c}.
	 * @param ctx the parse tree
	 */
	void exitC(MiLenguajeParser.CContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(MiLenguajeParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(MiLenguajeParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(MiLenguajeParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(MiLenguajeParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(MiLenguajeParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(MiLenguajeParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#a}.
	 * @param ctx the parse tree
	 */
	void enterA(MiLenguajeParser.AContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#a}.
	 * @param ctx the parse tree
	 */
	void exitA(MiLenguajeParser.AContext ctx);
}