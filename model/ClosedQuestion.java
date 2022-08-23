package model;

import java.util.ArrayList;

public class ClosedQuestion extends Question {

	protected boolean singleOption;
	protected ArrayList<Option> allOptions;

	public ClosedQuestion(int id, String title, boolean mandatory, boolean singleOption) {
		super(id, title, mandatory);
		this.singleOption = singleOption;

		allOptions = new ArrayList<Option>();
	}

	public ClosedQuestion(ClosedQuestion otherClosedQuestion) {

		super(otherClosedQuestion);
		singleOption = otherClosedQuestion.singleOption;

         allOptions = new ArrayList<Option>();

		for (Option o : otherClosedQuestion.allOptions) {
			allOptions.add(new Option(o));
		}
	}

	public boolean isSingleOption() {
		return singleOption;
	}

	public void setSingleOption(boolean singleOption) {
		if (singleOption && !this.singleOption) {
			int i = 0;
			boolean first = true;

			while (i < allOptions.size() && first) {
				if (allOptions.get(i).isCorrect()) {
					first = false;
				}
				i++;
			}

			while (i < allOptions.size()) {
				if (allOptions.get(i).isCorrect()) {
					allOptions.get(i).setCorrect(false);
				}
				i++;
			}
		}
		this.singleOption = singleOption;

	}

	public void addOption(String option, boolean correct) {
		allOptions.add(new Option(option, correct));
	}

	public boolean checkReply(ArrayList<String> answer) {
		for (int i = 0; i < answer.size(); i++) {
		
			boolean optionExists = false;
			String option = answer.get(i);
			for (Option o : allOptions) {
			
				if (o.getText().equals(option)) {
					optionExists = true;
					if (!o.isCorrect()) {
						return false;
					}
				}
			}
			if (!optionExists) {
				return false;
			}
		}
		return true;
	}

	public String toString() {
		String temp;
		if (singleOption)
		{
			temp = super.toString()+" single option";
		}
		else
		{
			temp = super.toString()+ "several options";
		}
		for (Option o:allOptions)
		{
			temp = temp + "\n"+o.toString();
		}
		return temp;
	}
}
