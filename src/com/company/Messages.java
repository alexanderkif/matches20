package com.company;

public interface Messages {

    default void printMatchesOnTheTable(int matches) {}

    default void printComputerTakesMatches(int matches) {}

    default void printPlayersMove() {}

    default void printComputerWins() {}

    default void printWrongUserInputMatches() {}
}
