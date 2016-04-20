package com.visionbanco.fsw.filtroSMS.beans;

import org.switchyard.component.bean.Service;

import com.visionbanco.fsw.filtroSMS.dto.MensajeArchivoFormatoDos;
import com.visionbanco.fsw.filtroSMS.interfaces.interno.InterpreteArchivoFormatoDos;

@Service(InterpreteArchivoFormatoDos.class)
public class InterpreteArchivoFormatoDosBean implements
		InterpreteArchivoFormatoDos {
	
	
	@Override
	public MensajeArchivoFormatoDos interpretar(String mensaje){
		
		MensajeArchivoFormatoDos m=new MensajeArchivoFormatoDos();
		m.tipoDoc=mensaje.substring(0, 1);
		m.nroDoc=mensaje.substring(2, 13);
		m.texto=mensaje.substring(14);
		
		if("9".equals(m.tipoDoc)) m.tipoDoc="RUC";
		else if("1".equals(m.tipoDoc)) m.tipoDoc="CI";
		
		return m;
	}

}
