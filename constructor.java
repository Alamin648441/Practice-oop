class info {
    String name, gender;
    int roll;

    info(String n, String g, int r) {
        name = n;
        gender = g;
        roll = r;
    }
    void Display() {
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("roll:" + roll);
    }
}
public class constructor {
    public static void main(String[] args) {
        info obj = new info("alamin", "male", 0100);
        obj.Display();

    }

}
