package game;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	Image image = new ImageIcon("src\\image\\items\\player.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	Player(int x, int y){
		this.x = x;
		this.y = y;
	}
}
