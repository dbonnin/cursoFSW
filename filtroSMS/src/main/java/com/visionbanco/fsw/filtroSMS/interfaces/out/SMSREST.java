package com.visionbanco.fsw.filtroSMS.interfaces.out;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface SMSREST {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	String enviar(String mensaje);
}
