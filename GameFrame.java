import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GameFrame extends JFrame {

	private JPanel contentPane;
	private Button b1;
	private Button b2;
	private Button b4;
	private Button b5;
	private Button b3;
	private Button b6;
	private Button b7;
	private Button b8;
	private Button b9;
	private JLabel lblPoints;
	private JLabel lblX;
	private JLabel lblO;
	private JTextField txtX;
	private JTextField txtY;
	private JButton btnReset;
	private GameFrame f;
	private JLabel lblTurn;
	private JTextField turn;
	private GameCode g;
	private int count;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public GameFrame() {
		
		count=0;
		g=new GameCode();
		f=this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 394);
		this.setTitle("GAME");
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTictactoe = new JLabel("TIC-TAC-TOE");
		lblTictactoe.setForeground(Color.BLACK);
		lblTictactoe.setBounds(138, 11, 235, 52);
		lblTictactoe.setFont(new Font("Tahoma", Font.BOLD, 34));
		
		b1 = new Button("");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLACK);
		b1.setBounds(24, 105, 78, 78);
		b1.setFont(new Font("Dialog", Font.PLAIN, 61));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				b1.setLabel(turn.getText());
				b1.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(0, 0, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(0, 0, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
						
			}
		});
		
		b2 = new Button("");
		b2.setBackground(Color.WHITE);
		b2.setBounds(108, 105,  78, 78);
		b2.setFont(new Font("Dialog", Font.PLAIN, 61));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b2.setLabel(turn.getText());
				b2.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(0, 1, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(0, 1, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b4 = new Button("");
		b4.setBackground(Color.WHITE);
		b4.setBounds(24, 189,  78, 78);
		b4.setFont(new Font("Dialog", Font.PLAIN, 61));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b4.setLabel(turn.getText());
				b4.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(1, 0, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(1, 0, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b5 = new Button("");
		b5.setBackground(Color.WHITE);
		b5.setBounds(108, 189, 78, 78);
		b5.setFont(new Font("Dialog", Font.PLAIN, 61));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b5.setLabel(turn.getText());
				b5.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(1, 1, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(1, 1, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b3 = new Button("");
		b3.setBackground(Color.WHITE);
		b3.setBounds(192, 105,  78, 78);
		b3.setFont(new Font("Dialog", Font.PLAIN, 61));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b3.setLabel(turn.getText());
				b3.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(0, 2, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(0, 2, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b6 = new Button("");
		b6.setBackground(Color.WHITE);
		b6.setBounds(192, 189, 78, 78);
		b6.setFont(new Font("Dialog", Font.PLAIN, 61));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b6.setLabel(turn.getText());
				b6.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(1, 2, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(1, 2, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b7 = new Button("");
		b7.setBackground(Color.WHITE);
		b7.setBounds(24, 273,  78, 78);
		b7.setFont(new Font("Dialog", Font.PLAIN, 61));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b7.setLabel(turn.getText());
				b7.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(2, 0, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(2, 0, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b8 = new Button("");
		b8.setBackground(Color.WHITE);
		b8.setBounds(108, 273,  78, 78);
		b8.setFont(new Font("Dialog", Font.PLAIN, 61));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b8.setLabel(turn.getText());
				b8.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(2, 1, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(2, 1, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		b9 = new Button("");
		b9.setBackground(Color.WHITE);
		b9.setBounds(192, 273,  78, 78);
		b9.setFont(new Font("Dialog", Font.PLAIN, 61));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b9.setLabel(turn.getText());
				b9.disable();
				count++;
				if(count%2!=0)
				{
					
					if(g.checkWin(2, 2, 1))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtX.setText(Integer.parseInt(txtX.getText())+1+"");
						init();
					}
					else
					turn.setText("O");
				}
				else
				{
					
					if(g.checkWin(2, 2, 2))
					{
						JOptionPane.showMessageDialog(GameFrame.this,turn.getText()+" wins");
						txtY.setText(Integer.parseInt(txtY.getText())+1+"");
						init();
					}
					else
					turn.setText("X");
				}
				if(count==9)
				{
					JOptionPane.showMessageDialog(GameFrame.this,"DRAW");
					init();
				}
			}
		});
		
		lblPoints = new JLabel("POINTS");
		lblPoints.setForeground(Color.BLACK);
		lblPoints.setBounds(359, 105, 91, 24);
		lblPoints.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		lblX = new JLabel("X");
		lblX.setForeground(Color.BLACK);
		lblX.setBounds(338, 157, 27, 24);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 23));
		contentPane.setLayout(null);
		contentPane.add(b4);
		contentPane.add(b1);
		contentPane.add(b7);
		contentPane.add(b8);
		contentPane.add(b9);
		contentPane.add(b5);
		contentPane.add(b6);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(lblPoints);
		contentPane.add(lblX);
		contentPane.add(lblTictactoe);
		
		lblO = new JLabel("O");
		lblO.setForeground(Color.BLACK);
		lblO.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblO.setBounds(338, 213, 27, 24);
		contentPane.add(lblO);
		txtX = new JTextField();
		txtX.setText("0");
		txtX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtX.setBounds(375, 157, 78, 26);
		txtX.setEditable(false);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		
		txtY = new JTextField();
		txtY.setText("0");
		txtY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtY.setColumns(10);
		txtY.setBounds(375, 213, 78, 26);
		txtY.setEditable(false);
		contentPane.add(txtY);
		
		btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtX.setText("0");
				txtY.setText("0");
				init();
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(364, 292, 89, 32);
		contentPane.add(btnReset);
		
		lblTurn = new JLabel("Turn:");
		lblTurn.setForeground(new Color(0, 0, 102));
		lblTurn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTurn.setBounds(106, 74, 46, 14);
		contentPane.add(lblTurn);
		
		turn = new JTextField();
		turn.setText("X");
		turn.setFont(new Font("Tahoma", Font.BOLD, 16));
		turn.setBounds(148, 68, 19, 25);
		turn.setEditable(false);
		contentPane.add(turn);
		turn.setColumns(10);
		
		
	}
	
	public void init()
	{
		count=0;
		b1.setLabel("");
		b1.enable();
		b2.setLabel("");
		b2.enable();
		b3.setLabel("");
		b3.enable();
		b4.setLabel("");
		b4.enable();
		b5.setLabel("");
		b5.enable();
		b6.setLabel("");
		b6.enable();
		b7.setLabel("");
		b7.enable();
		b8.setLabel("");
		b8.enable();
		b9.setLabel("");
		b9.enable();
		turn.setText("X");
		
		g.init();
	
		
		
	}
}
