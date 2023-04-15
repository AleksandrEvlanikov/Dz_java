package taskDz6Java;

public class Laptop {
    public int RAM;
    public int memory;
    public String brand;
    public boolean windowsInstalled;

    public Laptop(int RAM, int memory, String brand, boolean windowsInstalled) {
        this.RAM = RAM;
        this.memory = memory;
        this.brand = brand;
        this.windowsInstalled = windowsInstalled;
    }

    public Laptop(int RAM, int memory, String brand) {
        this.RAM = 6;
        this.memory = 250;
        this.brand = "Lenova";
        this.windowsInstalled = true;

    }

    @Override
    public String toString() {
        return String.format("Кол-во ОП = %dгб, Колво-во памяти = %dгб, Название производителя = %s, Установлен виндовс = %s",
                RAM, memory, brand, windowsInstalled);
    }
}
