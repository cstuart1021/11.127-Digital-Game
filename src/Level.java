import java.util.ArrayList;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.*;
import java.awt.Font;
import org.newdawn.slick.font.*;

abstract class Level {
	

	public Level prev_level;
	public Level next_level;
	public  ArrayList<CommandBox> boxes;
	public ArrayList<TextField> tf_list;
	public Stack stack;
	abstract void run();
	abstract void render();
	abstract ArrayList<CommandBox> getBoxes();
	abstract Stack getStack();
	abstract ArrayList<TextField> getTF();
	abstract void setPrevLevel(Level level);
	abstract Level getPrevLevel();
	abstract void setNextLevel(Level level);
	abstract Level getNextLevel();
	
	
	

}
