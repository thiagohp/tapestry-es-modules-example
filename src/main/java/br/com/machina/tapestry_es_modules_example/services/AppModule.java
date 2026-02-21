package br.com.machina.tapestry_es_modules_example.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.commons.MappedConfiguration;

public class AppModule {

    public static void contributeApplicationDefaults(MappedConfiguration<String, Object> configuration) {
        configuration.add(SymbolConstants.PRODUCTION_MODE, false); // for live class reloading
        configuration.add(SymbolConstants.JAVASCRIPT_INFRASTRUCTURE_PROVIDER, "jquery"); // comment out if you want to use Prototype instead of jQueyr
        configuration.add(SymbolConstants.REQUIRE_JS_ENABLED, false); // disable if yo uwant to use Require.js
    }
    
}
