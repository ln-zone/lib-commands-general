package bittech.lib.commans.general;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class DeleteLogsCommand extends Command<NoDataRequest, NoDataResponse> {

	public static DeleteLogsCommand createStub () {
		return new DeleteLogsCommand();
	}
	
	public DeleteLogsCommand() {
		request = new NoDataRequest();
	}

}
