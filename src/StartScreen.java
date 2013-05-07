import java.awt.Font;
import org.newdawn.slick.font.*;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;


public class StartScreen {
	
	Font awesome1;
	TrueTypeFont awesome;
	
	public StartScreen() {
		awesome1 = new Font("SansSerif", Font.BOLD, 50);
		awesome = new TrueTypeFont(awesome1, false);
		
	}

	public void render(Graphics g) {
		g.setFont(awesome);
		g.setBackground(Color.orange);
		g.setColor(Color.black);
		g.drawString("Kitchen Disaster!", 200, 200);
		g.setColor(Color.white);
		
	}
}
