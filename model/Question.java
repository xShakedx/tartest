package model;

public class Question {
	protected int id;
	protected String title;
	protected boolean mandatory;

	public Question(int id, String title, boolean mandatory) {

		if (id > 0) {
			this.id = id;
		} else {

			this.id = 1;
		}

		this.title = title;
		this.mandatory = mandatory;
	}

	public Question(Question otherQuestion) {

		this(otherQuestion.id, otherQuestion.title, otherQuestion.mandatory);

	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	final public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public void print() {
		System.out.println(" This is a question no is " + id + " , title = " + title + " , mandatory = " + mandatory);
	}

	public String toString()
	{
		if (mandatory)
			return  id + "." + title +" (mandatory)";
		else
			return  id + "." + title +" (not mandatory)";
	}
}