package db.record.monitoring.writer;

import java.io.FileWriter;
import java.io.IOException;

public class NotiFileWriter {
	private static final NotiFileWriter instance = new NotiFileWriter();

	private NotiFileWriter() {
	}

	public static NotiFileWriter instance() {
		return instance;
	}

	public void write(String filePath, String text) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(filePath, true);
			fw.write(text);
			fw.flush();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
