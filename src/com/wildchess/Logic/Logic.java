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
		boards = new int[8][8];
		boards=ServiceFunctions.InitMass(0, 0); //инициализируем доску.
		
	}
	//private 
	
}
