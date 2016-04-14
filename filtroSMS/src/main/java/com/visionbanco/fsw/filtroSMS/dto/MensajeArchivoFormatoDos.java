package com.visionbanco.fsw.filtroSMS.dto;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonSerialize(include=Inclusion.NON_NULL)
public class MensajeArchivoFormatoDos {

	public String tipoDoc;
	public String nroDoc;
	public String texto;

}
