package inheritance2;

public class DataBaseLogger extends Logger {
	@Override // fonksiyonu de�i�tirme
	public void log() {
		System.out.println("Database logland�.");
	}
}
