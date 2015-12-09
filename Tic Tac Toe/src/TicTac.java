import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class TicTac {

	private JFrame frmTicTacToe;
	private String m_previousPlay = null;
	private JButton [][] m_allButtons = new JButton[3][3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					TicTac window = new TicTac();
					window.frmTicTacToe.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TicTac() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("Tic Tac Toe :)");
		frmTicTacToe.setBounds(100, 100, 500, 500);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.getContentPane().setLayout(new GridLayout(0, 3, 0, 0));

		JButton btnOne = new JButton("");
		frmTicTacToe.getContentPane().add(btnOne);
		m_allButtons[0][0] = btnOne;

		JButton btnTwo = new JButton("");
		frmTicTacToe.getContentPane().add(btnTwo);
		m_allButtons[0][1] = btnTwo;

		JButton btnThree = new JButton("");
		frmTicTacToe.getContentPane().add(btnThree);
		m_allButtons[0][2] = btnThree;

		JButton btnFour = new JButton("");
		frmTicTacToe.getContentPane().add(btnFour);
		m_allButtons[1][0] = btnFour;

		JButton btnFive = new JButton("");
		frmTicTacToe.getContentPane().add(btnFive);
		m_allButtons[1][1] = btnFive;

		JButton btnSix = new JButton("");
		frmTicTacToe.getContentPane().add(btnSix);
		m_allButtons[1][2] = btnSix;

		JButton btnSeven = new JButton("");
		frmTicTacToe.getContentPane().add(btnSeven);
		m_allButtons[2][0] = btnSeven;

		JButton btnEight = new JButton("");
		frmTicTacToe.getContentPane().add(btnEight);
		m_allButtons[2][1] = btnEight;

		JButton btnNine = new JButton("");
		frmTicTacToe.getContentPane().add(btnNine);
		m_allButtons[2][2] = btnNine;

		AddAllEventHandlers();

	}

	private void ChangeButtonText(JButton button)
	{
		if (m_previousPlay !=null)
		{
			if (m_previousPlay.equals("X"))
			{
				button.setText("O");
				m_previousPlay = "O";
			}
			else
			{
				button.setText("X");
				m_previousPlay = "X";
			}
		}

		else
		{
			m_previousPlay = "X";
			button.setText("X");
		}
	}

	private void DisableAllButtons()
	{
		if (m_allButtons !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					m_allButtons[i][j].setEnabled(false);
				}
			}
		}
	}

	private void AddAllEventHandlers()
	{
		if (m_allButtons !=null)
		{
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					JButton button = m_allButtons[i][j];
					button.addActionListener(new ActionListener() 
					{
						public void actionPerformed(ActionEvent arg0) 
						{
							ChangeButtonText(button);
							button.setEnabled(false);
							CheckGameWinner();
						}
					});
				}
			}
		}
	}


	private void CheckGameWinner()
	{
		if (m_allButtons != null)
		{
			for (int i = 0; i < 3; i++)
			{
				String first = m_allButtons[i][0].getText();
				String second = m_allButtons[i][1].getText();
				String third = m_allButtons[i][2].getText();

				boolean allEmpty = first.isEmpty() && second.isEmpty() && third.isEmpty();
				boolean isSame = first.equals(second) && second.equals(third);

				if ((!allEmpty) && (isSame))
				{
					m_allButtons[i][0].setBackground(Color.green);
					m_allButtons[i][1].setBackground(Color.green);
					m_allButtons[i][2].setBackground(Color.green);
					DisableAllButtons();
					break;
				}
			}
			for (int i = 0; i < 3; i++)
			{
				String first = m_allButtons[0][i].getText();
				String second = m_allButtons[1][i].getText();
				String third = m_allButtons[2][i].getText();

				boolean allEmpty = first.isEmpty() && second.isEmpty() && third.isEmpty();
				boolean isSame = first.equals(second) && second.equals(third);

				if ((!allEmpty) && (isSame))
				{
					m_allButtons[0][i].setBackground(Color.green);
					m_allButtons[1][i].setBackground(Color.green);
					m_allButtons[2][i].setBackground(Color.green);
					DisableAllButtons();
					break;
				}
			}


			String first = m_allButtons[0][0].getText();
			String second = m_allButtons[1][1].getText();
			String third = m_allButtons[2][2].getText();

			boolean allEmpty = first.isEmpty() && second.isEmpty() && third.isEmpty();
			boolean isSame = first.equals(second) && second.equals(third);

			if ((!allEmpty) && (isSame))
			{
				m_allButtons[0][0].setBackground(Color.green);
				m_allButtons[1][1].setBackground(Color.green);
				m_allButtons[2][2].setBackground(Color.green);
			}



			String fourth = m_allButtons[0][2].getText();
			String fifth = m_allButtons[1][1].getText();
			String sixth = m_allButtons[2][0].getText();

			boolean allEmptyTwo = fourth.isEmpty() && fifth.isEmpty() && sixth.isEmpty();
			boolean isSameTwo = fourth.equals(fifth) && fifth.equals(sixth);

			if ((!allEmptyTwo) && (isSameTwo))
			{
				m_allButtons[0][2].setBackground(Color.green);
				m_allButtons[1][1].setBackground(Color.green);
				m_allButtons[2][0].setBackground(Color.green);
			}
		}
	}
}