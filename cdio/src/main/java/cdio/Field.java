package cdio;

import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class Field {
	String nameOfField;
	int fieldNumber;

	public Field(String nameOfField, int fieldNumber) {
		this.nameOfField = nameOfField;
		this.fieldNumber = fieldNumber;

	}

	public String getNameOfField() {
		return nameOfField;
	}

	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}

	public void landOnField (GUI gui, GUI_Street street, Player pl, GUI_Player Gpl) {
		System.out.println("No action has been specified for this field");
	}
	

	public int getFieldNumber() {
		return fieldNumber;
	}

	public void setFieldNumber(int fieldNumber) {
		this.fieldNumber = fieldNumber;
	}

	public Player getOwner() {
		return null;
	}


}