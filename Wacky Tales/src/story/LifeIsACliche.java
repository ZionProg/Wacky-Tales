package story;

import javax.swing.JOptionPane;

import listener.WrongAnswerListener;

public class LifeIsACliche extends Story {

	public LifeIsACliche(WrongAnswerListener lis) {
		super(14, lis);
	}

	@Override
	public void makeStory() {
		askAnswers();
		fullStory = "0: Were you surprised when the " + answers[1] + " lost?\r\n" + "" + answers[2]
				+ ": Surprised? You could have knocked me over with a(n) " + answers[3] + ".\r\n" + "\r\n" + ""
				+ answers[0] + ": I think the weather had a lot to do with it.\r\n" + "" + answers[2]
				+ ": Yes, the field was in terrible shape. It had been raining " + answers[4] + " and " + answers[5]
				+ " up until the time the game started.\r\n" + "\r\n" + "" + answers[0]
				+ ": What do you think of the catcher? \r\n" + "" + answers[2]
				+ ": He's a problem. He's out of shape. The coach should take the " + answers[6] + " by the "
				+ answers[7] + " and fire him!\r\n" + "\r\n" + "0: We don't see " + answers[8] + " to " + answers[8]
				+ " on this at all. I think the catcher is in great shape. He's as fit as a(n) " + answers[9] + ".\r\n"
				+ "" + answers[2] + ": How can you say that? He got on the team by the skin of his " + answers[10]
				+ ".\r\n" + "\r\n" + "" + answers[0]
				+ ": You may be right. But you and I know how it is. That's just the way the " + answers[11]
				+ " bounces.\r\n" + "\r\n" + "" + answers[2] + ": Well, time certainly does " + answers[12]
				+ ". I've got to be getting home now.\r\n" + "\r\n" + "" + answers[0]
				+ ": See you tomorrow, I hope. It's always fun " + answers[13] + " the breeze with you.";

	}

	@Override
	protected void askAnswers() {
		answers[0] = JOptionPane.showInputDialog(null, "Enter a friend: ");
		answers[1] = JOptionPane.showInputDialog(null, "Enter a baseball team: ");
		answers[2] = JOptionPane.showInputDialog(null, "Enter a friend: ");
		answers[3] = JOptionPane.showInputDialog(null, "Enter a singular noun: ");
		answers[4] = JOptionPane.showInputDialog(null, "Enter an animal (plural): ");
		answers[5] = JOptionPane.showInputDialog(null, "Enter an animal (plural): ");
		answers[6] = JOptionPane.showInputDialog(null, "Enter an animal (singular): ");
		answers[7] = JOptionPane.showInputDialog(null, "Enter a body part (plural): ");
		answers[8] = JOptionPane.showInputDialog(null, "Enter a body part (singular): ");
		answers[9] = JOptionPane.showInputDialog(null, "Enter a musical instrument (singular): ");
		answers[10] = JOptionPane.showInputDialog(null, "Enter a body part (plural): ");
		answers[11] = JOptionPane.showInputDialog(null, "Enter a food (singular): ");
		answers[12] = JOptionPane.showInputDialog(null, "Enter a present tense verb: ");
		answers[13] = JOptionPane.showInputDialog(null, "Enter a verb ending with -ing: ");

		for (int i = 0; i < answers.length; ++i) {
			if (answers[i] == null)
				listener.needReset();
		}
	}

}
