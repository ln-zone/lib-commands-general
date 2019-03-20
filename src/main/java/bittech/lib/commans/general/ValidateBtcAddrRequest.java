package bittech.lib.commans.general;

import bittech.lib.protocol.Request;

public class ValidateBtcAddrRequest implements Request {

	public final String addr;

	public ValidateBtcAddrRequest(final String addr) {
		this.addr = addr;
	}

}
