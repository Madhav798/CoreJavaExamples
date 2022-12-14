package practicejava.core.exp;

public class DogBehavior {
    private int eyes = 2;
    private int ears = 2;
    private int nose = 1;
    private int legs = 4;
    private int tail = 1;

    public void seeing() {
        System.out.println("Dog Seeing The TREE");
    }

    public void listening() {
        System.out.println("Dog Listening The Sounds");
    }

    public void smelling() {
        System.out.println("Dog Smell The Soil");
    }

    public void walking() {
        System.out.println("Dog Step By Step Walking");
    }

    public void moving() {
        System.out.println("Dog Moving The Tail");
    }

    DogBehavior() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        DogBehavior db = new DogBehavior();
        db.seeing();
        db.listening();
        db.smelling();
        db.walking();
        db.moving();
        System.out.println("db.how many eyes="+db.eyes);
        System.out.println("db.how many ears="+db.ears);
        System.out.println("db.how many nose="+db.nose);
        System.out.println("db.how many legs="+db.legs);
        System.out.println("db.how many tail="+db.tail);
    }
}
