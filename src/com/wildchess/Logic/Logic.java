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

	ServiceFunctions serviceobj=new ServiceFunctions();
	private int boards[][];
	 Logic()
	{
		setBoards(new int[8][8]);
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
	 
	
}
