package bittech.lib.commans.general;

import bittech.lib.protocol.Command;

public class GetExceptionCommand extends Command<GetExceptionRequest, GetExceptionResponse> {

	public static GetExceptionCommand createStub () {
		return new GetExceptionCommand(-17389);
	}
	
	public GetExceptionCommand(final long exceptionId) {
		request = new GetExceptionRequest(exceptionId);
	}

}
