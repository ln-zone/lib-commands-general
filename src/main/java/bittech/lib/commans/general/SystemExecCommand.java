package bittech.lib.commans.general;

import bittech.lib.protocol.Command;

public class SystemExecCommand extends Command<SystemExecRequest, SystemExecResponse> {

	public static SystemExecCommand createStub () {
		return new SystemExecCommand("", 5000);
	}
	
	public SystemExecCommand(final String cmd, long timeout) {
		request = new SystemExecRequest(cmd, timeout);
	}

}
