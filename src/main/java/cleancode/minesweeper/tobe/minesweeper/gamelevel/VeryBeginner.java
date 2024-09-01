package cleancode.minesweeper.tobe.minesweeper.gamelevel;

public class VeryBeginner implements GameLevel {

    @Override
    public int getRowSize() {
        return 4;
    }

    @Override
    public int getColSize() {
        return 5;
    }

    @Override
    public int getLandMineCounts() {
        return 2;
    }
}
