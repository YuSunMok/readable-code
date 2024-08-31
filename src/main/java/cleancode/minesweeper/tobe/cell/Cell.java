package cleancode.minesweeper.tobe.cell;

public interface Cell {

    static final String FLAG_SIGN = "⚑";
    static final String UNCHECKED_SIGN = "□";

    boolean isLandMine();

    boolean hasLandMineCount();

    String getSign();

    public void flag();

    public void open();

    public boolean isChecked();

    public boolean isOpened();
}
