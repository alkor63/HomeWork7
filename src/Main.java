public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, HomeWork#7 !");
// task 1
// Откладываем по 15 000 Эпод подушкуЭ, пока не накопим 2 459 000
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
// поситать численность населения через 10 лет если годовой прирост (17 - 8) на 1000 человек
        System.out.println("\n*** task 3: calculate the population in 10 years");
        int population = 12_000_000;
        int years;
        for (years = 1; years <= 10; years++) {
            population = population + (17 - 8) * population / 1000;
            System.out.println("Год " + years + ", численность населения составляет " + population);
        }

// task 4
// поситать за сколько месяцев Василий накопит 12млн начав с 15000 под 7% в месяц
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
        System.out.println("\n*** task 5: same as task 4, but print every 6 month)");
        summaV = 15000;
        mohth = 0;
        while (summaV < 12_000_000) {
            summaV = summaV + summaV * 0.07;
            mohth++;
            if (mohth % 6 == 0) System.out.println(mohth+"-й месяц: сумма накоплений = "+summaV);
        }

// task 6
// при техже условиях копим 9 лет
        System.out.println("\n*** task 5: same as task 5, but saving money for 9 years)");
        summaV = 15000;
        mohth = 0;
        while (mohth < (12*9)) {
            summaV = summaV + summaV * 0.07;
            mohth++;
            if (mohth % 6 == 0) System.out.println(mohth+"-й месяц: сумма накоплений = "+summaV);
        }
    }
}