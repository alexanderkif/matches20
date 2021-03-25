package com.company;

public class ComputerSimple implements Computer {

    private final ConsoleMessage consoleMessage;

    public ComputerSimple() {
        consoleMessage = new ConsoleMessage();
    }

    public int getMatchesToMoveByUserMatchesMoveCount(int matches) {
        consoleMessage.printComputerTakesMatches(4 - matches);
        return 4 - matches;
    }
}
