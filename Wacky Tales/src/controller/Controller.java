package controller;

import javax.swing.JOptionPane;

import listener.WrongAnswerListener;
import options.Option;
import options.Theme;
import story.AdventuresAbroad;
import story.AllADream;
import story.LifeIsACliche;
import story.Story;
import story.Survival;

public class Controller implements WrongAnswerListener {

	private int whichTheme;
	private Option theme;
	private Story story;
	private boolean needReset;
	private boolean haveStory;

	public Controller() {
		whichTheme = 0;
		theme = new Theme();
		story = null;
		needReset = true;
		haveStory = false;
	}

	public void start() {
		JOptionPane.showMessageDialog(null, "Hello sir, let's create a wacky tale!", "Wacky Tale",
				JOptionPane.INFORMATION_MESSAGE);
		whichTheme = JOptionPane.showOptionDialog(null, "Which theme you like for your tale?", "Wacky Tale",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, theme.getOptions(), null);

		while (needReset) {
			needReset = false;
			if (!haveStory) {
				switch (whichTheme) {
				case Theme.ALL_A_DREAM:
					story = new AllADream(this);
					break;
				case Theme.ADVENTURES_ABROAD:
					story = new AdventuresAbroad(this);
					break;
				case Theme.LIFE_IS_A_CLICHE:
					story = new LifeIsACliche(this);
					break;
				case Theme.SURVIVAL:
					story = new Survival(this);
					break;
				}
			}
			story.makeStory();
			if (!needReset) {
				JOptionPane.showMessageDialog(null, story.getFullStory(), "Your Tale!",
						JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Wacky tale ah? bye bye :D", "Messege", JOptionPane.PLAIN_MESSAGE);
			}

			else {
				if (JOptionPane.showConfirmDialog(null,
						"It seems you did not fill all the fields, would you like to try again?") != JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Bye bye!", "Massage", JOptionPane.PLAIN_MESSAGE);
					break;
				}
			}
		}
	}

	@Override
	public void needReset() {
		needReset = true;
	}

}
