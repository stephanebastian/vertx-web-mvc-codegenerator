/*
 * generated by Xtext
 */
package com.thesoftwarefactory.vertx.web.mvc.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CodegenDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/thesoftwarefactory/vertx/web/mvc/parser/antlr/internal/InternalCodegenDsl.tokens");
	}
}