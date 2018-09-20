package controller;

import javax.swing.JOptionPane;

import model.LiterallyAnything;

public class Controller
{
	private LiterallyAnything myInputStuff;
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myInputStuff);

	}
	
	public Controller()
	{
		myInputStuff = new LiterallyAnything();
	}
}
