package com.hackathon.restws;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.hackathon.restws.exceptions.JamsBusinessException;

@Provider
public class JamsBusinessExceptionMapper implements ExceptionMapper<JamsBusinessException> {

	@Override
	public Response toResponse(JamsBusinessException e) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\"status\":\"error\"");
		sb.append(",");
		sb.append("\"message\":\"Try Again Later\"");
		sb.append("}");

		return Response.serverError().entity(sb.toString()).type(MediaType.APPLICATION_JSON).build();
	}

}
