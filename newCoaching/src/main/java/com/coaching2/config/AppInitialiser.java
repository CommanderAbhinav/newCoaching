package com.coaching2.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitialiser extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] configFiles= {MailConfig.class};
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFiles= {AppConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mappings= {"/"};
		return mappings;
	}

}
