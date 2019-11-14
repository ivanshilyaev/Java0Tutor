package com;

public class Dock {
    public static final int MAX_CONTAINERS = 1000;
    private static int containers;

    public static int getContainers() {
        return containers;
    }

    public static void setContainers(int containers) {
        Dock.containers = containers;
    }
}
