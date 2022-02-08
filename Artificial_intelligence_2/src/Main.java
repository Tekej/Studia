import java.util.*;

public class Main {
    private final static String[][] zad1 = {
            {"Sunny", "Hot", "High", "False", "No"},
            {"Sunny", "Hot", "High", "True", "No"},
            {"Overcast", "Hot", "High", "False", "Yes"},
            {"Rain", "Mild", "High", "False", "Yes"},
            {"Rain", "Cool", "Normal", "False", "Yes"},
            {"Rain", "Cool", "Normal", "True", "No"},
            {"Overcast", "Cool", "Normal", "True", "Yes"},
            {"Sunny", "Mild", "High", "False", "Yes"},
            {"Sunny", "Cool", "Normal", "False", "Yes"},
            {"Rain", "Mild", "Normal", "False", "Yes"},
            {"Sunny", "Mild", "Normal", "True", "Yes"},
            {"Overcast", "Hot", "Normal", "False", "Yes"},
            {"Overcast", "Mild", "High", "True", "No"}
    };
    private final static String[][] zad2 = {
            {"mejski", "niska", "słabe", "mała", "1"},
            {"duży", "niska", "słabe", "mała", "1"},
            {"kompakt", "niska", "dobre", "przeciętna", "1"},
            {"mały", "niska", "przeciętne", "mała", "1"},
            {"mały", "umiarkowana", "przeciętne", "przeciętna", "1"},
            {"kompakt", "umirakowana", "przeciętne", "przeciętna", "1"},
            {"mejski", "umiarkowana", "przeciętne", "przeciętna", "0"},
            {"mały", "umiarkowana", "dobre", "duża", "0"},
            {"kompakt", "wysoka", "dobre", "duża", "0"},
            {"duży", "wysoka", "pzeciętne", "przeciętna", "0"},
            {"duży", "wysoka", "przeciętne", "duża", "0"}
    };
    private static Map<String, Double> answers;

    public static void main(String[] args) {
        System.out.println("Zad1:\n");
        String[][] testingData = {
                {"Overcast", "Hot", "High", "True"},
                {"Sunny", "Cool", "Normal", "True"},
                {"Rainy", "Cool", "High", "False"}
        };
        answers = countDecisionAtr(zad1);
        for (String[] testingDatum : testingData) {
            System.out.println("Test data: " + Arrays.asList(testingDatum));
            System.out.println("Answer: " + findAnswer(testingDatum, zad1) + "\n");
        }
        System.out.println("\n\nZad2:\n");
        String[][] testingData2 = {
                {"mały", "umiarkowana", "słabe", "małe"},
                {"miejski", "niska", "dobre", "duża"},
                {"kompakt", "umiarkowana", "dobre", "duża"},
                {"duży", "umiarkowana", "słabe", "przeciętna"}
        };
        answers = countDecisionAtr(zad2);
        for (String[] strings : testingData2) {
            System.out.println("Test data: " + Arrays.asList(strings));
            System.out.println("Answer: " + findAnswer(strings, zad2) + "\n");
        }
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Which table use 1 or 2:");
            int a = Integer.parseInt(sc.nextLine());
            if (a == 1 || a == 2) {
                if (a == 1) {
                    System.out.println("Prosze wprowadzic 1 zmienną: Sunny/Overcast/Rain");
                    String outlook = sc.nextLine();
                    if (outlook.equals("Sunny") || outlook.equals("Overcast") || outlook.equals("Rain")) {
                        System.out.println("Prosze wprowadzic 2 zmienną: Hot/Mild/Cool");
                        String temperature = sc.nextLine();
                        if (temperature.equals("Hot") || temperature.equals("Mild") || temperature.equals("Cool")) {
                            System.out.println("Prosze wprowadzic 3 zmienną: High/Normal");
                            String humidity = sc.nextLine();
                            if (humidity.equals("High") || humidity.equals("Normal")) {
                                System.out.println("Prosze wprowadzic 4 zmienną: False/True");
                                String windy = sc.nextLine();
                                if (windy.equals("False") || windy.equals("True")) {
                                    answers = countDecisionAtr(zad1);
                                    String[][] test = {
                                            {outlook,temperature,humidity,windy}
                                    };
                                    for (String[] strings : test) {
                                        System.out.println("Test data: " + Arrays.asList(strings));
                                        System.out.println("Answer: " + findAnswer(strings, zad1) + "\n");
                                    }
                                } else {
                                    System.out.println("wrong");

                                }
                            } else {
                                System.out.println("wrong!");

                            }
                        } else {
                            System.out.println("wrong!");

                        }
                    } else {
                        System.out.println("wrong ");
                    }
                }else{
                    System.out.println("Prosze wprowadzic 1 zmienną: miejski/duży/kompakt/mały:");
                    String klasa = sc.nextLine();
                    if (klasa.equals("miejki") || klasa.equals("duży") || klasa.equals("kompakt")||klasa.equals("mały")) {
                        System.out.println("Prosze wprowadzic 2 zmienną: niska/umiarkowana/wysoka:");
                        String cena = sc.nextLine();
                        if (cena.equals("niska") || cena.equals("umiarkowana") || cena.equals("wysoka")) {
                            System.out.println("Prosze wprowadzic 3 zmienną: słabe/dobre/przeciętne:");
                            String osiagi = sc.nextLine();
                            if (osiagi.equals("słabe") || osiagi.equals("dobre")||osiagi.equals("przeciętne")) {
                                System.out.println("Prosze wprowadzic 4 zmienną: mała/przeciętna/duża:");
                                String niezawadowosc = sc.nextLine();
                                if (niezawadowosc.equals("mała") || niezawadowosc.equals("przeciętna")||niezawadowosc.equals("duża")) {
                                    answers = countDecisionAtr(zad2);
                                    String[][] test = {
                                            {klasa,cena,osiagi,niezawadowosc}
                                    };
                                    for (String[] strings : test) {
                                        System.out.println("Test data: " + Arrays.asList(strings));
                                        System.out.println("Answer: " + findAnswer(strings, zad2) + "\n");
                                    }
                                } else {
                                    System.out.println("wrong");

                                }
                            } else {
                                System.out.println("wrong!");

                            }
                        } else {
                            System.out.println("wrong!");

                        }
                    } else {
                        System.out.println("wrong ");

                    }
                }
            } else {
                System.out.println("wrong!");
            }
        }
    }

    private static String findAnswer(String[] testingData, String[][] data) {
        double val = 0;
        String answer = "";
        for (Map.Entry<String, Double> entry : answers.entrySet()) {
            double value = naiveBayes(testingData, entry.getKey(), data);
            if (val < value) {
                val = value;
                answer = entry.getKey();
            }
        }
        return answer;
    }

    private static double naiveBayes(String[] input, String decision, String[][] data) {
        double result = 1;

        for (int i = 0; i < input.length; i++) {
            result *= createFraction(input[i], i, decision, data);
        }

        return result * (answers.get(decision) / data.length);
    }

    private static double createFraction(String input, int point, String decided, String[][] data) {
        double num = 0;

        for (String[] line : data) {
            if (line[point].equals(input) && line[line.length - 1].equals(decided)) {
                num++;
            }
        }

        if (num == 0) {
            return laplace(answers.get(decided), point, data);
        }

        return num / answers.get(decided);
    }

    private static double laplace(double denominator, int pointer, String[][] data) {
        List<String> possibleAnswers = showPossibleAnswers(pointer, data);

        return 1 / (denominator + possibleAnswers.size());
    }

    private static Map<String, Double> countDecisionAtr(String[][] data) {
        Map<String, Double> result = new HashMap<>();
        for (String[] line : data) {
            String atr = line[line.length - 1];
            if (!result.containsKey(atr)) {
                result.put(atr, 1.0);
            } else {
                double lastValue = result.get(atr) + 1;
                result.replace(atr, lastValue);
            }
        }
        return result;
    }

    private static List<String> showPossibleAnswers(int pointer, String[][] data) {
        List<String> mbAnswer = new ArrayList<>();
        for (String[] learningDatum : data) {
            if (!mbAnswer.contains(learningDatum[pointer])) {
                mbAnswer.add(learningDatum[pointer]);
            }
        }
        return mbAnswer;
    }
}