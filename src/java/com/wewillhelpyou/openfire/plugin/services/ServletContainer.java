package com.wewillhelpyou.openfire.plugin.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;

public class ServletContainer extends ResourceConfig{
	Logger logger=LogManager.getLogger(this.getClass());

	public ServletContainer() {
		logger.info("Hello World @123");
		packages(ServiceWrapper.class.getPackage().getName());
	}
}
