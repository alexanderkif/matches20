package com.company;

public interface Computer {
    default int getMatchesToMoveByUserMatchesMoveCount(int matches) {
        return matches;
    }
}
