public class criteriaNoteBook {
    private int id;
    private String name;
    private int price;
    private String processor;
    private int RAM;
    private int HDD;
    private int Screen;
    private String color;
    private String os;


    public criteriaNoteBook(int id, String name, int price, String processor, int RAM, int HDD, int Screen, String color, String os) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.Screen = Screen;
        this.color = color;
        this.os = os;
    }
    

    @Override
    public String toString() {
        return String.format("%d Модель: %s Цена: %d руб. Процессор: %s ОЗУ: %d Gb Объем диска: %d Gb Размер экран: %d '' Цвет: %s ОС: %s", id, name, price, processor, RAM, HDD, Screen, color, os);
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHDD() {
        return HDD;
    }
    public int getScreen() {
        return Screen;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }
}