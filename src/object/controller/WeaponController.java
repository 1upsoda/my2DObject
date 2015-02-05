package object.controller;

import javax.swing.JOptionPane;

import object.model.Weapon;
import object.view.WeaponFrame;

public class WeaponController
{

	private Weapon[][] myWeapon;
	private WeaponFrame appFrame;
	public WeaponController()
	{
		myWeapon = new Weapon[3][2];
		fillMyWeaponArray();
		appFrame = new WeaponFrame(this);
	}
	private void fillMyWeaponArray()
	{
		for(int row = 0; row<myWeapon.length; row++)
		{
			for(int col = myWeapon[row].length-1; col >= 0; col--)
			{
				String name = "" + row + "" + col + " Weapon";
				int damage = (int) (Math.random() * 65);
				boolean canTakeHeads = (damage % 2 ==0);
				
				myWeapon[row][col] = new Weapon(name, damage, canTakeHeads);
			}
		}
	}
	
	public Weapon[][] getMyWeapons()
	{
		return myWeapon;
		
	}
	public WeaponFrame getAppFrame()
	{
		return appFrame;
	}
	public void start()
	{
		fillMyWeaponArray();
		JOptionPane.showMessageDialog(appFrame, "Welcome to Swords");
		
	}
	
}
