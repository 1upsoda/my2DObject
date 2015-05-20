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
		myWeapon = new Weapon[13][2];
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
				int damage = 0;
				boolean canTakeHeads = (damage % 2 ==0);
				if(canTakeHeads == false)
				{
					
					int criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					else
					{
						damage += (int) (((Math.random() * 20)+55));
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
					criticalBonus = (int) (Math.random() * 100);
					if(criticalBonus <= 15)
					{
					damage += (int) (((Math.random() * 20)+55)*3);
					}
				}
				else
				{
					damage = (int) ((Math.random() * 20)+55);
				}
				
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
//	public void addToArray()
//	{
//		int row = 0;
//		int col = 0;
//		
//		myWeapon[row][col] = new Weapon(userInputName, damage, canTakeHeads);
//	}
//	
}
