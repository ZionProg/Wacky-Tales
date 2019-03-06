package story;

import javax.swing.JOptionPane;

import listener.WrongAnswerListener;

public class AdventuresAbroad extends Story {

	public AdventuresAbroad(WrongAnswerListener listener) {
		super(16,listener);
	}

	@Override
	public void makeStory() {
		askAnswers();
		
		fullStory = "One of the most interesting places in the world to visit is " + answers[0] + ". "
				+ "This place has everything! There are " + answers[1] + " mountains for " + answers[2]
				+ ", and lakes that are perfect for " + answers[3] + ".\r\n" + "\r\n" + "Just " + answers[4]
				+ " years ago, " + answers[5] + " were discovered in " + answers[0] + ". "
				+ "Since then, people have been traveling from all over the world to see them. "
				+ "And no trip to "+answers[0]+" would be complete without a daytrip to see the great "+answers[6]+" in the country's largest forest.\r\n"
				+ "\r\n" + "The best time to travel to "+answers[0]+" is "+answers[7]+". "
				+ "At this time of the year, many people have seen "+answers[8]+" and "+answers[9]+" in the countryside. "
				+ "The weather is usually "+answers[10]+", so it is the perfect time to "+answers[11]+". Just remember to pack "+answers[12]+". "
				+ "You wouldn't want to be high in the mountains without them!\r\n" + "\r\n"
				+ "The people of "+answers[0]+" are very "+answers[13]+" and enjoy showing tourists their local "+answers[14]+". "
				+ "Remember to bring your "+answers[12]+", and you'll have a great time in "+answers[0]+". "
				+ "You might even bring the local tradition of "+answers[15]+" back home with you!";
	}

	@Override
	protected void askAnswers() {
		answers[0] = JOptionPane.showInputDialog(null, "Enter a country: ");
		answers[1] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[2] = JOptionPane.showInputDialog(null, "Enter a verb ending with -ing: ");
		answers[3] = JOptionPane.showInputDialog(null, "Enter a verb ending with -ing: ");
		answers[4] = JOptionPane.showInputDialog(null, "Enter a number: ");
		answers[5] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[6] = JOptionPane.showInputDialog(null, "Enter a singular noun: ");
		answers[7] = JOptionPane.showInputDialog(null, "Enter a season: ");
		answers[8] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[9] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[10] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[11] = JOptionPane.showInputDialog(null, "Enter a present tense verb: ");
		answers[12] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[13] = JOptionPane.showInputDialog(null, "Enter an adjective: ");
		answers[14] = JOptionPane.showInputDialog(null, "Enter a plural noun: ");
		answers[15] = JOptionPane.showInputDialog(null, "Enter a verb ending with -ing: ");
		
		for (int i = 0; i < answers.length; ++i) {
			if(answers[i] == null)
				listener.needReset();
		}
	}
	
	

}
