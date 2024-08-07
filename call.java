
class Inheritance {
    int manHand = 2;

    public static void walk() {
        System.out.println("I am Walking");
    }

    public static void Angry() {
        System.out.println("I am Angry");
    }
}

class Girl extends Inheritance {
    boolean canSleep = true;
}

public class call {
    public static void main(String[] args) {
        Inheritance in1 = new Inheritance();
        System.out.println(in1.manHand);
        in1.walk();
        in1.Angry();
    }
}


