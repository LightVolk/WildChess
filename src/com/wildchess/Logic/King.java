/**
 * 
 */
package com.wildchess.Logic;

import com.wildchess.Logic.Figures.Piece;

/**
 * @author Константин @
 *
 */
public class King implements Piece {

	@Override
	public void Go(int x, int y) {
		// TODO Auto-generated method stub
		
	}
// переопределяем метод для короля
		// ?на вход координаты поля?, на выход массив возможных ходов
	@Override
	public int[][] GetPossibleSteps() {
		// TODO Auto-generated method stub
		Figures king=new Figures();
		int X=king.getPositionX();
		int Y=king.getPositionY();
		int[][] Massiv=new int[X][Y];
		
		
		
		return Massiv;
	}

	  
	
	

	

	
	
}
