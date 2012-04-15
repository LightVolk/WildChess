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

	Figures()
	{
		ArrayList figures=new ArrayList(); // создаем коллекцию фигур.
	// тест. обернуть в метод.	
		// добавить объекты вида белый король,черный король.и тд.
		// вместо null поставить значения массива border для инициализации фигур на доске.
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
		
	}
	
	
	
}
