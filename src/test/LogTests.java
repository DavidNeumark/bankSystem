package test;

import core.Log;
import core.Logger;

public class LogTests {
	public static void main(String[] args) {
		Log log = new Log(1, "log description test 1", 200);

		Logger logger = new Logger(null);
		logger.log(log);
	}

}
