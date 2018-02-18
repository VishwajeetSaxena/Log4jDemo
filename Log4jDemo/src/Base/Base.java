package Base;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utils.LogInit;

public class Base {

	public LogInit logs;
	public Logger log;

	@BeforeSuite
	public void initDriver() {
		logs = new LogInit();
		log = logs.initLogs();

		// Log Levels: ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
		log.trace("This is Trace log");
		log.debug("This is Debug log");
		log.info("This is Info log");
		log.error("This is Error Log");
		log.warn("This is Warn log");
		log.fatal("This is Fatal log");
	}
	
	@Test
	public void method1()
	{
		
	}

}
