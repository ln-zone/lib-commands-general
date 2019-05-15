package bittech.lib.commans.general;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataResponse;

public class CheckConnectionCommand extends Command<CheckConnectionRequest, NoDataResponse> {

	public static CheckConnectionCommand createStub() {
		return new CheckConnectionCommand("");
	}
	
	public CheckConnectionCommand(String connectionName) {
		this.request = new CheckConnectionRequest();
		this.request.connectionName = connectionName;
	}

}
