package bittech.lib.commans.general;

import bittech.lib.protocol.Request;
import bittech.lib.utils.Require;

public class SystemExecRequest implements Request {

	public final String cmd;
	public final long timeout;
	
	public SystemExecRequest(final String cmd, final long timeout) {
		this.cmd = Require.notNull(cmd, "cmd");
		this.timeout = Require.inRange(timeout, 0, Long.MAX_VALUE, "timeout");
	}

}
