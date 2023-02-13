import java.util.*;
import java.util.function.Predicate;


public class notebook {

  public static void Price(Collection<criteriaNoteBook> notebook) {
      while (true) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("1-Дороже, 2-Дешевле, 3-Выход: ");
          int choice1 = iScanner.nextInt();
          if (choice1 == 1) {
            System.out.printf("Введиде цену: ");
            int price = iScanner.nextInt();
            System.out.printf("Ноутбуки, цена которых больше либо равна: %d руб.\n", price);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMaxPrice = n -> n.getPrice() >= price;
            notebook.stream()
              .filter(notebookMaxPrice)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 2) {
            System.out.printf("Введиде цену: ");
            int price = iScanner.nextInt();
            System.out.printf("Ноутбуки, цена которых меньше либо равна: %d руб.\n", price);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMinPrice = n -> n.getPrice() <= price;
            notebook.stream()
              .filter(notebookMinPrice)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 3) {
            return;
          }
        }
    }

    public static void HDD(Collection<criteriaNoteBook> notebook) {
      while (true) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("1-Объем больше, 2-Меньше, 3-Выход: ");
          int choice1 = iScanner.nextInt();
          if (choice1 == 1) {
            System.out.printf("Введиде объем: ");
            int HDD = iScanner.nextInt();
            System.out.printf("Ноутбуки, объем HDD кодорых больше либо равен: %d Gb.\n", HDD);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMaxDisk = n -> n.getHDD() >= HDD;
            notebook.stream()
              .filter(notebookMaxDisk)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 2) {
            System.out.printf("Введиде объем: ");
            int HDD = iScanner.nextInt();
            System.out.printf("Ноутбуки, объем HDD кодорых меньше либо равен: %d Gb.\n", HDD);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMinDisk = n -> n.getHDD() <= HDD;
            notebook.stream()
              .filter(notebookMinDisk)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 3) {
            return;
          }
        }
    }

    public static void Screen(Collection<criteriaNoteBook> notebook) {
      while (true) {
          Scanner iScanner = new Scanner(System.in);
          System.out.printf("1-Объем больше, 2-Меньше, 3-Выход: ");
          int choice1 = iScanner.nextInt();
          if (choice1 == 1) {
            System.out.printf("Введиде размер: ");
            int Screen = iScanner.nextInt();
            System.out.printf("Ноутбуки, размер экрана больше либо равен: %d ''.\n", Screen);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMaxScreen= n -> n.getScreen() >= Screen;
            notebook.stream()
              .filter(notebookMaxScreen)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 2) {
            System.out.printf("Введиде размер: ");
            int Screen = iScanner.nextInt();
            System.out.printf("Ноутбуки, размер экрана меньше либо равен: %d ''.\n", Screen);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            Predicate<criteriaNoteBook> notebookMinScreen = n -> n.getScreen() <= Screen;
            notebook.stream()
              .filter(notebookMinScreen)
              .forEach(System.out::println);
              System.out.println();
          }
          else if (choice1 == 3) {
            return;
          }
        }
    }


   public static void Collor(Collection<criteriaNoteBook> notebook) {
    while (true) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("1-Выбор цвета, 2-Выход: ");
      int choice1 = iScanner.nextInt();
      if (choice1 == 1) {
        Scanner Scan = new Scanner(System.in);
        System.out.printf("Введиде цвет ноутбука (black, gold, silver): ");
        String name = Scan.nextLine();
        System.out.printf("Ноутбуки у которых цвет: %s\n", name);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Predicate<criteriaNoteBook> notebookCollor = n -> n.getColor().equals(name);
        notebook.stream()
          .filter(notebookCollor)
          .forEach(System.out::println);
        System.out.println();
      }
      else if (choice1 == 2) {
        return;
      }
    }
   }

   public static void OS(Collection<criteriaNoteBook> notebook) {
    while (true) {
      Scanner iScanner = new Scanner(System.in);
      System.out.printf("1-Выбор OS, 2-Выход: ");
      int choice1 = iScanner.nextInt();
      if (choice1 == 1) {
        Scanner Scan = new Scanner(System.in);
        System.out.printf("Введиде название OS (Windows OS, macOS, Linux): ");
        String name = Scan.nextLine();
        System.out.printf("Ноутбуки у которых предустановлена OS: %s\n", name);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        Predicate<criteriaNoteBook> notebookOs = n -> n.getOs().equals(name);
        notebook.stream()
          .filter(notebookOs)
          .forEach(System.out::println);
        System.out.println();
      }
      else if (choice1 == 2) {
        return;
      }
    }
   }

  public static void main(String[] args) {  
    List<criteriaNoteBook> notebook = new ArrayList<>();
    criteriaNoteBook notebook1 = new criteriaNoteBook(1, "ASUS notebook", 21999, "Intel Celeron N4020", 4, 1000, 15, "black", "Linux");
    criteriaNoteBook notebook2 = new criteriaNoteBook(2, "ASUS notebook", 23999, "Intel Celeron N4500", 4, 128, 14, "black", "Windows OS");
    criteriaNoteBook notebook3 = new criteriaNoteBook(3, "Apple MacBook Air", 236999, " Apple M1", 16, 512, 13, "gold", "macOS");
    criteriaNoteBook notebook4 = new criteriaNoteBook(4, "Apple MacBook Pro", 18000, "Intel Celeron N4020", 4, 64, 16, "silver", "macOS");
    criteriaNoteBook notebook5 = new criteriaNoteBook(5, "Honor MagicBook 15", 62999, "AMD Ryzen 5 5500U", 8, 512, 15, "silver", "Windows OS");
    criteriaNoteBook notebook6 = new criteriaNoteBook(6, "ASUS TUF Gaming", 134999, "Intel Core i5-10300H", 16, 1000, 17, "black", "Windows OS");

    notebook.add(notebook1);
    notebook.add(notebook2);
    notebook.add(notebook3);
    notebook.add(notebook4);
    notebook.add(notebook5);
    notebook.add(notebook6);
    

    try (Scanner sc = new Scanner(System.in)) {
      while (true) {
          System.out.printf("Выберете критерий ноутбука: \n 1-Цена \n 2-Объем HDD \n 3-Размер экрана \n 4-Цвет \n 5-ОС \n 6-Выход \n" );
          int choice = sc.nextInt();
          sc.nextLine();
          if (choice == 1) {
              Price(notebook);
          }
          else if (choice == 2) {
            HDD(notebook);
          }
          else if (choice == 3) {
            Screen(notebook);
          }
          else if (choice == 4) {
            Collor(notebook);
          }
          else if (choice == 5) {
            OS(notebook);
          }
          else if (choice == 6) {
              return;
          }
        }
    }
     
  }
} 