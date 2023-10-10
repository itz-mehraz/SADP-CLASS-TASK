class CPU {
    public void start() {
        System.out.println("CPU is starting");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory is loading data");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("Hard Drive is reading data");
    }
}


class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.readData();
        System.out.println("Computer is started and ready to use");
    }
}


public class Main {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}
