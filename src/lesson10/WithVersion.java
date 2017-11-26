package lesson10;

public class WithVersion<T> {

	private T value;
	private int version;
	
	public WithVersion(T value, int version) {
		this.value = value;
		this.version = version;
	}
	
	
}
