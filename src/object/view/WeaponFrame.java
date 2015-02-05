package object.view;

import javax.swing.JFrame;

import object.controller.WeaponController;

public class WeaponFrame extends JFrame
{
	private WeaponPanel appPanel;
	

	public WeaponFrame(WeaponController baseController)
	{
		appPanel = new WeaponPanel(baseController);
		setupFrame();
		
		
	}
	
	private void setupFrame()

	{

		setContentPane(appPanel);

		setLocation(5, 6);

		setSize(400, 400);

		setResizable(false);

		setVisible(true);

	}
}
