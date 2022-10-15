public class Main {
    public static void main(String[] args) {
        //Задание 1
        int summ=0;
        int finish = 2_459_000;
        int cintributionInMount = 15000;
        int mount = 0;

        while(summ<=finish){
            summ+=cintributionInMount+cintributionInMount/100*12;
            mount++;
        }
        System.out.println("Что бы накопить нужную сумму нам потребуется " + mount);
        System.out.println();
        System.out.println();
        //задание 2

        int i = 0;
        while(10>=i){
            System.out.print(i++ + " ");
            //i++;
        }
        System.out.println();
        System.out.println();


        for(i = 10;i>=0;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        //Задание 3
        long populatuonY = 12_000_000;
        int rojdaemost = 17;
        int smertnost = 8;
        double prirostNa1000 =(double)(17-8)/1000;
        System.out.println(prirostNa1000);
        double prirostobshii = populatuonY * prirostNa1000;
        System.out.println(prirostobshii);
        for(int j = 1; j <= 10; j++){//можно было бы и дабловый результат вывести, но так симпатичней по моему
            populatuonY+=prirostobshii;
            System.out.println(j+ " Год численность населения составляет " + populatuonY);
        }
        System.out.println();
        System.out.println();
        //Задание 4
        long nachSumm = 15000;
        double procent = 15000*7/100;
        System.out.println("процентов получится за месяц "+ procent);
        int mountSchet = 0;
        long needSumm = 12_000_000;
        //в условии не сказано за какой период нужно вывести поэтмоу я вывожу за 10 месяцев
        while(nachSumm<needSumm){
            nachSumm+=procent;
            System.out.println("Сумма накоплений за " + mountSchet + " месяц составляет "+ nachSumm);
            mountSchet++;
        }
        System.out.println("Короче василий это реально василий, потому что к тому времени" +
                " как он их накопит, на эти деньги джае бутылку пивасика себе не купишь...");

        //задание 5
        System.out.println();
        System.out.println();
        nachSumm = 15000;
        procent = 15000*7/100;
        System.out.println("процентов получится за месяц "+ procent);
        mountSchet = 0;
        needSumm = 12_000_000;
        //в условии не сказано за какой период нужно вывести поэтмоу я вывожу за 10 месяцев
        while(nachSumm<needSumm){
            nachSumm+=procent;
            if(mountSchet % 6 == 0) {
                System.out.println("Сумма накоплений за " + mountSchet + " месяц составляет " + nachSumm);

            }
            mountSchet++;
        }
        //Задание 6
        System.out.println();
        System.out.println();
        nachSumm = 15000;
        procent = 15000*7/100;
        System.out.println("процентов получится за месяц "+ procent);
        mountSchet = 0;
        needSumm = 12_000_000;
        int nineYear = 9*12;
        //в условии не сказано за какой период нужно вывести поэтмоу я вывожу за 10 месяцев
        while(nachSumm<needSumm){
            nachSumm+=procent;
            if(mountSchet % 6 == 0 && nineYear >= mountSchet) {
                System.out.println("Сумма накоплений за " + mountSchet + " месяц составляет " + nachSumm);

            }
            mountSchet++;
        }
        System.out.println("Составили накопления за 9 лет");
        //Задание 7
        System.out.println();
        System.out.println();

        int fridey = 4;
        int mountLong = 31;
        for(int k = fridey;k<=mountLong;k+=7){
            System.out.println(k + " Число это пятница, пора готовить отчет!");
        }
        //Задание 8
        System.out.println();
        System.out.println();
        //коль в задаче с 2017 года начинаются счисления не буду отклоняться, что бы никого не путать.
        int startComet = 1817;
        int startCometShet = 1817;
        int yearsOfAppearance = 0;
        int period = 79;
        for(int k = startComet;k<startCometShet+200;k+=79){
            startComet+=period;
            System.out.println("B " + startComet + " мы увидим комету");
        }
        System.out.println("B " + startComet + " мы увидим комету в последний раз");
        //Задание 9
        System.out.println();
        System.out.println();
        for(int k = 1; k <= 10; k++){
            System.out.println("2 * " + k + " = " + 2 * k);
        }
    }
}