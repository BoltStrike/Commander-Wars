package rendering;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glBindTexture;

import mainframe.GameException;

public class GameTextures {
	
	final Texture redunit = new Texture("redunit2.png");
	final Texture blueunit = new Texture("blueunit.png");
	final Texture unitglow = new Texture("unitglow.png");
	
	public void loadTexture(int id){
		switch (id) {
		case -1:
			glBindTexture(GL_TEXTURE_2D, 0);
		case 0:
			unitglow.bind();
			break;
		case 1:
			redunit.bind();
			break;
		case 2:
			blueunit.bind();
			break;
		default:
			try {
				throw new GameException("Requested Texture ID does not exist");
			} catch (GameException e) {
				e.printStackTrace();
			}
		}
	}

}