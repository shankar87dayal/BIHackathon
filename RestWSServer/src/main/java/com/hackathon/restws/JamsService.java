package com.hackathon.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.hackathon.restws.model.Jams;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/Jamsservice")
public interface JamsService {

	@Path("/Jamss")
	@GET
	List<Jams> getJamss();

	@Path("/Jamss/{id}")
	@GET
	Jams getJams(@PathParam("id") Long id);

	@Path("/Jamss")
	@POST
	Response createJams(Jams Jams);

	@Path("/Jamss")
	@PUT
	Response updateJams(Jams Jams);

	@Path("/Jamss/{id}")
	@DELETE
	Response deleteJams(@PathParam("id") Long id);

}
