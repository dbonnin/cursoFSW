package com.visionbanco.fsw.filtroSMS.interfaces.in;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface MockSMSREST {
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	void recibir(String mensaje);

}
