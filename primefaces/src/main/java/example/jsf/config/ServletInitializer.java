package example.jsf.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext servletContext = event.getServletContext();
        ServletRegistration.Dynamic registration = servletContext.addServlet("faces-servlet", javax.faces.webapp.FacesServlet.class);
		registration.addMapping("*.jsf");
		registration.setLoadOnStartup(1);
		registration.setInitParameter("primefaces.THEME", "redmond");
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
}