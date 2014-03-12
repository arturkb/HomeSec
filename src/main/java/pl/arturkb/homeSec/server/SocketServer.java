package pl.arturkb.homeSec.server;

import java.net.*;
import java.io.*;
import pl.arturkb.homeSec.error.Error;


/**
 * 
 * @author artur.barczynski
 * 
 */
public class SocketServer {
	
	/**
	 * Default port number
	 */
	private final static int DEFPORTNUMBER = 9000;

	/**
	 * Server port number.
	 */
	private Integer portNumber;
	
	/**
	 * If true then server is listening, false oterwise.
	 */
	private boolean listening;
	
	
	/**
	 * Default constructor
	 */
	public SocketServer() {
		this.portNumber = DEFPORTNUMBER;
		this.listening = false;
	}

	/**
	 * Checks that arguments exists and is in the range between 9000 and 9010. If it is in a range then make portNumber the number.
	 * @param args
	 * @return 1 if port in range otherwise return 0;
	 */
	public Error checkArgs(String[] args) {		
		if (args.length != 1) {
			return Error.WRONGUSAGE;
		} else {
			try{
				portNumber = Integer.parseInt(args[0]);				
			} catch(NumberFormatException e ) {
				return Error.MUSTBEINT;
			}			
			return Error.STATUSOK;
		}

	}
	
	/**
	 * Initialize configuration for the serve
	 */
	private void Initialize(String[] args) {
		Error err;
		
		// we check arguments first
		err = checkArgs(args);
		if(err != Error.STATUSOK) {
			System.out.println("Server error code: " + err.getCode() + " ::: MSG ::: " + err.getDescription());
			System.exit(err.getCode());
		}else {
			System.out.println("Server starts on port number " + portNumber);
		}
		
	}
	
	public void run(String[] args) {
		
		//we run initialization
		Initialize(args);
		
		try (ServerSocket server = new ServerSocket(portNumber)){
			
		}
	}

}
