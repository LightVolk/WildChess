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
	ServiceFunctions serviceobj=new ServiceFunctions();
	private int boards[][];
	 Logic()
	{
		setBoards(new int[getBOARD_SIZE()][getBOARD_SIZE()]);
		setBoards(ServiceFunctions.InitMass(0, 0)); //инициализируем доску.
		
	}
	/**
	 * @return the boards
	 */
	public int[][] getBoards() {
		return boards;
	}
	/**
	 * @param boards the boards to set
	 */
	public void setBoards(int boards[][]) {
		this.boards = boards;
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
	 
	
}
