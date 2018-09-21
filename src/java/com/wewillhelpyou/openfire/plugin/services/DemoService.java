package com.wewillhelpyou.openfire.plugin.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.wewillhelpyou.openfire.plugin.model.User;


@Path("deskchat/v1/demo")
public class DemoService {
	public DemoService() {
		logger.info("loging here");
	}
	Logger logger=LogManager.getLogger(this.getClass());

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public User helloworld(){
		logger.info("loging here");
		User user=new User();
		return user;
	}
	
	
}
