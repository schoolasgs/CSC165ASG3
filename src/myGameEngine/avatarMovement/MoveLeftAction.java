package myGameEngine.avatarMovement;

import Network.GameClient;
import a3.MyGame;
import net.java.games.input.Event;
import ray.input.action.AbstractInputAction;
import ray.rage.scene.Node;

public class MoveLeftAction extends AbstractInputAction {
	private Node avN;
	private GameClient gameClient;
	private MyGame myGame;
	
	public MoveLeftAction(Node n, GameClient gc, MyGame g) {  
		avN = n;
		gameClient = gc;
		myGame = g;
	}
	
	public void performAction(float time, Event e) { 
		
		avN.moveLeft(0.1f);
		gameClient.sendMoveMessages(avN.getWorldPosition());
		myGame.updateVerticalPosition();
	}
}
