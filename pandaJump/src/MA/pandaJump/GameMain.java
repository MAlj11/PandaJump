package MA.pandaJump;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

import com.rupeng.game.GameCore;

public class GameMain implements Runnable {
	private GameSprite pandaRun;
    private GameSprite robot;
    private GameSprite robot1;
    private GameSprite robot2;
    private GameSprite robot3;
    private GameSprite robot4;
	@Override
	public void run() {
		//窗口大小，标题
		GameCore.setGameSize(900, 700);
		GameCore.setGameTitle("PandaJump");
		GameCore.loadBgView("sky.jpg");
		final GameImage title = new GameImage("pandajump.png");
		title.setPosition(185, 150);
		final GameImage startbuttom = new GameImage("start.png");
		startbuttom.setPosition(320, 400);
		GameText musictext = new GameText("音乐：");
		musictext.setTextFontSize(35);
		
		GameText jingpin = new GameText("MA出品  必属精品");
		jingpin.setTextFontSize(40);
		jingpin.setPosition(0, 50);
		jingpin.setTextColor(Color.red);
		GameCore.playSound("apple.mp3", true);
		final GameImage music = new GameImage("pause.png");
		music.setPosition(80, 0);
		music.show();
		final GameImage music1 = new GameImage("musicstart.png");
		music1.setPosition(125, 0);
		music1.hide();
	
		music.addMouseListener(new Runnable(){
			public void run(){
			GameCore.closeSound("apple.mp3");
			music.hide();
			music1.show();
			}
		});
		music1.addMouseListener(new Runnable(){
			public void run(){
			GameCore.playSound("apple.mp3",true);
			music1.hide();
			music.show();
			}
		});
		
		
		
		
		
		 startbuttom.addMouseListener(new Runnable(){

			@Override
			public void run() {
				title.hide();
				startbuttom.hide();
				
				GameCore.asyncRun(new Runnable(){

					@Override
					public void run() {
						
						Ghost();						
					}
					
				});
				
				Panda();	
				
			
						/*GameCore.addKeyListener(new KeyAdapter() {
							public void keyReleased(KeyEvent e)
							{
								if(e.getKeyCode()==KeyEvent.VK_J)
								{
									Bullet();//不要在括号层次嵌套太多的地方写太多的代码，否则看着晕
								}
							}
						});*/
					
			     
			
								
	
				
			
			}});
	while(true){
		GameCore.pause(10);
	}
		
	}
	
	
	public void Panda(){
		
		GameCore.setGameSize(1300, 900);
		GameCore.loadBgView("pandabg.jpg");
		
		  GameImage ground = new GameImage("ground.png");
		   ground.setPosition(0, 790);
		   GameImage ground1 = new GameImage("groundmiddle.png");
		   ground1.setPosition(0, 590);
		   
		   GameImage ground2 = new GameImage("groundmiddle.png");
		   ground2.setPosition(0, 390);
		   
		   GameImage ground3 = new GameImage("groundmiddle.png");
		   ground3.setPosition(0, 190);
		   
		   GameImage ground4 = new GameImage("groundmiddle.png");
		   ground4.setPosition(1010, 590);
		   
		   GameImage ground5 = new GameImage("groundmiddle.png");
		   ground5.setPosition(1010, 390);
		   
		   GameImage ground6 = new GameImage("groundmiddle.png");
		   ground6.setPosition(1010, 190);
		   
		   GameImage ground7 = new GameImage("groundmiddle.png");
		   ground7.setPosition(500, 590);
		   
		   GameImage ground8 = new GameImage("groundmiddle.png");
		   ground8.setPosition(500, 390);
		   
		   GameImage ground9 = new GameImage("groundmiddle.png");
		   ground9.setPosition(500, 190);
		   
		   
		   
		   
		   
		
		 this.pandaRun = new GameSprite("panda");
		 
		pandaRun.setPosition(100, 700);
		pandaRun.playAnimate("run");
		
	
	
			 while(true){
				 if(pandaRun.isIntersectWith(ground1)){
					 pandaRun.moveLeft();
					 if(pandaRun.isIntersectWith(ground1)){
						 pandaRun.moveRight(2);
						 if(pandaRun.isIntersectWith(ground1)){
							 pandaRun.moveDown();
							 if(pandaRun.isIntersectWith(ground1)){
								 pandaRun.moveUp();
								 pandaRun.moveUp();
							 }
						 }
					 }
				 }
				 
			
					 if(pandaRun.isIntersectWith(ground2)){
						 pandaRun.moveLeft();
						 if(pandaRun.isIntersectWith(ground2)){
							 pandaRun.moveRight(2);
							 if(pandaRun.isIntersectWith(ground2)){
								 pandaRun.moveDown();
								 if(pandaRun.isIntersectWith(ground2)){
									 pandaRun.moveUp();
									 pandaRun.moveUp();
								 }
							 }
						 }
					 }
					 
					
						 if(pandaRun.isIntersectWith(ground3)){
							 pandaRun.moveLeft();
							 if(pandaRun.isIntersectWith(ground3)){
								 pandaRun.moveRight(2);
								 if(pandaRun.isIntersectWith(ground3)){
									 pandaRun.moveDown();
									 if(pandaRun.isIntersectWith(ground3)){
										 pandaRun.moveUp();
										 pandaRun.moveUp();
									 }
								 }
							 }
						 }
						 
						
							 if(pandaRun.isIntersectWith(ground4)){
								 pandaRun.moveLeft();
								 if(pandaRun.isIntersectWith(ground4)){
									 pandaRun.moveRight(2);
									 if(pandaRun.isIntersectWith(ground4)){
										 pandaRun.moveDown();
										 if(pandaRun.isIntersectWith(ground4)){
											 pandaRun.moveUp();
											 pandaRun.moveUp();
										 }
									 }
								 }
							 }
							 		 if(pandaRun.isIntersectWith(ground5)){
									 pandaRun.moveLeft();
									 if(pandaRun.isIntersectWith(ground5)){
										 pandaRun.moveRight(2);
										 if(pandaRun.isIntersectWith(ground5)){
											 pandaRun.moveDown();
											 if(pandaRun.isIntersectWith(ground5)){
												 pandaRun.moveUp();
												 pandaRun.moveUp();
											 }
										 }
									 }
								 }
								 
								
									 if(pandaRun.isIntersectWith(ground6)){
										 pandaRun.moveLeft();
										 if(pandaRun.isIntersectWith(ground6)){
											 pandaRun.moveRight(2);
											 if(pandaRun.isIntersectWith(ground6)){
												 pandaRun.moveDown();
												 if(pandaRun.isIntersectWith(ground6)){
													 pandaRun.moveUp();
													 pandaRun.moveUp();
												 }
											 }
										 }
									 }
									 
								
										 if(pandaRun.isIntersectWith(ground7)){
											 pandaRun.moveLeft();
											 if(pandaRun.isIntersectWith(ground7)){
												 pandaRun.moveRight(2);
												 if(pandaRun.isIntersectWith(ground7)){
													 pandaRun.moveDown();
													 if(pandaRun.isIntersectWith(ground7)){
														 pandaRun.moveUp();
														 pandaRun.moveUp();
													 }
												 }
											 }}
								
										
												 if(pandaRun.isIntersectWith(ground8)){
													 pandaRun.moveLeft();
													 if(pandaRun.isIntersectWith(ground8)){
														 pandaRun.moveRight(2);
														 if(pandaRun.isIntersectWith(ground8)){
															 pandaRun.moveDown();
															 if(pandaRun.isIntersectWith(ground8)){
																 pandaRun.moveUp();
																 pandaRun.moveUp();
															 }
														 }
													 }
												 }
												 
												
													 if(pandaRun.isIntersectWith(ground9)){
														 pandaRun.moveLeft();
														 if(pandaRun.isIntersectWith(ground9)){
															 pandaRun.moveRight(2);
															 if(pandaRun.isIntersectWith(ground9)){
																 pandaRun.moveDown();
																 if(pandaRun.isIntersectWith(ground9)){
																	 pandaRun.moveUp();
																	 pandaRun.moveUp();
																 }
															 }
														 }
													 }
												
					 
	    	  int key = GameCore.getPressedKeyCode();
	    	  if(key == KeyEvent.VK_J){
	    		  
	    		  GameCore.playSound("hit.mp3", false);
	    	 	GameCore.asyncRun(new Runnable(){
	    	 		public void run(){
	    	 			 Bullet();
						    
	    	 		}
	    	 	});	
			   
	    	  }
	    	  if(key==KeyEvent.VK_SPACE){
	    		  GameCore.playSound("lose.mp3", false);
	    	  for(int i=0;i<=100;i++){
	    		  pandaRun.moveUp();
	    		  GameCore.pause(3);
	    	  }
	    	  for(int o=0;o<=100;o++){
	    		  pandaRun.moveDown();
	    		  GameCore.pause(3);
	    	  }}
	    	  else if(key == KeyEvent.VK_RIGHT && !pandaRun.isReachRightSide() &&
	    			  !pandaRun.isIntersectWith(ground1)&&
	    			  !pandaRun.isIntersectWith(ground2)&&
	    			  !pandaRun.isIntersectWith(ground3)&&
	    			  !pandaRun.isIntersectWith(ground4)&&
	    			  !pandaRun.isIntersectWith(ground5)&&
	    			  !pandaRun.isIntersectWith(ground6)&&
	    			  !pandaRun.isIntersectWith(ground7)&&
	    			  !pandaRun.isIntersectWith(ground8)&&
	    			  !pandaRun.isIntersectWith(ground9)){
	    		  pandaRun.setFlipX(false);
	    		  pandaRun.moveRight(5);
	    		  GameCore.pause(2);
	    	  }
	    	  else if(key == KeyEvent.VK_LEFT && !pandaRun.isReachLeftSide()&&
	    			  !pandaRun.isIntersectWith(ground1)&&
	    			  !pandaRun.isIntersectWith(ground2)&&
	    			  !pandaRun.isIntersectWith(ground3)&&
	    			  !pandaRun.isIntersectWith(ground4)&&
	    			  !pandaRun.isIntersectWith(ground5)&&
	    			  !pandaRun.isIntersectWith(ground6)&&
	    			  !pandaRun.isIntersectWith(ground7)&&
	    			  !pandaRun.isIntersectWith(ground8)&&
	    			  !pandaRun.isIntersectWith(ground9)){
	    		  pandaRun.setFlipX(true);
	    		  pandaRun.moveLeft(5);
	    		  GameCore.pause(2);
	    	  }
	    	  else if(key == KeyEvent.VK_DOWN && pandaRun.getPosition().y <= 700&&
	    			
	    			  !pandaRun.isIntersectWith(ground1)&&
	    			  !pandaRun.isIntersectWith(ground2)&&
	    			  !pandaRun.isIntersectWith(ground3)&&
	    			  !pandaRun.isIntersectWith(ground4)&&
	    			  !pandaRun.isIntersectWith(ground5)&&
	    			  !pandaRun.isIntersectWith(ground6)&&
	    			  !pandaRun.isIntersectWith(ground7)&&
	    			  !pandaRun.isIntersectWith(ground8)&&
	    			  !pandaRun.isIntersectWith(ground9)
	    			  ){
	    		 
	    		  pandaRun.moveDown();
	    		  GameCore.pause(2);
	    	  }
	    	  else if(key == KeyEvent.VK_UP && !pandaRun.isReachTopSide() &&
	    			  !pandaRun.isIntersectWith(ground1)&&
	    			
	    			  !pandaRun.isIntersectWith(ground2)&&
	    			  !pandaRun.isIntersectWith(ground3)&&
	    			  !pandaRun.isIntersectWith(ground4)&&
	    			  !pandaRun.isIntersectWith(ground5)&&
	    			  !pandaRun.isIntersectWith(ground6)&&
	    			  !pandaRun.isIntersectWith(ground7)&&
	    			  !pandaRun.isIntersectWith(ground8)&&
	    			  !pandaRun.isIntersectWith(ground9)){
	    		  pandaRun.moveUp();
	    		  GameCore.pause(2);
	    	  }
			 }
	    	  
											 }

		
	
	
	public void Ghost(){
	this.robot = new GameSprite("robot");
	 robot.setFlipX(true);
	 robot.setPosition(20, 330);
	 robot.playAnimate("run");
     
	 this.robot1 = new GameSprite("robot");
	 robot1.setFlipX(true);
	 robot1.setPosition(70, 330);
	 robot1.playAnimate("run");
	 
	 this.robot2 = new GameSprite("robot");
	 robot2.setFlipX(true);
	 robot2.setPosition(120, 330);
	 robot2.playAnimate("run");
	 
	this.robot3 = new GameSprite("robot");
	 robot3.setFlipX(true);
	 robot3.setPosition(170, 330);
	 robot3.playAnimate("run");
	 
	 this.robot4 = new GameSprite("robot");
	 robot4.setFlipX(true);
	 robot4.setPosition(220, 330);
	 robot4.playAnimate("run");
	
	 
		while(true){
			 robot.setFlipX(true);
	    	 robot1.setFlipX(true);
	    	 robot2.setFlipX(true);
	    	 robot3.setFlipX(true);
	    	 robot4.setFlipX(true);
	     for(int a=0;a<=35;a++){
	    	 robot4.moveRight(2);
	    	 GameCore.pause(8); 
	     }
	     while(robot4.getPosition().y <= 730){
	    	
	    	 robot4.moveDown();
	    	 GameCore.pause(10);
	     }
	     for(int s=0;s<=250;s++){
	    	 robot4.moveRight();
	    	 GameCore.pause(8);
	     }
	     

	     for(int a=0;a<=65;a++){
	    	 robot3.moveRight(2);
	    	 GameCore.pause(8); 
	     }
	     while(robot3.getPosition().y <= 730){
	    	
	    	 robot3.moveDown();
	    	 GameCore.pause(10);
	     }
	     for(int s=0;s<=200;s++){
	    	 robot3.moveRight();
	    	 GameCore.pause(8);
	     }
	     

	     for(int a=0;a<=95;a++){
	    	 robot2.moveRight(2);
	    	 GameCore.pause(8); 
	     }
	     while(robot2.getPosition().y <= 730){
	    	
	    	 robot2.moveDown();
	    	 GameCore.pause(10);
	     }
	     for(int s=0;s<=150;s++){
	    	 robot2.moveRight();
	    	 GameCore.pause(8);
	     }
	 

	     for(int a=0;a<=125;a++){
	    	 robot1.moveRight(2);
	    	 GameCore.pause(8); 
	     }
	     while(robot1.getPosition().y <= 730){
	    	
	    	 robot1.moveDown();
	    	 GameCore.pause(10);
	     }
	     for(int s=0;s<=100;s++){
	    	 robot1.moveRight();
	    	 GameCore.pause(8);
	     }
	   

	     for(int a=0;a<=155;a++){
	    	 robot.moveRight(2);
	    	 GameCore.pause(8); 
	     }
	     while(robot.getPosition().y <= 730){
	    	
	    	 robot.moveDown();
	    	 GameCore.pause(10);
	     }
	     for(int s=0;s<=50;s++){
	    	 robot.moveRight();
	    	 GameCore.pause(8);
	     }
	     
	     while(robot4.getPosition().x<=1250){
	    	 robot4.moveRight();
	    	 robot3.moveRight();
	    	 robot2.moveRight();
	    	 robot1.moveRight();
	    	 robot.moveRight();
	    	 GameCore.pause(10);
	     }
	     while(robot.getPosition().x>=0){
	    	 robot.setFlipX(false);
	    	 robot1.setFlipX(false);
	    	 robot2.setFlipX(false);
	    	 robot3.setFlipX(false);
	    	 robot4.setFlipX(false);
	    	 robot.moveLeft();
	    	 robot1.moveLeft();
	    	 robot2.moveLeft();
	    	 robot3.moveLeft();
	    	 robot4.moveLeft();
	    	 GameCore.pause(10);
	     }
		}
	 
	}
	  
	   
	
	public void Bullet(){
		int jishu = 0;
		GameSprite ball = new GameSprite("ball");
		Point ballpos = pandaRun.getPosition();
		ball.setPosition(ballpos.x,ballpos.y+50);
		ball.playAnimate("rotate");
		if(pandaRun.getPosition().x<=650 ){
				for(int q=0;q<=1250;q++){
				ball.moveRight();
				GameCore.pause(1);
				if(ball.isIntersectWith(robot)){
					robot.hide();
					jishu++;
					ball.remove();
				}
				else if(ball.isIntersectWith(robot1)){
					robot1.hide();
					jishu++;
					ball.remove();
				}
				else if(ball.isIntersectWith(robot2)){
				    robot2.hide();
				    jishu++;
				    ball.remove();
				}
				else if(ball.isIntersectWith(robot3)){
				    robot3.hide();
				    jishu++;
				    ball.remove();
				}
				else if(ball.isIntersectWith(robot4)){
				    robot4.hide();
				    jishu++;
				    ball.remove();				    
				}				
				}
				ball.remove();
				}
		if(pandaRun.getPosition().x>650){
			for(int w=0;w<=1250;w++){
				ball.moveLeft();
				GameCore.pause(1);
				if(ball.isIntersectWith(robot)){
					robot.hide();
					jishu++;
					ball.remove();
				}
				else if(ball.isIntersectWith(robot1)){
					robot1.hide();
					jishu++;
					ball.remove();
				}
				else if(ball.isIntersectWith(robot2)){
				    robot2.hide();
				    jishu++;
				    ball.remove();
				}
				else if(ball.isIntersectWith(robot3)){
				    robot3.hide();
				    jishu++;
				    ball.remove();
				}
				else if(ball.isIntersectWith(robot4)){
				    robot4.hide();
				    jishu++;
				    ball.remove();
				}
			}
			      ball.remove();}
			
			  if(jishu == 5){
				  GameCore.alert("此关已过");
			  }
		
			}

           
		

	
	 
	
	
		
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        GameCore.start(new GameMain());
	}

}
