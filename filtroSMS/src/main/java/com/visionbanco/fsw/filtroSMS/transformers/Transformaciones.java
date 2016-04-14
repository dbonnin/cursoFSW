package com.visionbanco.fsw.filtroSMS.transformers;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.switchyard.annotations.Transformer;

import com.visionbanco.fsw.filtroSMS.dto.MensajeArchivoFormatoDos;
import com.visionbanco.fsw.filtroSMS.dto.MensajeArchivoFormatoUno;
import com.visionbanco.fsw.filtroSMS.dto.MensajeSMS;
import com.visionbanco.fsw.filtroSMS.dto.MensajeXML;

public final class Transformaciones {
	
	private static final ObjectMapper mapper=new ObjectMapper();

	@Transformer
	public String transformMensajeSMSToString(MensajeSMS from) {
		try {
			return mapper.writeValueAsString(from);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Transformer
	public MensajeSMS transformMensajeXMLToMensajeSMS(MensajeXML from) {
		MensajeSMS sms=new MensajeSMS();
		sms.nroTel=from.nt;
		sms.texto=from.msg;
		return sms;
	}
	
	@Transformer
	public MensajeSMS transformMensajeArchivoFormatoUnoToMensajeSMS(MensajeArchivoFormatoUno from) {
		MensajeSMS sms=new MensajeSMS();
		sms.nroDoc=from.nroDoc;
		sms.tipoDoc=from.tipoDoc;
		sms.texto=from.texto;
		return sms;
	}
	
	@Transformer
	public MensajeSMS transformMensajeArchivoFormatoDosToMensajeSMS(MensajeArchivoFormatoDos from) {
		MensajeSMS sms=new MensajeSMS();
		sms.nroDoc=from.nroDoc;
		sms.tipoDoc=from.tipoDoc;
		sms.texto=from.texto;
		return sms;
	}
	

}
