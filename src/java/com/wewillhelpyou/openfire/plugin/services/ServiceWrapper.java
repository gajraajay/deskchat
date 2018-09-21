package com.wewillhelpyou.openfire.plugin.services;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jivesoftware.admin.AuthCheckFilter;
import org.jivesoftware.openfire.plugin.rest.service.UserServiceLegacy;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class ServiceWrapper extends ServletContainer {
    private static Map<String, Object> config;
    /** The Constant RESOURCE_CONFIG_CLASS_KEY. */
    private static final String RESOURCE_CONFIG_CLASS_KEY = "com.sun.jersey.config.property.resourceConfigClass";
	Logger logger=LogManager.getLogger(this.getClass());

    /** The Constant RESOURCE_CONFIG_CLASS. */
    private static final String RESOURCE_CONFIG_CLASS = "com.sun.jersey.api.core.PackagesResourceConfig";
    private static PackagesResourceConfig prc;
    private static final String SERVLET_URL = "deskchat/*";

    private static String SCAN_PACKAGE_DEFAULT=ServiceWrapper.class.getPackage().getName();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static{
		  
	        config = new HashMap<String, Object>();
	        config.put(RESOURCE_CONFIG_CLASS_KEY, RESOURCE_CONFIG_CLASS);
	        config.put("com.sun.jersey.api.json.POJOMappingFeature", true);
	        
	        prc = new PackagesResourceConfig(SCAN_PACKAGE_DEFAULT);
	        prc.setPropertiesAndFeatures(config);		
	        prc.getClasses().add(DemoService.class);

	        
	}
	public ServiceWrapper() {
		super(prc);
	}
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);
        AuthCheckFilter.addExclude(SERVLET_URL);
		logger.info("INITING");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
        AuthCheckFilter.removeExclude(SERVLET_URL);

		super.destroy();
	}

}
