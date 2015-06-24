//Ryan Miller

package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Calculator extends JFrame 
{
	//Local action buttons
	JButton inverse = new JButton("Inverse");
	JButton determinant = new JButton("Determinant");
	JButton transpose = new JButton("Transpose");
	JButton changeSize = new JButton("Edit Matrix");
	
	//Buttons that create new windows
	JButton multi = new JButton("Multiplication");
	JButton addition = new JButton("Add/Subtract");
	JButton systems = new JButton("Systems of Lin. Eq.");
	
	//Default 3x3 matrix
	JTextField[][] matrix = new JTextField[3][3];
	
	//Panels
	JPanel matrixPanel = new JPanel();
	JPanel actionPanel = new JPanel();
	JPanel newPanel = new JPanel();
	
	public Calculator()
	{
		//Set up panels
		setMatrix();
		setAction();
		setNew();
		JPanel topPanel = new JPanel(new GridLayout(1, 2, 25, 4));
		topPanel.add(matrixPanel);
		topPanel.add(newPanel);
		
		//Set Frame layout
		setLayout(new BorderLayout());
		
		//Add panels
		add(topPanel, BorderLayout.CENTER);
		add(actionPanel, BorderLayout.SOUTH);
		
		//Set window settings
		setSize(315, 160);
		setTitle("Matrix Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	
	private void setMatrix()
	{
		matrixPanel.setLayout(new GridLayout(3, 3, 10, 10));
		matrixPanel.setSize(100, 100);
		
		//Initialize matrices
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				matrix[i][j] = new JTextField();
				matrixPanel.add(matrix[i][j]);
			}
		}
	}
	
	private void setAction()
	{
		newPanel.setLayout(new GridLayout(1, 3, 3, 3));
		actionPanel.add(inverse);
		actionPanel.add(transpose);
		actionPanel.add(determinant);
		actionPanel.add(changeSize);
	}
	
	private void setNew()
	{
		newPanel.setLayout(new GridLayout(3, 1, 3, 10));
		newPanel.add(multi);
		newPanel.add(addition);
		newPanel.add(systems);
	}
}
