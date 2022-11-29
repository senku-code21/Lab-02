import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Main obj = new Main();
        obj.task1();
        obj.task2();
        obj.task3();
        obj.task4();
        obj.task5();
        obj.task6();
        obj.task7();
    }

    public int task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 01");
        System.out.println("Please input integer number:");
        int n = sc.nextInt();
        int x = (n/10)%10;
        System.out.println("Вторая цифра с права: " + x);
        return x;
    }

    public int task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 02");
        System.out.println("Please input integer number:");
        int n = sc.nextInt();
        while (n>99){
            n = n/10;
        }
        int x = n%10;
        System.out.println("Вторая цифра с права: " + x);
        return x;
    }

    public int task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 03");
        System.out.println("Please input integer number:");
        int n = sc.nextInt();
        int x = 1;
        for (int i=2; i<=n; i++)
            x*=i;
        System.out.println("Факториал числа n : " + x);
        return x;
    }

    public int task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 04");
        System.out.println("1>>1 2>>1 9>>34 10>>55");
        System.out.println("Please input integer number:");
        int n = sc.nextInt();
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for (int i=2; i<=n; i++)
            f[i] = f[i-1] + f[i-2];
        System.out.println("n-ое число в последовательности Фибоначчи: " + f[n]);
        return f[n];
    }

    public int task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 05");
        System.out.println("1>>2 2>>2 3>>2");
        System.out.println("Please input integer number:");
        int n = sc.nextInt();
        int v1;
        int x = 1;
        for (int i=1; i<=n; i++) {
            v1 = 1+1/(i*i);
            x *= v1;
        }
        System.out.println("Pезультат выражения n: " + x);
        return x;
    }

    public double task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 06");
        System.out.println("5,3>>-6.874380102032891");
        System.out.println("Please input integer number:");
        double n = sc.nextDouble();
        double v1;
        double p = 1.0;
        for (int i=2; i<=64; i=i+2) {
            v1 = (n-i)/(n-(i-1));
            System.out.println(n + "-" + i + " / " + n + "-" + (i-1) + "=" + v1);
            p *= v1;
        }
        System.out.println("Pезультат выражения n: " + p);
        return p;
    }

    public double task7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 07");
        System.out.println("Please input integer number:");
        double n = sc.nextDouble();
        double v1 = (n*n)+(256/(n*n));
        System.out.println(n + "^2 +\t 256" + "\t / " + n + "^2" + "\t = " + v1);
        double res = 1.0;
        for (int i=128; i>1; i/=2) {
            v1 = (n*n)+(i/v1);
            System.out.println(n + "^2 +\t " + i + "\t / " + v1 + "\t = " + v1);
        }
        res = n/v1;
        System.out.println(n + "\t / " + v1 + "\t = " + res);
        System.out.println("Pезультат выражения n: " + res);
        return res;
    }

}