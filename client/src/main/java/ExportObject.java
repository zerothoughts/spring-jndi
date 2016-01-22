
public class ExportObject {
	public ExportObject() {
		try {
			while(true) {
				System.out.println("running injected code...");
				Thread.sleep(1000);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
