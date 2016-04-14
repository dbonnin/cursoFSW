package com.visionbanco.fsw.filtroSMS.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sms_message")
@XmlAccessorType(XmlAccessType.FIELD)
public class MensajeXML {
	
	public String nt;
	public String msg;

}
