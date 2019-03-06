package story;

import listener.WrongAnswerListener;

public abstract class Story {
	
	protected final int NUM_Of_ANSWERS;
	protected String fullStory;
	protected String[] answers;
	protected WrongAnswerListener listener;
	
	public Story(int numOfAnswers,WrongAnswerListener lis)  {
		NUM_Of_ANSWERS = numOfAnswers;
		answers = new String[NUM_Of_ANSWERS];
		fullStory = null;
		listener = lis;
	}
	
	public abstract void makeStory();
	protected abstract void askAnswers();

	public String getFullStory() {
		return fullStory;
	}

	public int getNUM_Of_ANSWERS() {
		return NUM_Of_ANSWERS;
	}
	
	public String[] getAnswers() {
		return answers;
	}
}
