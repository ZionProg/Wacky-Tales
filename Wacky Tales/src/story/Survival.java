package story;

import javax.swing.JOptionPane;

import listener.WrongAnswerListener;

public class Survival extends Story {

	public Survival(WrongAnswerListener listener) {
		super(19,listener);
	}

	@Override
	public void makeStory() {
		askAnswers();
		
		fullStory = "The " + answers[0] + " Lucky Lulu was sinking quickly. “Abandon ship! Everyone into the " + answers[1]
				+ "!” hollered Captain " + answers[2] + ". " + "But the crew and passengers knew there were not enough "
				+ answers[1] + ", so they threw " + answers[3] + ", " + answers[4] + ", and even one " + answers[5]
				+ " " + answers[6] + " overboard. " + "Then everyone " + answers[7] + " into the " + answers[8]
				+ " water and grabbed onto whatever they could.\r\n" + "\r\n" + "Captain " + answers[2]
				+ " ordered everyone to form a line, tie their crafts together, and sing “" + answers[9] + ".” "
				+ "First in line were " + answers[10] + " and " + answers[11] + ", bobbing in their " + answers[12]
				+ " " + answers[13] + ". " + "Next, came " + answers[14] + " hanging on for dear life to a slimy "
				+ answers[15] + ". " + "They were followed by " + answers[16] + " others.\r\n" + "\r\n" + "After "
				+ answers[17] + " days, they were rescued by a strange " + answers[18] + ". "
				+ "Not one passenger from the Lucky Lulu has taken a boat ride again.";
	}

	@Override
	protected void askAnswers() {
		answers[0] = JOptionPane.showInputDialog(null, "Enter a watercraft: ");
		answers[1] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[2] = JOptionPane.showInputDialog(null, "Enter your last name: ");
		answers[3] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[4] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[5] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[6] = JOptionPane.showInputDialog(null, "Enter a a singular noun: ");
		answers[7] = JOptionPane.showInputDialog(null, "Enter a past tense verb ");
		answers[8] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[9] = JOptionPane.showInputDialog(null, "Enter a favorite song: ");
		answers[10] = JOptionPane.showInputDialog(null, "Enter a female friend: ");
		answers[11] = JOptionPane.showInputDialog(null, "Enter a male friend: ");
		answers[12] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[13] = JOptionPane.showInputDialog(null, "Enter a singular noun: ");
		answers[14] = JOptionPane.showInputDialog(null, "Enter a famous person: ");
		answers[15] = JOptionPane.showInputDialog(null, "Enter a noun: ");
		answers[16] = JOptionPane.showInputDialog(null, "Enter a large number: ");
		answers[17] = JOptionPane.showInputDialog(null, "Enter a number: ");
		answers[18] = JOptionPane.showInputDialog(null, "Enter a singular noun: ");
		
		for (int i = 0; i < answers.length; ++i) {
			if(answers[i] == null)
				listener.needReset();
		}
	}
}
