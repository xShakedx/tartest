package model;

import javax.swing.*;

final public class OpenQuestion extends Question
{

	protected boolean singleLine;

	public OpenQuestion(int id, String title, boolean mandatory, boolean singleLine) {
		super(id, title, mandatory);
		this.singleLine = singleLine;
	}

	public OpenQuestion(OpenQuestion otherOpenQuestion) {
		super(otherOpenQuestion);

		this.singleLine = otherOpenQuestion.singleLine;
	}

	public boolean isSingleLine() {
		return singleLine;
	}

	public void setSingleLine(boolean singleLine) {
		this.singleLine = singleLine;
	}

	@Override
	public void print() {
		// System.out.println(" This is a question no " + id + " , title = " + title + "
		// , mandatory = " + mandatory);

		super.print();
		System.out.println("is single line = " + singleLine);
	}

	public String toString()
	{
		if (singleLine)
			return super.toString()+" in single line";
			else
				return super.toString() +" in several lines";
		}
	}
