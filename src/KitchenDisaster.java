import org.newdawn.slick.*;


public class KitchenDisaster extends BasicGame
{

	Controller controller;
	Model model;
	View view;
	Input input;
	
  public KitchenDisaster()
  {
     super("Kitchen Disaster");
  }
 
  
  public void init(GameContainer gc) throws SlickException
  {
	  
	  model = new Model();
	  view = new View(model);
	  controller = new Controller(model);
	  input = gc.getInput();
	  input.addListener(controller);
 
  }
 
  
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  // controller gets new input and updates model
	  
	  controller.update(gc.getInput());
	  
 
	  	
  }
 
 
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
	  view.render(gc, g);
     g.drawString("Kitchen Disaster", 100, 100);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new KitchenDisaster());
     
     
 
     app.setDisplayMode(800, 600, false);
     app.start();
  }
  
  // WADDUp YALL
}