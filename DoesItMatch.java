package DewanSir.tictactoe;

import java.awt.*;

public class DoesItMatch {
    boolean check(TicTacToe ticTacToe) {
        if (ticTacToe.buttons[0].getLabel() != "" && ticTacToe.buttons[0].getLabel() == ticTacToe.buttons[1].getLabel() &&
                ticTacToe.buttons[1].getLabel() == ticTacToe.buttons[2].getLabel()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[1].setBackground(Color.blue);
            ticTacToe.buttons[2].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[3].getLabel() != "" && ticTacToe.buttons[3].getLabel() == ticTacToe.buttons[4].getLabel() &&
                ticTacToe.buttons[4].getLabel() == ticTacToe.buttons[5].getLabel()) {
            ticTacToe.buttons[3].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[5].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[6].getLabel() != "" && ticTacToe.buttons[6].getLabel() == ticTacToe.buttons[7].getLabel() &&
                ticTacToe.buttons[7].getLabel() == ticTacToe.buttons[8].getLabel()) {
            ticTacToe.buttons[6].setBackground(Color.blue);
            ticTacToe.buttons[7].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[0].getLabel() != "" && ticTacToe.buttons[0].getLabel() == ticTacToe.buttons[3].getLabel() &&
                ticTacToe.buttons[3].getLabel() == ticTacToe.buttons[6].getLabel()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[3].setBackground(Color.blue);
            ticTacToe.buttons[6].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[1].getLabel() != "" && ticTacToe.buttons[1].getLabel() == ticTacToe.buttons[4].getLabel() &&
                ticTacToe.buttons[4].getLabel() == ticTacToe.buttons[7].getLabel()) {
            ticTacToe.buttons[1].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[7].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[2].getLabel() != "" && ticTacToe.buttons[2].getLabel() == ticTacToe.buttons[5].getLabel() &&
                ticTacToe.buttons[5].getLabel() == ticTacToe.buttons[8].getLabel()) {
            ticTacToe.buttons[2].setBackground(Color.blue);
            ticTacToe.buttons[5].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[0].getLabel() != "" && ticTacToe.buttons[0].getLabel() == ticTacToe.buttons[4].getLabel() &&
                ticTacToe.buttons[4].getLabel() == ticTacToe.buttons[8].getLabel()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[2].getLabel() != "" && ticTacToe.buttons[2].getLabel() == ticTacToe.buttons[4].getLabel() &&
                ticTacToe.buttons[4].getLabel() == ticTacToe.buttons[6].getLabel()) {
            ticTacToe.buttons[2].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[6].setBackground(Color.blue);
            return true;
        } else {
            return false;
        }
    }
}
