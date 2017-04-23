package za.co.astar.api;

public class Position {
	private int row, column;
    private String value;
    private boolean isChecked, isBlockedThisWay;
    private Position parent;
    private int F, G, H;

    public Position(int row, int column, String value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Position getParent() {
        return parent;
    }

    public void setParent(Position parent) {
        this.parent = parent;
    }

    public int getF() {
        return F;
    }

    public void setF() {
        F = G + H;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public void setH(int h) {
        H = h;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if(!(obj instanceof  Position))
            return false;

        Position matrixPosition = (Position) obj;
        return getRow() == matrixPosition.getRow() &&
                getColumn() == matrixPosition.getColumn() &&
                getValue().equals(matrixPosition.getValue());
    }
}
