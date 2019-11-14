package com;

import java.util.concurrent.Semaphore;

public class Ship implements Runnable {
    public static final int MAX_CONTAINERS = 100;
    private static int nextID = 0;
    private int containers;
    private String name;
    private Semaphore semaphore;
    private int ID;
    private boolean isEmpty;

    public Ship(int containers, Semaphore semaphore) {
        ID = ++nextID;
        this.containers = containers;
        this.semaphore = semaphore;
        name = "Ship" + ID;
        isEmpty = (containers == 0);
        new Thread(this).start();
    }

    private boolean load() {
        if (Dock.getContainers() == 0) {
            System.out.println("Dock is empty!");
            return false;
        }
        containers = Math.min(Dock.getContainers(), MAX_CONTAINERS);
        Dock.setContainers(Dock.getContainers() - containers);
        isEmpty = false;
        return true;
    }

    private boolean unload() {
        if (Dock.getContainers() + containers > Dock.MAX_CONTAINERS) {
            System.out.println("Dock if full!");
            return false;
        }
        Dock.setContainers(Dock.getContainers() + containers);
        containers = 0;
        isEmpty = true;
        return true;
    }

    public void run() {
        try {
            for (int i=0; i<3; ++i) {
                semaphore.acquire();
                System.out.println(name + " with " + containers + " containers");
                if (isEmpty) {
                    if (load())
                        System.out.println(name + " loaded successfully");
                } else {
                    if (unload())
                        System.out.println(name + " unloaded successfully");
                }
                System.out.println("Now " + name + " contains " + containers + " containers");
                System.out.println("Containers in the dock: " + Dock.getContainers() + "\n");
                semaphore.release();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
