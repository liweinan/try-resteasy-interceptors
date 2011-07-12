package org.bluedash.resteasy.interceptors;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.ws.rs.GET;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.Provider;

import org.jboss.resteasy.annotations.interception.ServerInterceptor;
import org.jboss.resteasy.spi.interception.MessageBodyWriterContext;
import org.jboss.resteasy.spi.interception.MessageBodyWriterInterceptor;

@Provider
@ServerInterceptor
public class MyHeaderDecorator implements MessageBodyWriterInterceptor {
	
	public boolean accept(Class declaring, Method method) {
		return method.isAnnotationPresent(GET.class);
	}

	public void write(MessageBodyWriterContext context) throws IOException,
			WebApplicationException {		
		context.getHeaders().add("My-Header", "custom");
		context.proceed();
	}
}