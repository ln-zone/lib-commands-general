package bittech.lib.commans.general;

import java.util.Map;

import bittech.lib.protocol.Request;

public class RestRequest implements Request {

	public final Map<String, String> params;

	public RestRequest(Map<String, String> params) {
		this.params = params;
	}

}
