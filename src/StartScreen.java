import java.awt.Font;
import java.util.ArrayList;

import org.newdawn.slick.font.*;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.gui.TextField;


public class StartScreen extends Level {
	
	Font awesome1;
	TrueTypeFont awesome;
	
	public StartScreen() {
		awesome1 = new Font("SansSerif", Font.BOLD, 50);
		awesome = new TrueTypeFont(awesome1, false);
		
	}
	
	public void run() {
		
		
	}

	public void render(Graphics g) {
		g.setFont(awesome);
		g.setBackground(Color.orange);
		g.setColor(Color.black);
		g.drawString("Kitchen Disaster!", 200, 200);
		g.setColor(Color.white);
		
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	ArrayList<CommandBox> getBoxes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Stack getStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	ArrayList<TextField> getTF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setPrevLevel(Level level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Level getPrevLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	void setNextLevel(Level level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	Level getNextLevel() {
		// TODO Auto-generated method stub
		return null;
	}
}
