package model;

public class Option {

	protected String text;
	protected boolean correct;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public Option(String text, boolean correct) {

		this.text = text;
		this.correct = correct;
	}

	public Option(Option otherOption) {

		this.text = otherOption.text;
		this.correct = otherOption.correct;
	}

	public String toString(){
		if (correct)
		{
			return "[T]"+"\t"+text;
		}
		else
		{
			return "[F]"+"\t"+text;
		}
	}
}
