package com.bean.scope;

public class ApplicationScopeDemo {
	
	// in web appliaction, we can create the multiple webapplicationcontext by loading the config file
	// so here when any new bean will be created with by default singleton scope, its created with different 
	// object
	// if we want the single object for multiple webapllicationcontext then we need to use
	// @Scope("application") spope: its used servletcontext to set the applicatioscope value

}
