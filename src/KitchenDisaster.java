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
	  
	  model = new Model(gc);
	  view = new View(model);
	  controller = new Controller(model);
	  input = gc.getInput();

	 // System.out.println("added listener");
//	  controller.inputStarted();
//	  controller.setInput(input);
//	  System.out.println(controller.isAcceptingInput());
//	  controller.inputEnded();
 
  }
 
  
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  // controller gets new input and updates model
	  input = gc.getInput();


	  //input.addMouseListener(controller);
	  //controller.update(input);
	  
 
	  	
  }
 
 
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
	 g.setColor(Color.white);
	 view.render(gc, g);
	 g.setColor(Color.white);
     //g.drawString("Kitchen Disaster", 100, 75);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new KitchenDisaster());
     
     
 
     app.setDisplayMode(1200, 1200, false);
     app.start();
  }
  
    @Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		controller.mouseClicked(arg0, arg1, arg2, arg3);
		
		
	}

    @Override
	public void mouseDragged(int arg0, int arg1, int new_x, int new_y) {
		// TODO Auto-generated method stub
		
    	controller.mouseDragged(arg0, arg1, new_x, new_y);
		
	}

    @Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
		controller.mouseMoved(arg0, arg1, arg2, arg3);
		
	}

    @Override
	public void mousePressed(int arg0, int x, int y) {
		// TODO Auto-generated method stub
    	
    	controller.mousePressed(arg0, x, y);
		

		
	}

    @Override	
	public void mouseReleased(int arg0, int x, int y) {
		// TODO Auto-generated method stub
		controller.mouseReleased(arg0, x, y);


		
	}
  
  // WADDUp YALL
}
