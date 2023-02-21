import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop appleair = new Laptop(1, "Apple", "MacBook Air M1 2020", "Apple M1 silicon", 8.0f, 256, 99990, "MacOS", "Silver");
        Laptop appleair2 = new Laptop(2, "Apple", "MacBook Air M1 2022", "Apple M2 silicon", 16.0f, 512, 135990, "MacOS", "SpaceGray");
        Laptop razer01 = new Laptop(3, "Razer", "Razer 777", "Intel i9", 32.0f, 2048, 210000, "Windows", "White");
        Laptop lemovo = new Laptop(4, "Lenovo", "lk352", "Intel i3", 4.0f, 512, 37990, "Windows", "Black");
        Laptop xiaomi = new Laptop(5, "Xiaomi", "3785676", "intel i5", 8.0f, 256, 65990, "Windows", "Silver");
        List<Laptop> allLaptop = List.of(appleair, appleair2, razer01, lemovo, xiaomi);
        boolean flag = true;
        while (flag) {
            System.out.println("0 - показать весь перечень ноутбуков! \n1 - Производитель \\ 2 - Операционная система \\ 3 - Обьем ОЗУ \\ 4 - обьем накопителя \\ 5 - цена");
            System.out.println("По какому критерию вы хотите выбрать ноутбук? ");
            System.out.print("Введите цифру для выбора: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 0: {
                    System.out.println(allLaptop);
                    break;
                }
                case 1: {
                    System.out.print("Ноутбуки каких производителей показать? \n 1 - Apple 2 - Razer 3 - Lenovo 4 - Xiaomi \n 5 - выйти в главное меню!\nСделайте выбор: ");
                    int num = sc.nextInt();
                    boolean flag1 = true;
                    while (flag1) {
                        switch (num) {
                            case 1:
                                for (Laptop brand : allLaptop) {
                                    if (brand.getBrand() == "Apple") System.out.println(brand.toString());
                                }
                                flag1 = false;
                                System.out.println();
                                break;
                            case 2:
                                for (Laptop brand : allLaptop) {
                                    if (brand.getBrand() == "Razer") System.out.println(brand.toString());
                                }
                                flag1 = false;
                                System.out.println();
                                break;
                            case 3:
                                for (Laptop brand : allLaptop) {
                                    if (brand.getBrand() == "Lenovo") System.out.println(brand.toString());
                                }
                                flag1 = false;
                                System.out.println();
                                break;
                            case 4:
                                for (Laptop brand : allLaptop) {
                                    if (brand.getBrand() == "Xiaomi") System.out.println(brand.toString());
                                }
                                flag1 = false;
                                System.out.println();
                                break;
                            case 5:
                                flag1 = false;
                                System.out.println();
                                break;
                        }
                    }
                }
                case 2:
                    System.out.print("Ноутбуки с какой операционной системой показать?? \n 1 - MacOS  2 - Windows  \n 3 - выйти в главное меню!\nСделайте выбор: ");
                    int num = sc.nextInt();
                    boolean flag2 = true;
                    switch (num) {
                        case 1:
                            for (Laptop os : allLaptop) {
                                if (os.getOs() == "MacOS") System.out.println(os.toString());
                            }
                            flag2 = false;
                            System.out.println();
                            break;
                        case 2:
                            for (Laptop os : allLaptop) {
                                if (os.getOs() == "Windows") System.out.println(os.toString());
                            }
                            flag2 = false;
                            System.out.println();
                            break;
                        case 3:
                            flag2 = false;
                            System.out.println();
                            break;
                    }
                case 3:
                    System.out.print("Какой обьем оперативной памяти необходим? \n Введите число в диапозоне от 4 до 64: ");
                    int num1 = sc.nextInt();
                    if (num1 > 0 && num1 < 5) {
                        for (Laptop ram : allLaptop) {
                            if (ram.getRam() == 1 || ram.getRam() == 2 || ram.getRam() == 3 || ram.getRam() == 4)
                                System.out.println(ram.toString());
                        }
                    } else if (num1 > 4 && num1 < 9) {
                        for (Laptop ram : allLaptop) {
                            if (ram.getRam() == 5 || ram.getRam() == 6 || ram.getRam() == 7 || ram.getRam() == 8)
                                System.out.println(ram.toString());
                        }
                    } else if (num1 > 8 && num1 < 17) {
                        for (Laptop ram : allLaptop) {
                            if (ram.getRam() == 9 || ram.getRam() == 10 || ram.getRam() == 11 || ram.getRam() == 12 || ram.getRam() == 13 || ram.getRam() == 14 || ram.getRam() == 15 || ram.getRam() == 16)
                                System.out.println(ram.toString());
                        }
                    } else if (num1 > 16 && num1 < 33) {
                        for (Laptop ram : allLaptop) {
                            if (ram.getRam() > 16 && ram.getRam() < 33) System.out.println(ram.toString());
                        }
                    } else if (num1 > 32 && num1 < 65) {
                        for (Laptop ram : allLaptop) {
                            if (ram.getRam() > 32 && ram.getRam() < 65) System.out.println(ram.toString());
                        }
                    } else System.out.println("Нет таких ноутбуков! ");
                case 4:
                    System.out.print("Какой обьем накопителя необходим? \n Введите число в диапозоне от 256 до 2048: ");
                    int space = sc.nextInt();
                    if (space > 255 && space < 513) {
                        for (Laptop hdd : allLaptop) {
                            if (hdd.getHdd() > 255 && hdd.getHdd() < 513) System.out.println(hdd.toString());
                        }
                    } else if (space > 511 && space < 1029) {
                        for (Laptop hdd : allLaptop) {
                            if (hdd.getHdd() > 511 && hdd.getHdd() < 1029) System.out.println(hdd.toString());
                        }
                    } else if (space > 1027 && space < 2049) {
                        for (Laptop hdd : allLaptop) {
                            if (hdd.getHdd() > 1027 && hdd.getHdd() < 2049) System.out.println(hdd.toString());
                        }
                    } else System.out.println("Нет таких ноутбуков!");
                case 5:
                    System.out.print("Какой ценовой диапозон рассмотрим? \n 1 - дешевые, 2 - средние, 3 - дорогие \n Сделайте выбор: ");
                    int num3 = sc.nextInt();
                    switch (num3){
                        case 1:
                            for (Laptop prise : allLaptop) {
                                if (prise.getPrise() > 30000 && prise.getPrise() < 50000) System.out.println(prise.toString());
                            }
                        case 2:
                            for (Laptop prise : allLaptop) {
                                if (prise.getPrise() > 50000 && prise.getPrise() < 99000) System.out.println(prise.toString());
                            }
                        case 3:
                            for (Laptop prise : allLaptop) {
                                if (prise.getPrise() > 99000 ) System.out.println(prise.toString());
                            }
                    }
            }
        }
    }
}