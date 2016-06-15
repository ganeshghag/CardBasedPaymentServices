package com.ctil.payments.cardbased.trial;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;
import org.jpos.util.Log;

public class EchoHandler extends Log implements ISORequestListener {

	public boolean process(ISOSource source, ISOMsg m) {
		try {
			if ("0800".equals(m.getMTI())) {
				m.setResponseMTI();
				m.set(39, "00");
				source.send(m);
			}
		} catch (Exception e) {
			warn("echo-handler", e);
		}
		return true;
	}

}
