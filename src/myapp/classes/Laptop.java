package myapp.classes;

import myapp.abstracts.Device;
import myapp.interfaces.Workable;

public class Laptop extends Device implements Workable {
    private int ramSize;
    private String processor;

    public int getRamSize() { return ramSize; }
    public void setRamSize(int ramSize) { this.ramSize = ramSize; }

    public String getProcessor() { return processor; }
    public void setProcessor(String processor) { this.processor = processor; }

    @Override
    public void powerOn() {
        System.out.println("Laptop booting...");
    }

    @Override
    public void startWork() {
        System.out.println("Working on laptop...");
    }

    @Override
    public void stopWork() {
        System.out.println("Laptop work stopped.");
    }

    @Override
    public void getStatus() {
        System.out.println("Laptop running status...");
    }
}
