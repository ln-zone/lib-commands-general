package bittech.lib.commans.general;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class DeleteExceptionsCommand extends Command<NoDataRequest, NoDataResponse> {

	public static DeleteExceptionsCommand createStub () {
		return new DeleteExceptionsCommand();
	}
	
	public DeleteExceptionsCommand() {
		request = new NoDataRequest();
	}

}
