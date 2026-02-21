package br.com.machina.tapestry_es_modules_example.pages;

import org.apache.tapestry5.annotations.AfterRender;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

public class Index {

    @Inject private JavaScriptSupport javascriptSupport_;

    @AfterRender
    void afterRender() {
       javascriptSupport_.importEsModule("pdf/dummyFile").invoke("dummyFileLog").with("test text!");
    }

}
