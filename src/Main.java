import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Computers> computers = new HashSet<>();
        Map<Integer, String> userInput = new HashMap<>();
        Map<String, String> filter = new HashMap<>();
        Set<Computers> printComputers = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        computers.add(new Computers("Red", "Lenovo", "Windows 11", 8, 800));
        computers.add(new Computers("Red", "MacBook", "MacOS", 4, 1020));
        computers.add(new Computers("White", "Acer", "Windows 7", 8, 1000));
        computers.add(new Computers("Yellow", "Asus", "Windows XP", 2, 64));
        computers.add(new Computers("Green", "MSI", "Windows Vista", 6, 450));

        userInput.put(1, "color");
        userInput.put(2, "model");
        userInput.put(3, "oc");
        userInput.put(4, "ram");
        userInput.put(5, "hhd");

        for (Map.Entry entry : userInput.entrySet()) {
            System.out.println("Enter min value for search filter by: " + entry.getValue() +
                    "\nEnter 0 if it doesn't matter. \nEnter since big letter:\n");
            String value = scanner.nextLine();
            filter.put((String) entry.getValue(), value);
        }
        scanner.close();

        for (Computers entry : computers) {
            if ((entry.getColor().equals(filter.get("color")) || filter.get("color").equals("0")) &&
                    entry.getModel().equals(filter.get("model")) || filter.get("model").equals("0") &&
                    entry.getOc().equals(filter.get("oc")) || filter.get("oc").equals("0") &&
                    entry.getRam() >= Integer.parseInt(filter.get("ram")) &&
                    entry.getHhd() >= Integer.parseInt(filter.get("hhd"))) {
                printComputers.add(entry);
            }
        }

        System.out.println("There is models: ");
        for (Computers values : printComputers) {
            System.out.println(values);
        }
    }


//        System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
//                "1 - ОЗУ\n" +
//                "2 - Объем ЖД\n" +
//                "3 - Операционная система\n" +
//                "4 - Цвет\n" +
//                "5 - 'Начать поиск'");
////        Scanner s = new Scanner(System.in);
////        int user = s.nextInt();
//
//
//        Set<Computers> computersSet = new HashSet<>();
//
//        FilterComputers filterComputers = new FilterComputers(computersSet);
//
//
////            if (user == 1) {
////                filterComputers.showOZU();
////            } else if (user == 2) {
////                filterComputers.showMemory();
////            } else if (user == 3) {
////                filterComputers.showOS();
////            } else if (user == 4) {
////                filterComputers.showColor();
////            } else {
////                System.out.println("Выберите из меню пункты от 1 до 5");
////            switch (user) {
////                case 1:
////                    filterComputers.showOZU();
////                    break;
////                case 2:
////                    filterComputers.showMemory();
////                    break;
////                case 3:
////                    filterComputers.showOS();
////                    break;
////                case 4:
////                    filterComputers.showColor();
////                    break;
////            }
//
//
//
//        //        Map<Integer, Computers> userParam = new HashMap<>();
//        Computers computer1 = new Computers();
//        computer1.setOzu(8);
//        computer1.setMemory(2);
//        computer1.setOs("MacOs");
//        computer1.setColor("black");
//        computersSet.add(computer1);
//
//        filterComputers.printComputers();
////    }8, 512, "Mac OS", "black"
//    }
}