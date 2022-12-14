public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, HomeWork#7 !");
// task 1
// Откладываем по 15 000 "под подушку", пока не накопим 2 459 000
        System.out.println("*** task 1: summa 15 000 * ?months >= 2 459 000");
        int mohth = 1;
        int summa = 15_000;
        while (summa < 2_459_000) {
            summa +=15000;
            mohth++;
        }
        System.out.println("Месяц "+mohth+", сумма накоплений равна "+summa+" рублей");

// task 2
// выводим в одну строку ряд 1 2...10 , во вторую 10 9 ...1
        System.out.println("\n*** task 2: Print: 1 2 ... 10 (while), next line Print: 10 9 ... 1 (for)");
        int i = 1;
        while (i <= 10) {
            System.out.print(" "+i);
            i++;
        }
        System.out.print("\n");
        for (i = 10; i >= 1; i--)
            System.out.print(" "+i);
        System.out.print("\n");

// task 3
// посчитать численность населения через 10 лет если годовой прирост (17 - 8) на 1000 человек
        System.out.println("\n*** task 3: calculate the population in 10 years");
        int population = 12_000_000;
        int years;
        for (years = 1; years <= 10; years++) {
            population = population + (17 - 8) * population / 1000;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }

// task 4
// посчитать за сколько месяцев Василий накопит 12млн начав с 15000 под 7% в месяц
        System.out.println("\n*** task 4: saving up from 15_000 to 12_000_000 (7% per month)");
        double summaV = 15000;
        mohth = 0;
        while (summaV < 12_000_000) {
            summaV = summaV + summaV * 0.07;
            mohth++;
            System.out.println(mohth+"-й месяц: сумма накоплений = "+summaV);
        }

// task 5
// зерультат задачи 4 печатаем каждый 6-й месяц
        System.out.println("\n*** task 5: same as task 4, but print every 6 month");
        summaV = 15000;
        mohth = 0;
        while (summaV < 12_000_000) {
            summaV = summaV + summaV * 0.07;
            mohth++;
            if (mohth % 6 == 0) System.out.println(mohth+"-й месяц: сумма накоплений = "+summaV);
        }

// task 6
// при техже условиях копим 9 лет
        System.out.println("\n*** task 6: same as task 5, but saving money for 9 years");
        summaV = 15000;
        mohth = 0;
        while (mohth < (12*9)) {
            summaV = summaV + summaV * 0.07;
            mohth++;
            if (mohth % 6 == 0) System.out.println(mohth+"-й месяц: сумма накоплений = "+summaV);
        }

// task 7
// пятница - день отчётов
        System.out.println("\n*** task 7: Friday is the day for reports");
        int friday = 2;
        while (friday <=31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }

// task 8
// когда увидим комету? Период кометы 79 лет, годы: -200 ... +100 олт текущего
        System.out.println("\n*** task 8: when will we see a comet with a period of 79 years?");
        int yearComet = 0;
        int yearToday = 2022;
        do {
            if (yearComet >= (yearToday - 200))
                System.out.println(yearComet);
            yearComet += 79;
        }
        while (yearComet <= (yearToday + 100));

// task 9
// таблица умножения на 2
        System.out.println("\n*** task 9: multiplication table by 2 ");
        for (i = 1; i <= 10; i++)
            System.out.println("2 * "+i+" = "+ i*2);

// task *1*
// выводим числа от 1 до 30 и приписываем ping если кратно 3 и pong если кратно 5
        System.out.println("\n*** task *1: ping (3) pong (5) ");
        for (i = 1; i <= 30; i++) {
            System.out.print(i+": ");
            if (i%3 == 0) System.out.print("ping ");
            if (i%5 == 0) System.out.print("pong ");
            System.out.print("\n");
        }

// task *2*
// выводим первые 10 чисел последовательности Фибоначчи
        System.out.println("\n*** task *2*: 10 numbers of Fibonacci");
        int a = 0;
        int b = 1;
        for (i = 0; i < 5; i++) {
            System.out.print(a+" "+b+" ");
            a = a + b;
            b = b + a;
        }
        System.out.println();
    }
}