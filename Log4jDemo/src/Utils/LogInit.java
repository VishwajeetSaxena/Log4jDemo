package Utils;

import org.apache.log4j.Logger;

public class LogInit {

	public Logger log;

	public Logger initLogs() {
		System.setProperty("htmlFilePath", "logs\\htmllogs.html");
		log = Logger.getLogger(this.getClass().getName());
		return log;
	}

}
