package MA.pandaJump;

import java.awt.Color;
import java.awt.Point;

import com.rupeng.game.GameCore;

public class GameText extends GameObject {
	private int number;

	public GameText(String text)
	{
		this.number = NumberCreator.getCreator().createNumber();
		GameCore.createText(this.number, text);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		GameCore.hideText(this.number);

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
       GameCore.showText(this.number);
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return GameCore.getTextPosition(this.number);
	}

	@Override
	public void setPosition(int x, int y) {
	 GameCore.setTextPosition(this.number, x, y);

	}
	public void setTextFontSize(int size){
		GameCore.setTextFontSize(this.number, size);
	}
    public void setTextColor(Color color){
    	GameCore.setTextColor(this.number, color);
    }
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		GameCore.removeText(this.number);

	}

}
