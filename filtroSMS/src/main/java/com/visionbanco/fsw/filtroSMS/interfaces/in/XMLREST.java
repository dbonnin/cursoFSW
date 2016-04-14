package com.visionbanco.fsw.filtroSMS.interfaces.in;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.visionbanco.fsw.filtroSMS.dto.MensajeXML;

@Path("/")
public interface XMLREST {
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	MensajeXML enviar(MensajeXML mensaje);
	

}
