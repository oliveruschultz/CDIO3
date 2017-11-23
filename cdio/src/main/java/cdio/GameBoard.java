package cdio;

import cdio.Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;
import cdio.Game;

public class GameBoard {
	
	public Field[] fields;
	
	public GameBoard(Field[] fields) {
		this.fields = fields;
	}

	public Field[] getFields() {
		return fields;
	}

	public void setFields(Field[] fields) {
		this.fields = fields;
	}
	
	public void resolveField(Field f, GUI gui, GUI_Street street, Player pl, GUI_Player Gpl) {
		f.landOnField(gui, street, pl, Gpl);
	}
	
	public static Field[] generateGameFields() {
		String[] fieldText = Translater.file("Fields.txt");
		Field[] fields = new Field[24];
		fields[0] = new SpecialField(null,0);
		fields[1] = new RideField(null, 1, null);
		fields[2] = new RideField(null, 1, null);
		fields[3] = new SpecialField(null, 2); //�ndres til Train senere
		fields[4] = new RideField(null, 1, null);
		fields[5] = new RideField(null, 1, null);
		fields[6] = new SpecialField(null, 0);
		fields[7] = new RideField(null, 2, null);
		fields[8] = new RideField(null, 2, null);
		fields[9] = new SpecialField(null, 2);
		fields[10] = new RideField(null, 2, null);
		fields[11] = new RideField(null, 2, null);
		fields[12] = new SpecialField(null, 0);
		fields[13] = new RideField(null, 3, null);
		fields[14] = new RideField(null, 3, null);
		fields[15] = new SpecialField(null, 0); //�ndres til Train
		fields[16] = new RideField(null, 3, null);
		fields[17] = new RideField(null, 3, null);
		fields[18] = new SpecialField(null, 0); //�ndres til GotoPrison
		fields[19] = new RideField(null, 4, null);
		fields[20] = new RideField(null, 4, null);
		fields[21] = new SpecialField(null, 2);
		fields[22] = new RideField(null, 5, null);
		fields[23] = new RideField(null, 5, null);
		
		for(int i = 0; i < fields.length; i++)
			fields[i].setNameOfField(fieldText[i]);
		return fields;
	}
	
}
