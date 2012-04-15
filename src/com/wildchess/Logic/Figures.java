/**
 * Файл создан 10.04.2012 14:42:43 TODO
 */
package com.wildchess.Logic;

import java.util.ArrayList;

/**
 * @author Konstantin
 *
 */
public class Figures {
	
	
	private pieceState state;  // возможные состояния фигуры (жив,мертв)
	private int x,y; // координаты шахматной фигуры на доске
	
	
    // перечисление типов фигур
	private enum pieceType {
		pawn, bishop, knight, rook, queen, king
	};
//  определяем возможные цвета фигур
	private enum FigureColour {
		black, white
	};
//   состояние фигуры
	private enum pieceState {
		alive, dead
	};
//   состояние игры- все нормально, шах белыми,мат белыми, шах черными,мат черными ,пат
	private enum gameState {
		allClear, whiteCheck, whiteMate, blackCheck, blackMate, stalemate
	};
// статус хода   успешный, неуспешный,возможный
	private enum moveStatus {
		success, fail, promote
	};
	
	// определяем интерфейс Piece с методами Go (сделать ход) и GetPossibleSteps 
	//( получить координаты возможных ходов)
	public interface Piece {     
		void Go(int x,int y);
		int[][] GetPossibleSteps();
	}
	
	public int getPositionX()   // получить координату по линии a-h
	{
		return x;
	}
	public int getPositionY()   // получить координату по линии 1-8
	{
		return y;
	}
	public pieceState getState()  // получить статус фигуры  
	{
		return state;
	}
	//public int[][] getPossibleSteps()
//	{
		//return 
//	}
	Figures()
	{
		ArrayList figures=new ArrayList(); // создаем коллекцию фигур.
	// тест. обернуть в метод.	
		// добавить объекты вида белый король,черный король.и тд.
		// вместо null поставить значения массива border для инициализации фигур на доске.
		/*
		Object WhiteKing = null,WhiteQween=null;// определяем список фигур на доске.(тест)
		Object WhiteKon=null,WhiteBishop=null,WhiteLadia=null,WhitePeshka=null;    
		Object BlackKing=null,BlackQween=null,BlackKon=null,BlackBishop=null,BlackLadia=null,BlackPeshka=null;
		figures.add(WhiteKing);
		figures.add(BlackKing);
		figures.add(BlackQween);
		figures.add(WhiteQween);
		
		for(int i=0;i<8;i++);
		{
			figures.add(BlackPeshka);
			figures.add(WhitePeshka);
		}
		for(int i=0;i<2;i++)
		{
			// добавляем черные фигуры
			figures.add(BlackLadia);
			figures.add(BlackBishop);
			figures.add(BlackKon);
			// добавляем белые фигуры
			figures.add(WhiteLadia);
			figures.add(WhiteBishop);
			figures.add(WhiteKon);
		}
	*/	
	}
	
	
	
}
