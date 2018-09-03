package test;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class App extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {
			//array de conf de servicio
			WebConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				// Devuelve todas las rutas que estan habilitadas en el server
				"/"
		};
	}
	
}
