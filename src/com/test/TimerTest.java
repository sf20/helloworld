package com.test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TimerTest {
	private static Logger logger = LogManager.getLogger(TimerTest.class);

	public static void main(String[] args) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					logger.info(new Date());
				}
			}
		}, new Date());
		t.cancel();
	}
}
