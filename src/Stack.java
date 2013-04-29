import java.util.*;
import org.newdawn.slick.*;

public class Stack {
	
	int x;
	int y;
	int width;
	int height;
	
	int num_boxes;
	CommandBox box1;
	int box1_x;
	int box1_y;
	CommandBox box2;
	CommandBox box3;
	ArrayList<CommandBox> box_stack = new ArrayList<CommandBox>();
	
	public Stack(int x, int y, int num_boxes){
		this.x = x;
		this.y = y;
		width = CommandBox.width;
		height = 400;
		this.num_boxes = num_boxes;
		
		
		
	}

	
	public void render(Graphics g) {
		g.setColor(Color.white);
		for (int i = 0; i < num_boxes; i ++) {
			g.drawRect(x, y+i*CommandBox.height, CommandBox.width, CommandBox.height);
		}
		
	}
	                    
}
