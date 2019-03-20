package bittech.lib.commans.general;

import bittech.lib.protocol.Command;

public class ValidateBtcAddrCommand extends Command<ValidateBtcAddrRequest, ValidateBtcAddrResponse> {

	public static ValidateBtcAddrCommand createStub () {
		return new ValidateBtcAddrCommand("");
	}
	
	public ValidateBtcAddrCommand(final String addr) {
		request = new ValidateBtcAddrRequest(addr);
	}

}
