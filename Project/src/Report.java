
import java.util.Arrays;
import java.util.Scanner;

public class Report {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Data ? ");
        int Data = entry.nextInt();

        Colleger col[] = new Colleger[Data];

        for (int i = 0; i < Data; i++) {
            System.out.println("Data-" + (i + 1));
            System.out.println("Human Data : ");
            System.out.print("Name : ");
            String name = input.nextLine();
            System.out.print("Age : ");
            int age = entry.nextInt();
            System.out.print("Gender : ");
            String gender = input.nextLine();
            System.out.println("Student Data");
            System.out.print("Project : ");
            double project = entry.nextDouble();
            System.out.print("UTS : ");
            double uts = entry.nextDouble();
            System.out.print("UAS : ");
            double uas = entry.nextDouble();
            col[i] = new Colleger(name, gender, age, project, uts, uas);
            System.out.println("");
        }

        System.out.println("Report List:");
        for (int i = 0; i < Data; i++) {
            System.out.print(" " + col[i].getName() + " \t " + col[i].calcFinalScore() + " \t ");
            if (col[i].calcFinalScore() < 70) {
                System.out.println("Fail");
            } else if (col[i].calcFinalScore() >= 70) {
                System.out.println("Pass");
            }

        }

        System.out.println("");

        int ulang = 1;
        do {
            System.out.println("1. Sorting data based on Name");
            System.out.println("2. Sorting data based on FinalScore");
            System.out.println("3. Highest Final Score");
            System.out.println("4. Lowest Final Score");
            System.out.println("5. Find student name");
            System.out.println("6. Calculate average project from all student");
            System.out.println("7. Calculate average UTS from all student");
            System.out.println("8. Calculate average UAS from all student");
            System.out.println("9. Calculate average Final Score from all student");
            System.out.print("Choose Menu : ");
            int option = entry.nextInt();

            if (option == 1) {
                BubbleSortString(col, Data);
                for (Colleger c : col) {
                    System.out.print("" + c.getName() + " \t " + c.calcFinalScore() + " \t ");
                    if (c.calcFinalScore() < 70) {
                        System.out.println("Fail");
                    } else if (c.calcFinalScore() >= 70) {
                        System.out.println("Pass");
                    }
                }
            } else if (option == 2) {
                BubbleSort(col, Data);
                for (Colleger c : col) {
                    System.out.print("" + c.getName() + " \t " + c.calcFinalScore() + " \t ");
                    if (c.calcFinalScore() < 70) {
                        System.out.println("Fail");
                    } else if (c.calcFinalScore() >= 70) {
                        System.out.println("Pass");
                    }
                }
            } else if (option == 3) {
                BubbleSort(col, Data);
                System.out.print("" + col[Data - 1].getName() + " \t " + col[Data - 1].calcFinalScore() + " \t ");
                if (col[Data - 1].calcFinalScore() < 70) {
                    System.out.println("Fail");
                } else if (col[Data - 1].calcFinalScore() >= 70) {
                    System.out.println("Pass");
                }
            } else if (option == 4) {
                BubbleSort(col, Data);
                System.out.print("" + col[0].getName() + " \t " + col[0].calcFinalScore() + " \t ");
                if (col[0].calcFinalScore() < 70) {
                    System.out.println("Fail");
                } else if (col[0].calcFinalScore() >= 70) {
                    System.out.println("Pass");
                }
            } else if (option == 5) {
                int count = 0;
                System.out.print("Input search:");
                String keyWord = input.nextLine();
                for (Colleger c : col) {
                    if (c.getName().toLowerCase().contains(keyWord.toLowerCase())) {
                        System.out.println("" + c.getName() + " \t " + c.calcFinalScore());
                    } else if (count == Data-1) {
                        System.out.println("Tidak ditemukan");
                    } else {
                        count++;
                    }
                }
            } else if (option == 6) {
                double totProject = 0;
                for (Colleger c : col) {
                    totProject = totProject + c.getProject();
                }
                System.out.println("Average Project Score = " + (totProject / Data));
            } else if (option == 7) {
                double totUTS = 0;
                for (Colleger c : col) {
                    totUTS = totUTS + c.getUTS();
                }
                System.out.println("Average UTS Score = " + (totUTS / Data));
            } else if (option == 8) {
                double totUAS = 0;
                for (Colleger c : col) {
                    totUAS = totUAS + c.getUAS();
                }
                System.out.println("Average UAS Score = " + (totUAS / Data));
            } else if (option == 9) {
                double totFinal = 0;
                for (Colleger c : col) {
                    totFinal = totFinal + c.calcFinalScore();
                }
                System.out.println("Average Final Score = " + (totFinal / Data));
            } else {
                System.out.println("Error Silakan jalani program anda ulang");
            }
            System.out.print("Ulang? (yes=1  no=0) ");
            ulang = entry.nextInt();
            if (ulang != 1 && ulang != 0) {
                System.out.println("Mohon Ulang Program");
            }
        } while (ulang == 1);
    }

    public static void BubbleSortString(Colleger[] col, int Data) {
        for (int i = 0; i < Data; i++) {
            for (int j = 0; j < Data; j++) {
                if (col[i].getName().compareTo(col[j].getName()) < 0) {
                    Colleger temp = col[i];
                    col[i] = col[j];
                    col[j] = temp;
                }
            }
        }
    }

    public static void BubbleSort(Colleger[] col, int Data) {
        for (int i = 0; i < Data; i++) {
            for (int j = 0; j < Data; j++) {
                if (col[i].calcFinalScore() < col[j].calcFinalScore()) {
                    Colleger temp = col[i];
                    col[i] = col[j];
                    col[j] = temp;
                }
            }
        }
    }
}
