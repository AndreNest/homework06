public class Laptop {
    private int id;
    private String brand;
    private String model;
    private String processor;
    private float ram;
    private int hdd;
    private int prise;
    private String os;
    private String color;

    public Laptop(int id, String brand, String model, String processor, float ram, int hdd, int prise, String os, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.prise = prise;
        this.os = os;
        this.color = color;
    }

    public Laptop(){

    }
    public void printBrand(String text){
        if(brand == text){
            System.out.println(toString());
        }
    }

    @Override
    public String toString() {
        return "\nПроизводитель = " + brand  +
                "\tмодель = " + model +
                "\tоперационная система = " + os  +
                "\nпроцессор = " + processor +
                "\tОЗУ= " + ram +
                "\thdd= " + hdd +
                "\tцена= " + prise +
                "\tcolor= " + color +"\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
