abstract class Footballer {
    private String name;
    private int age;

    public Footballer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getPlayerType();

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Player Type: " + getPlayerType());
    }
}

class Player1 extends Footballer {
    public Player1(String name, int age) {
        super(name, age);
    }

    @Override
    public String getPlayerType() {
        return "GOAT";
    }
}

class Player2 extends Footballer {
    public Player2(String name, int age) {
        super(name, age);
    }

    @Override
    public String getPlayerType() {
        return "Regular Player";
    }
}

class Player3 extends Footballer {
    public Player3(String name, int age) {
        super(name, age);
    }

    @Override
    public String getPlayerType() {
        return "Regular Player";
    }
}

public class Main {
    public static void main(String[] args) {
        Player1 f1 = new Player1("Cristiano Ronaldo", 36);
        f1.printDetails();

        Player2 f2 = new Player2("Neymar Jr.", 29);
        f2.printDetails();

        Player3 f3 = new Player3("Kevin De Bruyne", 30);
        f3.printDetails();
    }
}
