/*
 * generated by Xtext
 */
package com.thesoftwarefactory.vertx.web.mvc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class CodegenDslStandaloneSetup extends CodegenDslStandaloneSetupGenerated{

	public static void doSetup() {
		new CodegenDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
