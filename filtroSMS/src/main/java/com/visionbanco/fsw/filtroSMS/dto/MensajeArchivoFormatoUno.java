package com.visionbanco.fsw.filtroSMS.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSerialize(include=Inclusion.NON_NULL)
public class MensajeArchivoFormatoUno {
	
	public String nombre;
	public String texto;
	public String nroDoc;
	public String tipoDoc;

}
