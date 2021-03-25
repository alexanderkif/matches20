package com.company;

public class ConsoleMessage implements Messages {

    public ConsoleMessage() {
    }

    public void printMatchesOnTheTable(int matches) {
        System.out.println("На столе осталось " + matches + " спичек.");
    }

    public void printComputerTakesMatches(int matches) {
        System.out.println(" - Количество выбранных компьютером спичек = " + matches + ".");
    }

    public void printPlayersMove() {
        System.out.print(" - Ход игрока. Введите количество спичек: ");
    }

    public void printComputerWins() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

    public void printWrongUserInputMatches() {
        System.out.println("Допустимо брать от одной до трех спичек.");
    }
}
