package pl.arturkb.homeSec.server;

import static org.junit.Assert.*;
import org.junit.Test;
import pl.arturkb.homeSec.error.Error;
import pl.arturkb.homeSec.server.SocketServer;

public class SocketServerTest {

	/**
	 * Testing with empty args. array, without arguments
	 */
	@Test
	public void testCheckArgsWRONGUSAGE() {
		String[] fixture = new String[0];
		assertEquals(Error.WRONGUSAGE, (new SocketServer()).checkArgs(fixture));
	}
	
	/**
	 * Testing with args. array, with text instead of integer.
	 */
	@Test
	public void testCheckArgsMUSTBEINT() {
		String[] fixture = new String[1];
		fixture[0] = "Text not integer";
		assertEquals(Error.MUSTBEINT, (new SocketServer()).checkArgs(fixture));
	}
	
	/**
	 * Testing with args. array, with port number 9000
	 */
	@Test
	public void testCheckArgsSTATUSOK() {
		String[] fixture = new String[1];
		fixture[0] = "9000";
		assertEquals(Error.STATUSOK, (new SocketServer()).checkArgs(fixture));
	}

	
}
