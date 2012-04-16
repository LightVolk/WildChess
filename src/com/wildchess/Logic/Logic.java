/**
 * Файл создан 10.04.2012 14:07:46 TODO
 */
package com.wildchess.Logic;

import com.wildchess.ThirdSystems.ServiceFunctions;

/**
 * @author Konstantin
 *
 */
public class Logic {
	private int BOARD_SIZE=8;
	private boolean FlagOoutofBoard=false;
	Logic logic=new Logic();
	ServiceFunctions serviceobj=new ServiceFunctions();
	private int board[][];
	 public Logic()
	{
		setBoards(new int[getBOARD_SIZE()][getBOARD_SIZE()]);
		setBoards(ServiceFunctions.InitMass(0, 0)); //инициализируем доску.
		
	}
	/**
	 * @return the boards
	 */
	public int[][] getBoards() {
		return board;
	}
	/**
	 * @param boards the boards to set
	 */
	public void setBoards(int boards[][]) {
		this.board = boards;
	}
	/**
	 * @return the bOARD_SIZE
	 */
	public int getBOARD_SIZE() {
		return BOARD_SIZE;
	}
	/**
	 * @param bOARD_SIZE the bOARD_SIZE to set
	 */
	public void setBOARD_SIZE(int bOARD_SIZE) {
		BOARD_SIZE = bOARD_SIZE;
	}
	
	/*Функция создания "битых" полей.На вход получает доску с фигурами
	 * на выход-доску с фигурами и битыми полями.
	 * условные обозначения ,белых/черных
	 * pawn=1/11;Knight=2/22;Bishop=3/33;Ladia=4/44;Qween=5/55;King=6/66
	 * 100/111 -поля,простреливаемые белыми/черными  */
	 public int[][] GetBattleField(int[][] board)
	 {
		 for(int X=0;X<BOARD_SIZE;X++)
			 for(int Y=0;Y<BOARD_SIZE;Y++)
			 {
				 switch(board[X][Y]) {
				 	// сделать проверку выхода за границу доски
				 // boolean isOutofBoard(int[][] board)
				 	case 1:
				 		   if(logic.getFlagOoutofBoard()==true)
				 		   {
				 			   //слишком часто будет повторяться.обернуть в метод.
				 		   board[X+1][Y+1]=10;//1 -для белой пешки
				 		   board[X-1][Y+1]=10;
				 		   }
				 	case 2:
					 
				 }
			 }
		 
		 return board;
	 }
	 // проверяем,вышла ли фигура за границы доски
	 public boolean isOutofBoard(int[][] board)
	 {
		 
		 return false;
	 }
	public boolean getFlagOoutofBoard() {
		return FlagOoutofBoard;
	}
	public void setFlagOoutofBoard(boolean flagOoutofBoard) {
		FlagOoutofBoard = flagOoutofBoard;
	}
	 
	
}
