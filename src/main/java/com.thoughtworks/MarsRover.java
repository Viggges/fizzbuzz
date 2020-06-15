package com.thoughtworks;

public class MarsRover {

    int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    String direction = "NESW";
    String order = "MLR";
    int x, y;
    int orientation;

    public void init(int x, int y, String direct) {
        this.x = x;
        this.y = y;
        this.orientation = direction.indexOf(direct);
    }

    public String parse(String moveOrder) {
        return moveOrder;
    }

    public String execute(String moveOrder) {
        int nowIndex = 0;
        while (moveOrder.length() > nowIndex) {
            char nowOrder = moveOrder.charAt(nowIndex);
            if (order.indexOf(nowOrder) == 0) {
                move();
            }
            if (order.indexOf(nowOrder) == 1) {
                turnLeft();
            }
            if (order.indexOf(nowOrder) == 2) {
                turnRight();
            }
            nowIndex++;
        }
        return "(" + x + "," + y + ")" + direction.charAt(orientation);
    }

    private void turnLeft() {
        orientation = (orientation - 1 + 4) % 4;
    }

    private void turnRight() {
        orientation = (orientation + 1) % 4;
    }

    public void move() {
        this.x += dir[orientation][0];
        this.y += dir[orientation][1];
    }

    public String format(String result) {
        return result;
    }
}
