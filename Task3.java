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

public class Task3 {
    public static void main(String[] args) {
        Player1 f1 = new Player1("Lionel Messi", 36);
        System.out.println("Name: " + f1.getName());
        System.out.println("Age: " + f1.getAge());
        System.out.println(f1.getPlayerType());

        Player2 f2 = new Player2("Rodrigo D Paul", 29);
        System.out.println("Name: " + f2.getName());
        System.out.println("Age: " + f2.getAge());
        System.out.println(f2.getPlayerType());

        Player3 f3 = new Player3("Emi Martinez", 30);
        System.out.println("Name: " + f3.getName());
        System.out.println("Age: " + f3.getAge());
        System.out.println(f3.getPlayerType());
    }
}
