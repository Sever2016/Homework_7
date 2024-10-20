public class Main {
    public static void main(String[] args) {
        //Задача 1
        int deposit = 15_000;
        int desiredAmount = 2_459_000;
        int balance = 0;
        int month = 0;
        while (balance < desiredAmount) {
            balance += deposit;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
        //Задача 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        //Задача 3
        int populationYCountry = 12_000_000;
        int bornPer1000 = 17;
        int deadPer1000 = 8;
        for (int year = 1; year <= 10; year++) {
            populationYCountry = populationYCountry + (populationYCountry / 1000) * (bornPer1000 - deadPer1000);
            System.out.println("Год " + year + ", численность начеления составляет " + populationYCountry);
        }
        //Задача 4
        int vasiliyDeposit = 15000;
        int interestRate = 7;
        month = 0;
        while (vasiliyDeposit <= 12_000_000) {
            vasiliyDeposit = vasiliyDeposit * (100 + interestRate) / 100;
            month++;
            System.out.println("Месяц " + month + ", денег на счету " + vasiliyDeposit + " рублей");
        }
        //Задача 5
        vasiliyDeposit = 15000;
        month = 0;
        while (vasiliyDeposit <= 12_000_000) {
            vasiliyDeposit = vasiliyDeposit * (100 + interestRate) / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", денег на счету " + vasiliyDeposit + " рублей");
            }
        }
        //Задача 6
        for (month = 1; month <= 12 * 9; month++) {
            vasiliyDeposit = vasiliyDeposit * (100 + interestRate) / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", денег на счету " + vasiliyDeposit + " рублей");
            }
        }
        //Задача 7
        int dayOfFirstFriday = 2;
        for (int day = 1; day <= 31; day++) {
            if (day % 7 == dayOfFirstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчёт");
            }
        }
        //Задача 8
        int currentYear = 2024;
        int year200YearsAgo = currentYear - 200;
        int year100After = currentYear + 100;
        int year = year200YearsAgo;
        while (year <= year100After) {
            if (year % 79 == 0) {
                System.out.println(year);
                year += 79;
            } else {
                year++;
            }
        }
    }
}