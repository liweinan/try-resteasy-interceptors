package org.bluedash.resteasy.interceptors;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class BluedashResteasyApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> classes = new HashSet<Class<?>>();

	public BluedashResteasyApplication() {
		// classes.add(UserServlet.class);
		classes.add(UserServlet.class);
		singletons.add(new MyHeaderDecorator());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
