package com.wewillhelpyou.openfire.plugin;

import java.io.File;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

public class DeskChat implements Plugin {

	Logger logger=LogManager.getLogger(this.getClass());
	@Override
	public void initializePlugin(PluginManager manager, File pluginDirectory) {
		// TODO Auto-generated method stub
		
		logger.info("Hello World @123");
	}

	@Override
	public void destroyPlugin() {
		// TODO Auto-generated method stub
		
	}

}
