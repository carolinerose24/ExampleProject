package controller;

import javax.swing.JOptionPane;

import model.LiterallyAnything;

public class Controller
{
	private LiterallyAnything myLA;
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myLA);

	}
	
	public Controller()
	{
		myLA = new LiterallyAnything ("First Title", 1 , 2.0);
	}
}
