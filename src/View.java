import org.newdawn.slick.*;
import org.newdawn.slick.geom.ShapeRenderer;



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
				g.setColor(temp_box.rect_color);
				temp_box.render();
				g.setColor(temp_box.text_color);
				g.drawString(temp_box.str, temp_box.cur_x, temp_box.cur_y);
			}
			g.setColor(model.button_color);
			ShapeRenderer.fill(model.run_level_one);
			g.setColor(Color.black);
			g.drawString("RUN", model.run_level_one.getCenterX()-15, model.run_level_one.getCenterY() - 5);
			model.stack_level_one.render(g);
			
			if (model.cur_prog == Model.Progress.ERROR){
				g.setColor(Color.red);
				g.drawString(model.cur_error, 100, 100);
			} else if (model.cur_prog == Model.Progress.SUCCESS) {
				g.setColor(Color.green);
				g.drawString(model.cur_error, 100, 150);
			}
		}
		
		// draw stack
		
		
	}

}
