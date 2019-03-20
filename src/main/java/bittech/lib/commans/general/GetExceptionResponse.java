package bittech.lib.commans.general;

import bittech.lib.protocol.Response;
import bittech.lib.utils.Require;
import bittech.lib.utils.exceptions.ExceptionInfo;

public class GetExceptionResponse implements Response {

	public final ExceptionInfo exceptionInfo;
	
	public GetExceptionResponse(final ExceptionInfo exceptionInfo) {
		this.exceptionInfo = Require.notNull(exceptionInfo, "exceptionInfo");
	}

}
