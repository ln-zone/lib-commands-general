package bittech.lib.commans.general;

import bittech.lib.protocol.Response;
import bittech.lib.utils.ExecResponse;

public class SystemExecResponse implements Response {

	public String output;
	public String errout;
	public int exitCode;
	
	public SystemExecResponse(ExecResponse execResponse) {
		this.output = execResponse.output;
		this.errout = execResponse.errout;
		this.exitCode = execResponse.exitCode;
	}

}
