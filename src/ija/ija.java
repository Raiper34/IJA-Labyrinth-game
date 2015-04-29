package ija;

import ija.elements.hraci;
import ija.ui.tui;
import ija.homework2.board.MazeBoard;
import ija.ui.menuGui;
import javax.swing.*;

/**
 * @author raiper34
 *Hlavna trieda ktora sa spusta s programom
 */
public class ija 
{	
	public static void main(String[] args) 
	{       
                menuGui menuOkno = new menuGui();
                menuOkno.setVisible(true);
                
                //MazeBoard hraciaPlocha = MazeBoard.createMazeBoard(7);
		//tui textUI = new tui(hraciaPlocha);
		//textUI.start();
		System.out.println("Program sa ukoncuje!");
	}

}
