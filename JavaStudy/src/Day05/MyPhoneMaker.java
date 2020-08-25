package Day05;

public class MyPhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.hasFigurePrintUnlocker = true;
        phone.price = 1999;
        phone.screnn = new Screnn();
        phone.screnn.producer = "京东方";
        phone.screnn.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer ="三星";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.producer = "三星";
        memory.capacity = 4;

        Storage storage = new Storage();
        storage.producer = "Intel";
        storage.capacity = 128;

        phone.mainboard = new Mainboard();

        phone.mainboard.cpu = cpu;
        phone.mainboard.memory = memory;
        phone.mainboard.storage = storage;

        phone.mainboard.model = "E8888";
        phone.mainboard.year = 2019;
        
    }
}
