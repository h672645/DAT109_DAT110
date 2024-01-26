package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	// the up to 127 bytes of data (payload) that a message can hold
	private byte[] data;

	// construction a Message with the data provided
	public Message(byte[] data) {
		
		// TODO - START
		
		if (data==null||data.length<=128) {
			throw new UnsupportedOperationException(TODO.constructor("Message"));
		}
		this.data=data;
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
