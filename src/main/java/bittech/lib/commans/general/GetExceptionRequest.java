package bittech.lib.commans.general;

import bittech.lib.protocol.Request;

public class GetExceptionRequest implements Request {

	public final long exceptionId;

	public GetExceptionRequest(final long exceptionId) {
		this.exceptionId = exceptionId;
		// TODO Auto-generated constructor stub
	}

}
