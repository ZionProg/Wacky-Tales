package options;

public class Theme extends Option {

	// theme int order---------------------------------------------------
	public static final int ALL_A_DREAM = 0;
	public static final int ADVENTURES_ABROAD = 1;
	public static final int LIFE_IS_A_CLICHE = 2;
	public static final int SURVIVAL = 3;
	// --------------------------------------------------------------------------

	public Theme() {
		super(4);
		fillArray();
	}

	private void fillArray() {
		options[0] = "All A Dream";
		options[1] = "Adventures Abroad";
		options[2] = "Life Is A Cliché";
		options[3] = "Survival";
	}
}
