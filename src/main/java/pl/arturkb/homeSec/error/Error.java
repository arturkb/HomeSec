/**
 * 
 */
package pl.arturkb.homeSec.error;

/**
 * 
 * @author artur.barczynski
 * 
 */
public enum Error {
	WRONGUSAGE(1, "Usage: java SocketServer <port number>"),
	STATUSOK(1, "Status OK"),
	MUSTBEINT(2, "Port parameter must be an integer");

	private final int code;
	private final String description;

	private Error(int code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * Getter method for code
	 */
	public int getCode() {
		return this.code;
	}

	/**
	 * Getter method for description
	 * 
	 * @return
	 */
	public String getDescription() {
		return this.description;
	}

}