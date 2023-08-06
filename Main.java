package OwnPractice.tictactoe;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class TicTacToe implements ActionListener {
    static int count = 9;
    static int win = 0;
    JFrame jframe = new JFrame();
    JButton []buttons = new JButton[9];
    JButton reset = new JButton("Reset Game");
    JLabel name = new JLabel("Tic-Tac-Toe");
    JPanel jpnel = new JPanel();
    JLabel player1 = new JLabel("Player 1:  (X)");
    JLabel player2 = new JLabel("Player 2:  (O)");
    JLabel move = new JLabel("Player 1's move");
    JLabel winner = new JLabel("");
    public TicTacToe(){
        jframe.setLocation(50,50);
        jframe.setSize(600,700);
        jframe.setTitle("Tic-Tac-Toe");
        jframe.setResizable(false);
        jframe.getContentPane().setBackground(Color.decode("#2EFEC8"));
        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton();
        }
        buttons[0].setBounds(150,200,100,100);
        buttons[1].setBounds(250,200,100,100);
        buttons[2].setBounds(350,200,100,100);
        buttons[3].setBounds(150,300,100,100);
        buttons[4].setBounds(250,300,100,100);
        buttons[5].setBounds(350,300,100,100);
        buttons[6].setBounds(150,400,100,100);
        buttons[7].setBounds(250,400,100,100);
        buttons[8].setBounds(350,400,100,100);
        for(int i = 0; i < 9; i++){
            buttons[i].setBorder(new LineBorder(Color.BLACK, 2));
            buttons[i].setBackground(Color.darkGray);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].addActionListener(this::actionPerformed);
            jframe.add(buttons[i]);
            buttons[i].setFocusPainted(false);
        }
        player1.setBounds(170,100,200,25);
        player2.setBounds(350,100,200,25);
        move.setBounds(215,150,200,30);
        player1.setFont(new Font("Cascadia Code",Font.BOLD,15));
        player2.setFont(new Font("Cascadia Code",Font.BOLD,15));
        move.setFont(new Font("Cascadia Code",Font.BOLD,25));

        winner.setBounds(230,520,200,50);
        winner.setFont(new Font("Times New Roman",Font.BOLD,25));
        reset.setBounds(210,580,180,50);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.WHITE);
        reset.setBorder(new LineBorder(Color.BLACK, 2));

        reset.setFocusPainted(false);
        reset.setFont(new Font("Times New Roman",Font.BOLD,20));
        reset.addActionListener(this::actionPerformed);
        name.setBounds(200,-10,300,100);
        name.setFont(new Font("Times New Roman",Font.BOLD,40));

        jpnel.setOpaque(true);
        jframe.add(reset);
        jframe.add(player1);
        jframe.add(player2);
        jframe.add(move);
        jframe.add(winner);
        jframe.add(jpnel);
        jframe.add(name);
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        DoesItMatch doesItMatch = new DoesItMatch();
        for (int i = 0; i < 9; i++){
            if(e.getSource() == reset){
                reset.setText("Reset Game");
                for(int j = 0; j < 9; j++) {
                    buttons[j].setText("");
                    buttons[j].setBackground(Color.darkGray);
                    buttons[i].setForeground(Color.WHITE);
                }
                winner.setText("");
                win = 0;
                count = 9;
                move.setText("Player 1's move");
            }
            else if (e.getSource() != reset && win!=1){
                if(e.getSource() == buttons[i] && buttons[i].getText() == "" && count%2 != 0){
                    buttons[i].setFont(new Font("Sans",Font.PLAIN,50));
                    buttons[i].setText("X");
                    move.setText("Player 2's move");
                    if(doesItMatch.check(this) == true){
                        winner.setBounds(230,520,200,50);
                        winner.setText("Player 1 wins!");
                        win = 1;
                        count = 9;
                        break;
                    }
                    count--;
                }
                else if(e.getSource() == buttons[i] && buttons[i].getText() == "" && count%2 == 0){
                    buttons[i].setFont(new Font("Sans",Font.PLAIN,50));
                    buttons[i].setText("O");
                    move.setText("Player 1's move");
                    if(doesItMatch.check(this) == true){
                        winner.setBounds(230,520,200,50);
                        winner.setText("Player 2 wins!");
                        win = 1;
                        count = 9;
                        break;
                    }
                    count--;
                }
            }
        }
        if(win == 0 && count==0){
            winner.setBounds(270,520,200,50);
            winner.setText("Draw!");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        new TicTacToe();
    }
}