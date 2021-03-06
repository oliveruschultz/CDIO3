package cdio;

import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class PrisonField extends Field {

	int fee = 1;
	String[] guiMessages = Translater.file("Gamefunctions.txt");

	public PrisonField(String nameOfField, int fieldNumber, int fee) {
		super(nameOfField, fieldNumber);
		this.fee=fee;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
		
	}


	public void landOnField(GUI gui, GUI_Street street, Player pl, GUI_Player Gpl) {
		gui.showMessage(pl.getName() + guiMessages[17] + getFee());
		pl.getAccount().withdraw(getFee());
		gui.getFields()[pl.getPosition()].setCar(Gpl, false);
		pl.setPosition(6);
		gui.getFields()[pl.getPosition()].setCar(Gpl, true);		
	}	
}
