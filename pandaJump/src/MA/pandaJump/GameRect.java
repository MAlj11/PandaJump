package MA.pandaJump;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.rupeng.game.GameCore;

/**
 * 这是一个有大小的游戏对象
 * 
 * @author yzk
 * 
 */
public abstract class GameRect extends GameObject
{
	
	
	public void addMouseListener(final Runnable l)
	{
		GameCore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				int mouseScrnX = e.getXOnScreen();
				int mouseScrnY = e.getYOnScreen();
				Point thisPosOnScreen = getPositionOnScreen();
				int leftX = thisPosOnScreen.x;//左边缘的x坐标
				int rightX = thisPosOnScreen.x+getSize().width;//右边缘的y坐标
				
				int topY = thisPosOnScreen.y;
				int bottomY = thisPosOnScreen.y+getSize().height;//下边缘的y坐标
				
				//如果点击的点在矩形范围之内，则认为被点击了
				if(mouseScrnX>=leftX&&mouseScrnX<=rightX
						&&mouseScrnY>=topY&&mouseScrnY<=bottomY)				{
					
					l.run();//被点击的时候执行l中的run方法，告诉监听者“我被点击了”
				}
			}
		});
	}

	/**
	 * 返回在屏幕上的坐标
	 * 
	 * @return
	 */
	public abstract Point getPositionOnScreen();

	/**
	 * 判断是否已经到达左侧
	 * 
	 * @return
	 */
	public boolean isReachLeftSide()
	{
		return getPosition().x <= 0;
	}

	/**
	 * 判断是否已经达到右侧
	 * 
	 * @return
	 */
	public boolean isReachRightSide()
	{
		Dimension gameSize = GameCore.getGameSize();
		return getPosition().x > (gameSize.width - getSize().width);
	}

	/**
	 * 判断是否已经到达顶部
	 * 
	 * @return
	 */
	public boolean isReachTopSide()
	{
		return getPosition().y <= 0;
	}
	 public boolean isReachDownSide(){
		 Dimension gameSize = GameCore.getGameSize();
		 return getPosition().y <= gameSize.height;
	 }
	/**
	 * 是否已经全部淹没在底边缘以下
	 * @return
	 */
	public boolean isOutOfBottomSide()
	{
		Dimension gameSize = GameCore.getGameSize();
		return getPosition().y>=gameSize.height;
	}

	
	/**
	 * 获得对象的大笑
	 * 
	 * @return
	 */
	public abstract Dimension getSize();

	/**
	 * 判断当前对象this是否和另一个对象rect2相交
	 * 
	 * @param rect2
	 * @return
	 */
	public boolean isIntersectWith(GameRect rect2)
	{
		// this guizi 。rect2 mario

		// 是否左不相交：this的左边缘的x坐标>rect2的右边缘的x坐标
		boolean isNotLeftIntersect = this.getPosition().x > rect2.getPosition().x
				+ rect2.getSize().width;

		// 是否右不相交：this的右边缘的x坐标<rect2的左边缘的x坐标
		boolean isNotRightIntersect = this.getPosition().x
				+ this.getSize().width < rect2.getPosition().x;

		// 是否上不相交：this的上边缘的y坐标>rect2的下边缘的y坐标
		boolean isNotUpIntersect = this.getPosition().y > rect2.getPosition().y
				+ rect2.getSize().height;

		// 是否下不相交：this的的下边缘的y坐标<rect2的上边缘的y坐标
		boolean isNotDownIntersect = this.getPosition().y + getSize().height < rect2
				.getPosition().y;

		// 如果上面几种情况全都是false，那么就是相交了
		return !isNotLeftIntersect && !isNotRightIntersect && !isNotUpIntersect
				&& !isNotDownIntersect;
	}

	/**
	 * 判断当前对象是否碰撞了游戏界面的边缘
	 * 
	 * @return
	 */

	/*
	 * public boolean isHitGameWindow() { if(this.getPosition().x<=0)//左边缘 {
	 * return true; } //右边缘
	 * if(this.getPosition().x+this.getSize().width>=GameCore
	 * .getGameSize().width) { return true; } if(this.getPosition().y<=0)//上边缘 {
	 * return true; }
	 * if(this.getPosition().y+this.getSize().height>GameCore.getGameSize
	 * ().height) { return true; } return false; }
	 */
}
