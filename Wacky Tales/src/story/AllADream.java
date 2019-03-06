package story;

import javax.swing.JOptionPane;

import listener.WrongAnswerListener;

public class AllADream extends Story {
	public AllADream(WrongAnswerListener listener) {
		super(8,listener);
	}

	public void makeStory() {
		askAnswers();
		
		fullStory = "I fell asleep yesterday listening to an old album that my mom had."
				+ " I really enjoyed it, though I had a weird dream. " + "It was kind of like one of the old songs. ";

		fullStory += "\n";

		fullStory += "I've been workin' in " + answers[0] + "\n";
		fullStory += "All the " + answers[1] + " day.\n";
		fullStory += "I've been workin' in " + answers[0] + ",\n";
		fullStory += "Just to pass the time away. \r\n" + "Don't you hear the whistle " + answers[2] + "?\n";
		fullStory += "Rise up so early in the morn. \r\n" + "Don't you hear " + answers[3] + " shouting\n";
		fullStory += "“" + answers[4] + ", " + answers[5] + " your horn?”\n";
		fullStory += "\n";

		fullStory += answers[4] + ", won't you " + answers[5] + ",\n";
		fullStory += answers[4] + ", won't you " + answers[5] + ",\n";
		fullStory += answers[4] + ", won't you " + answers[5] + " your horn?\n";
		fullStory += answers[4] + ", won't you " + answers[5] + ",\n";
		fullStory += answers[4] + ", won't you " + answers[5] + ",\n";
		fullStory += answers[4] + ", won't you " + answers[5] + " your horn?\n";
		fullStory += "\n";

		fullStory += "Someone's in the " + answers[6] + " with " + answers[4] + ".\n";
		fullStory += "Someone's in the " + answers[6] + ", i know.\n";
		fullStory += "Someone's in the " + answers[6] + " with " + answers[4] + ".\n";
		fullStory += "Strumming on the old " + answers[7] + ".\n";
		fullStory += "\n";
		fullStory += "It was the weirdest dream I've had in a long time!";
	}
	
	@Override
	protected void askAnswers() {
		answers[0] = JOptionPane.showInputDialog(null, "Enter a place: ");
		answers[1] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[2] = JOptionPane.showInputDialog(null, "Enter a verb ending with -ing: ");
		answers[3] = JOptionPane.showInputDialog(null, "Name a famous person: ");
		answers[4] = JOptionPane.showInputDialog(null, "Name a friend: ");
		answers[5] = JOptionPane.showInputDialog(null, "Enter an present tense verb: ");
		answers[6] = JOptionPane.showInputDialog(null, "Enter a room: ");
		answers[7] = JOptionPane.showInputDialog(null, "Enter a musical instrument: ");
		
		for (int i = 0; i < answers.length; ++i) {
			if(answers[i] == null)
				listener.needReset();
		}
	}

}
