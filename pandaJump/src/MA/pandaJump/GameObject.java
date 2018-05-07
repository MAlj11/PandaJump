package MA.pandaJump;

import java.awt.Point;

public abstract class GameObject {

	public abstract void hide();
	public abstract void show();
	public abstract Point getPosition();
	public abstract void setPosition(int x,int y);
	public abstract void remove();
	
	public void moveRight(int stepCount)
	{
		
		Point pos = this.getPosition();//this.getPosition()
		int x = pos.x;
		x+=stepCount;
		this.setPosition(x, pos.y);//this.setPosition
	}
	
	public void moveRight()
	{
		
		moveRight(1);
	}
	
	public void moveLeft(int stepCount)
	{
		
		Point pos = this.getPosition();//this.getPosition()
		int x = pos.x;
		x-=stepCount;
		this.setPosition(x, pos.y);//this.setPosition
	}
	
	public void moveLeft()
	{
		moveLeft(1);
	}
	
	
	public void moveUp()
	{
		
		Point pos = this.getPosition();//this.getPosition()
		int y = pos.y;
		y--;
		this.setPosition(pos.x,y);//this.setPosition
	}
	
	public void moveDown()
	{
		
		Point pos = this.getPosition();//this.getPosition()
		int y = pos.y;
		y++;
		this.setPosition(pos.x,y);//this.setPosition
	}
	
	
}
