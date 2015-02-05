package object.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import object.controller.WeaponController;

public class WeaponPanel extends JPanel
{
	private JLabel weaponTitle;
	private JTable weaponTable;
	private SpringLayout baseLayout;
	private WeaponController baseController;
	
	public WeaponPanel(WeaponController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		weaponTitle = new JLabel("Table of Swords");
		baseLayout.putConstraint(SpringLayout.NORTH, weaponTitle, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, weaponTitle, 186, SpringLayout.WEST, this);
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupTable()
	{
		String [] colNames = {"Swords Col 1", "Swords Col 2"};
		DefaultTableModel weaponsModel = new DefaultTableModel(baseController.getMyWeapons(), colNames);
		weaponTable = new JTable(weaponsModel);
		baseLayout.putConstraint(SpringLayout.NORTH, weaponTable, 120, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, weaponTable, 150, SpringLayout.WEST, this);
	}
	private void setupPanel()
	{
		setBackground(Color.YELLOW);
		setLayout(baseLayout);
		this.add(weaponTitle);
		this.add(weaponTable);
		
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
}
