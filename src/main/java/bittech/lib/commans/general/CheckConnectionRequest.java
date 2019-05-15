package bittech.lib.commans.general;

import bittech.lib.protocol.Request;

public class CheckConnectionRequest implements Request {

	public String connectionName;

	public CheckConnectionRequest() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return connectionName;
	}

}
