package bittech.lib.commans.general;

import bittech.lib.protocol.Response;

public class ValidateBtcAddrResponse implements Response {

	public final boolean valid;

	public ValidateBtcAddrResponse(final boolean valid) {
		this.valid = valid;
	}

}
