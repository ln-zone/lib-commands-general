package bittech.lib.commans.general;

import bittech.lib.protocol.Command;
import bittech.lib.protocol.common.NoDataRequest;
import bittech.lib.protocol.common.NoDataResponse;

public class SaveCommand extends Command<NoDataRequest, NoDataResponse> {

	public static SaveCommand createStub() {
		return new SaveCommand();
	}

	public SaveCommand() {
		this.request = new NoDataRequest();
	}

}
