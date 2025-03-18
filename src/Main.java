public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int sum = 0;
        int month = 0;
        while (sum <= 2_459_000) {
            month++;
            sum = sum + 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " +
                    sum + " рублей.");
        }
        System.out.println("Поздравляем! У вас достаточно денег на счете!");
        System.out.println();
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i <= 10 && i >= 1; i--) {
            System.out.print(i + " ");
        }

        // todo как убрать год 0?
        System.out.println();
        System.out.println("task 3");
        int population = 12_000_000;
        int year = 0;
        for (; year <= 10; population = population + (population / 1000 * 17) -
                (population / 1000 * 8), year++) {
            System.out.println("Год " + year + " численность населения составляет "
                    + population);
        }
        System.out.println();
        System.out.println("task 4");
        double sumToSave = 15000;
        month = 1;
        do {
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n",
                    month++, sumToSave);
            sumToSave = sumToSave + 15_000 + (sumToSave + 15_000) * 0.07;
        } while (sumToSave <= 12_000_000);
        System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n",
                month, sumToSave);

        System.out.println();
        System.out.println("task 5");
        double save;
        for (save = 15_000, month = 1; save <= 12_000_000; save = save + 15_000 +
                (save + 15_000) * 0.07, month++) {
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n",
                        month, save);
            }
        }
        System.out.println();
        System.out.println("task 6");
        for (save = 15_000, month = 1; month <= 9 * 12; save = save + 15_000 +
                (save + 15_000) * 0.07, month++) {
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей.\n",
                        month, save);
            }
        }
        System.out.println();
        System.out.println("task 7");
        int firstFridayDate = 2;
        int currentDate = 2;
        for (; currentDate <= 31; currentDate++) {
            if ((currentDate - firstFridayDate) % 7 == 0) {
                System.out.println("Сегодня пятница, " + currentDate + " число. Необходимо " +
                        "подготовить отчет.");
            }
        }
        System.out.println();
        System.out.println("task 8");
        for (year = 1825; year <= 2125; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}

