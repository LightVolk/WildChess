/**
 * 
 */
package com.wildchess.Logic;

import com.wildchess.Logic.Figures.Piece;
import com.wildchess.Logic.Figures.pieceType;
import com.wildchess.ThirdSystems.ServiceFunctions;
import com.wildchess.ThirdSystems.ServiceFunctions.InitSystem;

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
		Logic logicKing=new Logic();
		ServiceFunctions init=new ServiceFunctions();
		king.Type_of_Figure=pieceType.king;
		
		int X=king.getPositionX();
		int Y=king.getPositionY();
		int[][] Massiv=new int[logicKing.getBOARD_SIZE()][logicKing.getBOARD_SIZE()];
		
		Massiv=logicKing.getBoards();  // забираем данные доски.
		//int[][] VyxodnoiMassiv=new int[logicKing.getBOARD_SIZE()][logicKing.getBOARD_SIZE()];
		
		// обернуть в метод , инициализирующий доску и фигуру на ней.(перегрузить метод InitMassiv()  )
		Massiv[X][Y]=6; // king.Type_of_Figure.toString(); неполучилось присвоить массиву  king из перечисления.
		
		return Massiv;
	}
	

	  
	
	

	

	
	
}
