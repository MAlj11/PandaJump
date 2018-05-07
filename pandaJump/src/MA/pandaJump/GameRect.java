package MA.pandaJump;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.rupeng.game.GameCore;

/**
 * ����һ���д�С����Ϸ����
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
				int leftX = thisPosOnScreen.x;//���Ե��x����
				int rightX = thisPosOnScreen.x+getSize().width;//�ұ�Ե��y����
				
				int topY = thisPosOnScreen.y;
				int bottomY = thisPosOnScreen.y+getSize().height;//�±�Ե��y����
				
				//�������ĵ��ھ��η�Χ֮�ڣ�����Ϊ�������
				if(mouseScrnX>=leftX&&mouseScrnX<=rightX
						&&mouseScrnY>=topY&&mouseScrnY<=bottomY)				{
					
					l.run();//�������ʱ��ִ��l�е�run���������߼����ߡ��ұ�����ˡ�
				}
			}
		});
	}

	/**
	 * ��������Ļ�ϵ�����
	 * 
	 * @return
	 */
	public abstract Point getPositionOnScreen();

	/**
	 * �ж��Ƿ��Ѿ��������
	 * 
	 * @return
	 */
	public boolean isReachLeftSide()
	{
		return getPosition().x <= 0;
	}

	/**
	 * �ж��Ƿ��Ѿ��ﵽ�Ҳ�
	 * 
	 * @return
	 */
	public boolean isReachRightSide()
	{
		Dimension gameSize = GameCore.getGameSize();
		return getPosition().x > (gameSize.width - getSize().width);
	}

	/**
	 * �ж��Ƿ��Ѿ����ﶥ��
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
	 * �Ƿ��Ѿ�ȫ����û�ڵױ�Ե����
	 * @return
	 */
	public boolean isOutOfBottomSide()
	{
		Dimension gameSize = GameCore.getGameSize();
		return getPosition().y>=gameSize.height;
	}

	
	/**
	 * ��ö���Ĵ�Ц
	 * 
	 * @return
	 */
	public abstract Dimension getSize();

	/**
	 * �жϵ�ǰ����this�Ƿ����һ������rect2�ཻ
	 * 
	 * @param rect2
	 * @return
	 */
	public boolean isIntersectWith(GameRect rect2)
	{
		// this guizi ��rect2 mario

		// �Ƿ����ཻ��this�����Ե��x����>rect2���ұ�Ե��x����
		boolean isNotLeftIntersect = this.getPosition().x > rect2.getPosition().x
				+ rect2.getSize().width;

		// �Ƿ��Ҳ��ཻ��this���ұ�Ե��x����<rect2�����Ե��x����
		boolean isNotRightIntersect = this.getPosition().x
				+ this.getSize().width < rect2.getPosition().x;

		// �Ƿ��ϲ��ཻ��this���ϱ�Ե��y����>rect2���±�Ե��y����
		boolean isNotUpIntersect = this.getPosition().y > rect2.getPosition().y
				+ rect2.getSize().height;

		// �Ƿ��²��ཻ��this�ĵ��±�Ե��y����<rect2���ϱ�Ե��y����
		boolean isNotDownIntersect = this.getPosition().y + getSize().height < rect2
				.getPosition().y;

		// ������漸�����ȫ����false����ô�����ཻ��
		return !isNotLeftIntersect && !isNotRightIntersect && !isNotUpIntersect
				&& !isNotDownIntersect;
	}

	/**
	 * �жϵ�ǰ�����Ƿ���ײ����Ϸ����ı�Ե
	 * 
	 * @return
	 */

	/*
	 * public boolean isHitGameWindow() { if(this.getPosition().x<=0)//���Ե {
	 * return true; } //�ұ�Ե
	 * if(this.getPosition().x+this.getSize().width>=GameCore
	 * .getGameSize().width) { return true; } if(this.getPosition().y<=0)//�ϱ�Ե {
	 * return true; }
	 * if(this.getPosition().y+this.getSize().height>GameCore.getGameSize
	 * ().height) { return true; } return false; }
	 */
}
