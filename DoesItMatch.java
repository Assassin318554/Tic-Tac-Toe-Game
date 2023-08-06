package OwnPractice.tictactoe;

import java.awt.*;

public class DoesItMatch {
    boolean check(TicTacToe ticTacToe) {
        if (ticTacToe.buttons[0].getText() != "" && ticTacToe.buttons[0].getText() == ticTacToe.buttons[1].getText() &&
                ticTacToe.buttons[1].getText() == ticTacToe.buttons[2].getText()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[1].setBackground(Color.blue);
            ticTacToe.buttons[2].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[3].getText() != "" && ticTacToe.buttons[3].getText() == ticTacToe.buttons[4].getText() &&
                ticTacToe.buttons[4].getText() == ticTacToe.buttons[5].getText()) {
            ticTacToe.buttons[3].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[5].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[6].getText() != "" && ticTacToe.buttons[6].getText() == ticTacToe.buttons[7].getText() &&
                ticTacToe.buttons[7].getText() == ticTacToe.buttons[8].getText()) {
            ticTacToe.buttons[6].setBackground(Color.blue);
            ticTacToe.buttons[7].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[0].getText() != "" && ticTacToe.buttons[0].getText() == ticTacToe.buttons[3].getText() &&
                ticTacToe.buttons[3].getText() == ticTacToe.buttons[6].getText()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[3].setBackground(Color.blue);
            ticTacToe.buttons[6].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[1].getText() != "" && ticTacToe.buttons[1].getText() == ticTacToe.buttons[4].getText() &&
                ticTacToe.buttons[4].getText() == ticTacToe.buttons[7].getText()) {
            ticTacToe.buttons[1].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[7].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[2].getText() != "" && ticTacToe.buttons[2].getText() == ticTacToe.buttons[5].getText() &&
                ticTacToe.buttons[5].getText() == ticTacToe.buttons[8].getText()) {
            ticTacToe.buttons[2].setBackground(Color.blue);
            ticTacToe.buttons[5].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[0].getText() != "" && ticTacToe.buttons[0].getText() == ticTacToe.buttons[4].getText() &&
                ticTacToe.buttons[4].getText() == ticTacToe.buttons[8].getText()) {
            ticTacToe.buttons[0].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[8].setBackground(Color.blue);
            return true;
        } else if (ticTacToe.buttons[2].getText() != "" && ticTacToe.buttons[2].getText() == ticTacToe.buttons[4].getText() &&
                ticTacToe.buttons[4].getText() == ticTacToe.buttons[6].getText()) {
            ticTacToe.buttons[2].setBackground(Color.blue);
            ticTacToe.buttons[4].setBackground(Color.blue);
            ticTacToe.buttons[6].setBackground(Color.blue);
            return true;
        } else {
            return false;
        }
    }
}
