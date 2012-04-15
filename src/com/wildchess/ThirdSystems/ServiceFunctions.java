/**
 * Файл создан 10.04.2012 14:18:30 TODO
 */
package com.wildchess.ThirdSystems;

import com.wildchess.Logic.Logic;

/**
 * @author Konstantin
 *  Вспомогательные функции, используемые в других классах
 */

public class ServiceFunctions {
	
	
	
	
	public static int[][] InitMass(int X,int Y)
	{Logic board=new Logic();
		int[][] Massiv=new int[X][Y];
		
		for(int i=0;i<board.getBOARD_SIZE();i++)
		{
			Massiv[board.getBOARD_SIZE()][board.getBOARD_SIZE()]=0;
		}
		
		return Massiv;
		
		
	}
	
}
