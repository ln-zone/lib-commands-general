package bittech.lib.commans.general;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;

public class ConnectionsInfoCommand extends Command<NoDataRequest, ConnectionsInfoResponse> {

	public static ConnectionsInfoCommand createStub() {
		return new ConnectionsInfoCommand();
	}
	
	public ConnectionsInfoCommand() {
		request = new NoDataRequest();
	}

}
