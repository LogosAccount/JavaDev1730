package lesson10;



public enum Gender{

	MALE(0, "male") {
		@Override
		public void nailLength() {
			System.out.println("1 cm");
		}
	}, 
	
	FEMALE(1, "female") {
		@Override
		public void nailLength() {
			System.out.println("From 1 to infinity");
		}
	};
	
	//public static final Gender MALE = new GENDER();
	//public static final Gender FEMALE = new GENDER();

	private int index;
	private String stringValue;
	
	private Gender(int index, String stringValue) {
		this.index = index;
		this.stringValue = stringValue;
	}
	
	public abstract void nailLength();
}
