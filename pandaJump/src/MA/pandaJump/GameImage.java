package MA.pandaJump;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameImage extends GameRect
{
	
	private int number;
	
	public GameImage(String imgName)
	{
		this.number = NumberCreator.getCreator().createNumber();
		GameCore.createImage(this.number, imgName);
	}
	
	public GameImage()
	{
		this("");
	}

	@Override
	public void hide()
	{
		GameCore.hideImage(this.number);
	}

	@Override
	public void show()
	{
		GameCore.showImage(this.number);

	}

	@Override
	public Point getPosition()
	{
		return GameCore.getImagePosition(this.number);
	}

	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setImagePosition(this.number, x, y);
	}

	
	public void setImageSource(String imgName)
	{
		GameCore.setImageSource(this.number, imgName);
	}

	@Override
	public Dimension getSize()
	{
		return GameCore.getImageSize(this.number);
	}
	@Override
	public void remove(){
		GameCore.removeImage(this.number);
	}

	@Override
	public Point getPositionOnScreen() {
		// TODO Auto-generated method stub
		return GameCore.getImagePositionOnScreen(this.number);
	}
}
