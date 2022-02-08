import fily.Colory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<List<Double>> czerwony = new ArrayList<>();
        List<List<Double>> niebieski = new ArrayList<>();
        List<List<Double>> zolty = new ArrayList<>();

        Scanner scCzerwony = new Scanner(new File("src/fily/czerwone.txt"));
        Scanner scNiebieski = new Scanner(new File("src/fily/niebieski.txt"));
        Scanner scZolty = new Scanner(new File("src/fily/zolty.txt"));

        czerwony = dopasowanie(scCzerwony);
        niebieski = dopasowanie(scNiebieski);
        zolty = dopasowanie(scZolty);


        Scanner sc = new Scanner(new File("src/fily/iris.txt"));
        while (sc.hasNextLine()) {


            Map<String, Integer> mapp = new LinkedHashMap<>();

            mapp.put("zolty", 0);
            mapp.put("niebieski", 0);
            mapp.put("czerwony", 0);
            String[] arr = sc.nextLine().split(",");
            Map<String, List<Double>> map = new LinkedHashMap<>();
            List<Colory> colories = new ArrayList<>();
            map.put("czerwony", ss(czerwony, "czerwony", arr));
            map.put("niebieski", ss(niebieski, "niebieski", arr));
            map.put("zolty", ss(zolty, "zolty", arr));

            for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
                Collections.sort(entry.getValue());
                for (int i = 0; i < 3; i++) {
                    colories.add(new Colory(entry.getKey(), entry.getValue().get(i)));
                }
            }

            Collections.sort(colories, (Colory o1, Colory o2) -> Double.compare(o1.getVal(), o2.getVal()));
            List<Double> dd = new ArrayList<>();
            for (int i = 0; i < arr.length - 1; i++) {
                dd.add(Double.parseDouble(arr[i]));
            }
            if (colories.get(2).getVal() < colories.get(3).getVal()) {
                for (int i = 0; i < 3; i++) {
                    mapp.put(colories.get(i).getNazwa(), mapp.get(colories.get(i).getNazwa()) + 1);
                }
                for (Map.Entry<String, Integer> entry : mapp.entrySet()) {
                    if (entry.getValue() >= 2) {

                        switch (entry.getKey()) {
                            case "zolty":
                                System.out.println("Dodane do zoltego\n");
                                zolty.add(dd);
                                break;
                            case "czerwony":
                                System.out.println("Dodane do  czerwonego\n");
                                czerwony.add(dd);
                                break;
                            case "niebieski":
                                System.out.println("Dodane do niebieskiego\n");
                                niebieski.add(dd);
                                break;
                        }
                        System.out.println("Czerwony: " + czerwony.size());
                        System.out.println("Niebieski: " + niebieski.size());
                        System.out.println("Zolty: " + zolty.size() + "\n\n");
                    }
                }
            }else {
                int a = (int) (Math.random() * 3) + 1;
                switch (a) {

                    case 1:
                        System.out.println("Dodane do zoltego\n");
                        zolty.add(dd);
                        break;
                    case 2:
                        System.out.println("Dodane do  czerwonego\n");
                        czerwony.add(dd);
                        break;
                    case 3:
                        System.out.println("Dodane do niebieskiego\n");
                        niebieski.add(dd);
                        break;
                }
            }

        }
        while (true) {
            System.out.println("Poprosze 4 liczby double przez przecinek");
            Scanner scanner = new Scanner(System.in);

            Map<String, Integer> map6 = new LinkedHashMap<>();

            map6.put("zolty", 0);
            map6.put("niebieski", 0);
            map6.put("czerwony", 0);

            String[] arrr = scanner.nextLine().split(",");
            Map<String, List<Double>> map1 = new LinkedHashMap<>();
            List<Colory> coloriess = new ArrayList<>();
            map1.put("czerwony", ss(czerwony, "czerwony", arrr));
            map1.put("niebieski", ss(niebieski, "niebieski", arrr));
            map1.put("zolty", ss(zolty, "zolty", arrr));

            for (Map.Entry<String, List<Double>> entry : map1.entrySet()) {
                Collections.sort(entry.getValue());
                for (int i = 0; i < 3; i++) {
                    coloriess.add(new Colory(entry.getKey(), entry.getValue().get(i)));
                }
            }

            Collections.sort(coloriess, (Colory o1, Colory o2) -> Double.compare(o1.getVal(), o2.getVal()));
            List<Double> dd = new ArrayList<>();
            for (int i = 0; i < arrr.length - 1; i++) {
                dd.add(Double.parseDouble(arrr[i]));
            }
            if (coloriess.get(2).getVal() < coloriess.get(3).getVal()) {
                for (int i = 0; i < 3; i++) {
                    map6.put(coloriess.get(i).getNazwa(), map6.get(coloriess.get(i).getNazwa()) + 1);
                }
                for (Map.Entry<String, Integer> entry : map6.entrySet()) {
                    if (entry.getValue() >= 2) {

                        switch (entry.getKey()) {
                            case "zolty":
                                System.out.println("Dodane do zoltego\n");
                                zolty.add(dd);
                                break;
                            case "czerwony":
                                System.out.println("Dodane do  czerwonego\n");
                                czerwony.add(dd);
                                break;
                            case "niebieski":
                                System.out.println("Dodane do niebieskiego\n");
                                niebieski.add(dd);
                                break;
                        }
                        System.out.println("Czerwony: " + czerwony.size());
                        System.out.println("Niebieski: " + niebieski.size());
                        System.out.println("Zolty: " + zolty.size() + "\n\n");
                    }
                }
            }else {
                int a = (int) (Math.random() * 3) + 1;
                switch (a) {

                    case 1:
                        System.out.println("Dodane do zoltego\n");
                        zolty.add(dd);
                        break;
                    case 2:
                        System.out.println("Dodane do  czerwonego\n");
                        czerwony.add(dd);
                        break;
                    case 3:
                        System.out.println("Dodane do niebieskiego\n");
                        niebieski.add(dd);
                        break;
                }
            }
        }
    }

    public static List<Double> ss(List<List<Double>> lista, String s, String[] arr) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            double result = 0;
            for (int j = 0; j < lista.get(i).size(); j++) {
                result += Math.pow(Double.parseDouble(arr[j]) - lista.get(i).get(j), 2);
            }
            result = Math.sqrt(result);
            list.add(result);
        }
        return list;
    }

    public static List<List<Double>> dopasowanie(Scanner scanner) {
        List<List<Double>> list = new ArrayList<>();
        while (scanner.hasNextLine()) {
            List<Double> liczby = new ArrayList<>();
            String s[] = scanner.nextLine().split(",");
            for (int i = 0; i < s.length - 1; i++) {
                liczby.add(Double.parseDouble(s[i]));
            }
            list.add(liczby);
        }
        return list;
    }
}
