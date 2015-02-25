package object.model;

public class Weapon implements Comparable
{
	private String name;
	private int damagePerSecond;
	private boolean canTakeHeads;
	public String getName()
	{
		return name;
	}
	public int getDamagePerSecond()
	{
		return damagePerSecond;
	}
	public boolean isCanTakeHeads()
	{
		return canTakeHeads;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDamagePerSecond(int damagePerSecond)
	{
		this.damagePerSecond = damagePerSecond;
	}
	public void setCanTakeHeads(boolean canTakeHeads)
	{
		this.canTakeHeads = canTakeHeads;
	}
	public Weapon(String name, int damagePerSecond, boolean canTakeHeads)
	{
		this.name = name;
		this.damagePerSecond = damagePerSecond;
		this.canTakeHeads = canTakeHeads;
		
	}
	public String toString()
	{
		String weaponString = "";
		
		weaponString += "Hi, *Heads* I am a Sword object. *Heaaads* My name *heads heads heads* is: " + name + ".";
		weaponString += " My damage I *Heads* do right now (including critical hit chance) is: " + damagePerSecond + " and ";
		if(canTakeHeads)
		{
			weaponString += "HEADS! HEADS! HEADS!";
		}
		else
		{
			weaponString += "I don't take Heads, but I still like them...";
		}
		return weaponString;
	}
	
	/**
	 * compares the dps of the weapons, if it is bigger, returns it as bigger...
	 * 
	 * if compared object is not a weapon, the comparison is the smallest number ever
	 * @param otherWeapon, a weapon object should be Weapon type
	 */
	
	public int compareTo(Object otherWeapon)
	{
		int comparedValue = 0;
		
		if(otherWeapon instanceof Weapon)
		{
			otherWeapon = (Weapon) otherWeapon;
		
			if(this.damagePerSecond > ((Weapon) otherWeapon).getDamagePerSecond() )
			{
				comparedValue = 1;
			}
			else if(this.damagePerSecond < ((Weapon) otherWeapon).getDamagePerSecond() )
			{
				comparedValue = -1;
			}
		}
		else
		{
			comparedValue = Integer.MIN_VALUE;
		}
		
		return comparedValue;
		
	}

}
