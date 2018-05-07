package MA.pandaJump;

import java.awt.Dimension;
import java.awt.Point;

import com.rupeng.game.GameCore;

public  class GameSprite extends GameRect
{

	private int number;

	public GameSprite(String spriteName)
	{
		this.number = NumberCreator.getCreator().createNumber();
		GameCore.createSprite(this.number, spriteName);
	}

	@Override
	public void hide()
	{
		GameCore.hideSprite(this.number);
	}

	@Override
	public void show()
	{
		GameCore.showSprite(this.number);
	}

	@Override
	public Point getPosition()
	{
		return GameCore.getSpritePosition(this.number);
	}

	@Override
	public void setPosition(int x, int y)
	{
		GameCore.setSpritePosition(this.number, x, y);
	}

	public void playAnimate(String animateName,boolean repeat)
	{
		GameCore.playSpriteAnimate(this.number, animateName, repeat);
	}
	
	public void playAnimate(String animateName)
	{
		this.playAnimate(animateName, true);
	}
	
	public void setFlipX(boolean flipX)
	{
		GameCore.setSpriteFlipX(this.number, flipX);
	}
	
	public void setFlipY(boolean flipY)
	{
		GameCore.setSpriteFlipY(this.number, flipY);
	}
	
	@Override
	public Dimension getSize()
	{
		return GameCore.getSpriteSize(this.number);
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
		GameCore.removeSprite(this.number);
		
	}

	@Override
	public Point getPositionOnScreen() {
		// TODO Auto-generated method stub
		return GameCore.getImagePositionOnScreen(this.number);
	}
 
	
	
	

	
}

