import org.newdawn.slick.*;



public class View {
	
	Model model;
	
	public View(Model model) {
		
		this.model = model;
	}
	

	// get values from model and draw
	public void render(GameContainer gc, Graphics g) {
		
		//start screen
		if (model.cur_screen == Model.Screen.START){
			model.start_screen.render(g);
		}
		//draw command boxes
		else if (model.cur_screen == Model.Screen.LEVEL1) {
			g.setBackground(Color.black);
			for (int x = 0; x < model.level_one_boxes.size(); x++) {
				
				CommandBox temp_box = model.level_one_boxes.get(x);
				g.setColor(temp_box.rect_color);
				temp_box.render();
				g.setColor(temp_box.text_color);
				g.drawString(temp_box.str, temp_box.cur_x, temp_box.cur_y);
			}
			
			model.stack_level_one.render(g);
		}
		
		// draw stack
		
		
	}

}
