package org.bluedash.resteasy.interceptors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/users")
public class UserServlet {

	@Path("{name}")
	@GET
	@Produces("text/plain")	
	public String getUses(@PathParam("name") String name) {
		return "User: " + name;
	}

}
