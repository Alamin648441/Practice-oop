class Super {
    String name = "Alamin";
    String Semester = "4th";

    public void info() {
        System.out.printf("Name :%s\nSemester :%s", name, Semester);
    }
}

class child extends Super {
    int roll = 648441;

    public void show() {
        info();
        System.out.printf("\nRoll :%d", roll);
    }
}

class otherChild extends child {
    String shift = "2nd";

    public void fullData() {
        show();
        System.out.printf("\nShift :%s", shift);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        otherChild ob = new otherChild();
        ob.fullData();
    }

}
