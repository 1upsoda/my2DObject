package object.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import object.controller.WeaponController;
import object.model.Weapon;

public class WeaponPanel extends JPanel
{
	private JScrollPane tablePane;
	private JLabel weaponTitle;
	private JTable weaponTable;
	private SpringLayout baseLayout;
	private WeaponController baseController;
	private JTextField txtName;
	private JTextField txtBaseDamage;
	private JTextField txtCritChance;
	private JButton btnAddToArray;
	public String userInputName;
	public String userInputBaseDamage;
	public String userInputCritChance, userRowChosen, userColumnChosen;
	private JTextField txtRow;
	private JTextField txtCollumn;
	
	public WeaponPanel(WeaponController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		weaponTitle = new JLabel("Table of Swords");
		btnAddToArray = new JButton();
		
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
		tablePane = new JScrollPane(weaponTable);
		baseLayout.putConstraint(SpringLayout.SOUTH, tablePane, -20, SpringLayout.SOUTH, this);
		
		
		
	}
	private void setupPanel()
	{
		setBackground(Color.YELLOW);
		setLayout(baseLayout);
		this.add(tablePane);
		this.add(weaponTitle);
		
		txtName = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, txtName, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, txtName, 0, SpringLayout.WEST, tablePane);
		txtName.setText("Name");
		add(txtName);
		txtName.setColumns(10);
		
		txtBaseDamage = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, txtBaseDamage, 0, SpringLayout.NORTH, txtName);
		baseLayout.putConstraint(SpringLayout.WEST, txtBaseDamage, 6, SpringLayout.EAST, txtName);
		txtBaseDamage.setText("Base Damage");
		add(txtBaseDamage);
		txtBaseDamage.setColumns(10);
		
		txtCritChance = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, txtCritChance, 0, SpringLayout.NORTH, txtName);
		baseLayout.putConstraint(SpringLayout.WEST, txtCritChance, 6, SpringLayout.EAST, txtBaseDamage);
		txtCritChance.setText("Crit Chance");
		add(txtCritChance);
		txtCritChance.setColumns(10);
		
		JButton btnAddToArray = new JButton("Change Cell");
		baseLayout.putConstraint(SpringLayout.NORTH, btnAddToArray, 6, SpringLayout.SOUTH, txtBaseDamage);
		baseLayout.putConstraint(SpringLayout.WEST, btnAddToArray, 0, SpringLayout.WEST, txtBaseDamage);
		baseLayout.putConstraint(SpringLayout.EAST, btnAddToArray, 0, SpringLayout.EAST, txtBaseDamage);
		add(btnAddToArray);
		
		txtRow = new JTextField();
		txtRow.setText("Row");
		baseLayout.putConstraint(SpringLayout.NORTH, txtRow, 6, SpringLayout.SOUTH, txtName);
		baseLayout.putConstraint(SpringLayout.WEST, txtRow, 0, SpringLayout.WEST, tablePane);
		add(txtRow);
		txtRow.setColumns(10);
		
		txtCollumn = new JTextField();
		baseLayout.putConstraint(SpringLayout.NORTH, txtCollumn, 6, SpringLayout.SOUTH, txtCritChance);
		baseLayout.putConstraint(SpringLayout.WEST, txtCollumn, 0, SpringLayout.WEST, txtCritChance);
		txtCollumn.setText("Column");
		add(txtCollumn);
		txtCollumn.setColumns(10);
//		this.add(weaponTable);
		
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, tablePane, 86, SpringLayout.SOUTH, weaponTitle);
		baseLayout.putConstraint(SpringLayout.WEST, tablePane, 20, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, tablePane, -20, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, weaponTitle, 20, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, weaponTitle, 145, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		btnAddToArray.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				userInputName = txtName.getText();
				userInputBaseDamage = txtBaseDamage.getText();
				userInputCritChance = txtCritChance.getText();
				userRowChosen = txtRow.getText();
				userColumnChosen = txtCollumn.getText();
				
				
			}
		});
	}
}
