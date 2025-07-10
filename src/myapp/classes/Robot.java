package myapp.classes;

import myapp.interfaces.Workable;
import myapp.interfaces.Storable;

public class Robot implements Workable, Storable {
    private String id;
    private String task;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTask() { return task; }
    public void setTask(String task) { this.task = task; }

    @Override
    public void startWork() {
        System.out.println("Robot starting task...");
    }

    @Override
    public void stopWork() {
        System.out.println("Robot stopped task.");
    }

    @Override
    public void getStatus() {
        System.out.println("Robot status OK.");
    }

    @Override
    public void store() {
        System.out.println("Robot data stored.");
    }

    @Override
    public void retrieve() {
        System.out.println("Robot data retrieved.");
    }

    @Override
    public void delete() {
        System.out.println("Robot data deleted.");
    }
}
