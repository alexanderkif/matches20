package com.company;

import java.util.Scanner;

public class Game {

    private static final int MATCHES_AT_START = 20;
    private static final int MATCHES_INITIAL_MOVE = 1;

    private final Computer computer;
    private final Messages consoleMessage;
    private final Scanner scanner;

    private int matches;
    private int matchesCurrentPlayerMove;

    public Game() {
        matches = MATCHES_AT_START;
        computer = new ComputerSimple();
        consoleMessage = new ConsoleMessage();
        scanner = new Scanner(System.in);
        initialMove();
        runGame();
    }

    private void initialMove() {
        computerMove(MATCHES_INITIAL_MOVE);
    }

    private void runGame() {
        while (matches > 1) {
            playerMove();
            computerMove(matchesCurrentPlayerMove);
        }
        consoleMessage.printComputerWins();
    }

    private void computerMove(int matchesCurrentPlayerMove) {
        consoleMessage.printMatchesOnTheTable(matches);
        matches -= computer.getMatchesToMoveByUserMatchesMoveCount(matchesCurrentPlayerMove);
    }

    private void playerMove() {
        consoleMessage.printMatchesOnTheTable(matches);
        consoleMessage.printPlayersMove();
        matchesCurrentPlayerMove = scanner.nextInt();
        if (matchesCurrentPlayerMove < 1 || matchesCurrentPlayerMove > 3) {
            consoleMessage.printWrongUserInputMatches();
            playerMove();
        } else {
            matches -= matchesCurrentPlayerMove;
        }
    }
}
