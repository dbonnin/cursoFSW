package com.visionbanco.fsw.filtroSMS.beans;

import org.switchyard.component.bean.Service;

import com.visionbanco.fsw.filtroSMS.dto.MensajeArchivoFormatoUno;
import com.visionbanco.fsw.filtroSMS.interfaces.interno.InterpreteArchivoFormatoUno;

@Service(InterpreteArchivoFormatoUno.class)
public class InterpreteArchivoFormatoUnoBean implements InterpreteArchivoFormatoUno {
	
	@Override
	public MensajeArchivoFormatoUno interpretar(String mensaje){
		String[] s=mensaje.split("\\|");
		MensajeArchivoFormatoUno m=new MensajeArchivoFormatoUno();
		m.nombre=s[2];
		m.tipoDoc=s[0];
		m.nroDoc=s[1];
		m.texto=s[3];
		return m;
	}

}
