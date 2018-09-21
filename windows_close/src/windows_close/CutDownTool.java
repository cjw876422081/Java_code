package windows_close;

import java.io.IOException;
import java.util.TimerTask;

public class CutDownTool extends TimerTask{
	public void run() {
		try {
			Runtime.getRuntime().exec("shutdown -s");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
