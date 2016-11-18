package com.pollhq.mymavenproject;

public class PollComponent extends PollDesign{
	public PollComponent(String question, String like){
		questionLabel.setValue(question);
		likeLabel.setValue(like);
	}
}
