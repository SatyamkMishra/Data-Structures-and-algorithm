import java.util.*;
public class Getters_and_Seters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setName("linc");
        System.out.println(p1.getName());

        p1.setTip(12);
        System.out.println(p1.getTip());
    }
}

class Pen {
    private String name;
    private int tip;

    String getName() {
        return this.name;
    }

    int getTip() {
        return this.tip;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
