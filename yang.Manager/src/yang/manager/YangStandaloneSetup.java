/*
* generated by Xtext
*/
package yang.manager;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class YangStandaloneSetup extends YangStandaloneSetupGenerated{

	public static void doSetup() {
		new YangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

