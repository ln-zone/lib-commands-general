package bittech.lib.commans.general;

import java.util.HashMap;
import java.util.Map;

import bittech.lib.protocol.Command;

public class RestCommand extends Command<RestRequest, RestResponse> {

	public static RestCommand createStub() {
		return new RestCommand(new HashMap<String, String>());
	}
	
	public RestCommand(Map<String, String> params) {
		request = new RestRequest(params);
	}

}
