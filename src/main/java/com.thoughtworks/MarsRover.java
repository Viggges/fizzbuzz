package com.thoughtworks;

public class MarsRover {

    int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    enum Direction {
        N, E, S, W
    }

    Direction[] endDirection = Direction.values();
    final static String MOVE = "M";
    final static String LEFT = "L";
    final static String RIGHT = "R";
    int orientation;
    MarsRoverPosition marsRoverPosition;
    SafeZone safeZone;

    public void initPosition(int x, int y, String direct) {
        marsRoverPosition = new MarsRoverPosition(x, y, direct);
        this.orientation = Direction.valueOf(direct).ordinal();
    }

    public void initSafeZone(int length, int width) {
        safeZone = new SafeZone(length, width);
    }

    public String parse(String moveOrder) {
        return moveOrder;
    }

    public String execute(String moveOrder) {
        int nowIndex = 0;
        while (moveOrder.length() > nowIndex) {
            char nowOrder = moveOrder.charAt(nowIndex);
            if (MOVE.equals(String.valueOf(nowOrder))) {
                if (!move()) {
                    break;
                }
            }
            if (LEFT.equals(String.valueOf(nowOrder))) {
                turnLeft();
            }
            if (RIGHT.equals(String.valueOf(nowOrder))) {
                turnRight();
            }
            nowIndex++;
        }
        Direction[] endDirection = Direction.values();
        marsRoverPosition.setOrientation(endDirection[orientation].name());
        return "(" + marsRoverPosition.getX() + "," + marsRoverPosition.getY() + ")" + marsRoverPosition.getOrientation();
    }

    private void turnLeft() {
        orientation = (orientation - 1 + 4) % 4;
    }

    private void turnRight() {
        orientation = (orientation + 1) % 4;
    }

    private boolean move() {
        if (checkSafe()) {
            marsRoverPosition.setX(marsRoverPosition.getX() + dir[orientation][0]);
            marsRoverPosition.setY(marsRoverPosition.getY() + dir[orientation][1]);
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSafe() {
        int soonX = marsRoverPosition.getX() + dir[orientation][0];
        int soonY = marsRoverPosition.getY() + dir[orientation][1];
        return safeZone.getWidth() >= Math.abs(soonX) && safeZone.getLength() >= Math.abs(soonY);
    }

    public String format(String result) {
        return result;
    }
}
