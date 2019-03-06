package options;

public abstract class Option {
	protected final int SIZE;
	protected String[] options;
	
	public Option(int size) {
		SIZE = size;
		options = new String[SIZE];
	}

	public String[] getOptions() {
		return options;
	}	
}
