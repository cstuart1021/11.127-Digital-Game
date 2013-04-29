import org.newdawn.slick.*;



public class View {
	
	Model model;
	
	public View(Model model) {
		
		this.model = model;
	}
	

	// get values from model and draw
	public void render(GameContainer gc, Graphics g) {
		
		// draw command boxes
		if (model.cur_screen == Model.Screen.LEVEL1) {
			for (int x = 0; x < model.level_one_boxes.size(); x++) {
				CommandBox temp_box = model.level_one_boxes.get(x);
				temp_box.render();
			}
		}
		
		// draw stack
		
	}

}
