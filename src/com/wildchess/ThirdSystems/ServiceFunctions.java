/**
 * Файл создан 10.04.2012 14:18:30 TODO
 */
package com.wildchess.ThirdSystems;

/**
 * @author Konstantin
 *
 */

public class ServiceFunctions {
	
public interface InitSystem {
	int[][] InitMass(int i,int j);
	
}
	
	
	public static int[][] InitMass(int i,int j)
	{
		int[][] Massiv=new int[i][j];
		return Massiv;
		
		
	}
}
