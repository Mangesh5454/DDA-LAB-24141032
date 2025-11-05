import java.util.Scanner;

class Addition
{
    int sum;

    Addition(int a, int b)
    {
        sum = a + b;
        System.out.println("Sum of 2 numbers: " + sum);
    }

    Addition(int a, int b, int c)
    {
        sum = a + b + c;
        System.out.println("Sum of 3 numbers: " + sum);
    }

    Addition(int a, int b, int c, int d)
    {
        sum = a + b + c + d;
        System.out.println("Sum of 4 numbers: " + sum);
    }

    Addition(int a, int b, int c, int d, int e)
    {
        sum = a + b + c + d + e;
        System.out.println("Sum of 5 numbers: " + sum);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        new Addition(a, b);

        System.out.println("Enter 3 numbers:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        new Addition(x, y, z);

        System.out.println("Enter 4 numbers:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        new Addition(p, q, r, s);

        System.out.println("Enter 5 numbers:");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        new Addition(i, j, k, l, m);
    }
}
