import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        //sekcja losowania - a
        int a;
        BufferedReader br_a = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadzenie wartości pomiędzy zakresem liczb: ");
        a = Integer.parseInt(br_a.readLine());
        System.out.println("Podaj zawartość danej liczby a: ");
        int upperbound_a = a;
        int int_random_a = rand.nextInt(upperbound_a);
        double double_random_a=rand.nextDouble();
        float float_random_a=rand.nextFloat();
        System.out.println("Generowanie zmiennej liczby a do: " + (upperbound_a-1) + " wynosi: " + int_random_a + ".");
        System.out.println("Losowanie zmiennej typu - float value pomiędzy 0.0 a 1.0  wynosi: "+float_random_a + ".");
        System.out.println("Losowanue zmiennej typpu - value pomiędzy 0.0 a 1.0 wynosi: "+double_random_a + ".");
        System.out.println("-----------------------------------------------------------------------------------------");
        //sekcja losowania - b
        int b;
        BufferedReader br_b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Wprowadzenie wartości pomiędzy zakresem liczb: ");
        b = Integer.parseInt(br_b.readLine());
        System.out.println("Podaj zawartość danej liczby b:");
        int upperbound_b = b;
        int int_random_b = rand.nextInt(upperbound_b);
        double double_random_b=rand.nextDouble();
        float float_random_b=rand.nextFloat();
        System.out.println("Generowanie zmiennej liczby a do: " + (upperbound_b-1) + " wynosi: " + int_random_b + ".");
        System.out.println("Losowanie zmiennej typu - float value pomiędzy 0.0 a 1.0  wynosi: "+float_random_b + ".");
        System.out.println("Losowanue zmiennej typpu - value pomiędzy 0.0 a 1.0 wynosi: "+double_random_b + ".");
        System.out.println("-----------------------------------------------------------------------------------------");
        int c_1 = (int_random_a + int_random_b) ^ 2;
        System.out.println("Wynik wynosi: " + c_1);
        float c_2 = (float_random_a + float_random_b);
        System.out.println("Wynik wynosi: " + c_2);
        double c_3 = double_random_a + double_random_b;
        System.out.println("Wynik wynosi: " + c_3);
        System.out.println("-----------------------------------------------------------------------------------------");
        int y, e, z;
        e = (int) 2.71828182845904523536028747135266249775724709369995;
        System.out.println("Obliczenie warości pewnej funkcji nr 1- wykaz");
        for (a = 0; a < int_random_b; a ++)
        {
            y = (a + b) * e;
            System.out.println("Zmienne - wyakaz:" + y + " (.)");
        }
        System.out.println("Obliczenie wartości pewnej funkcji nr 2 - wykaz");
        for (a = 0; a < int_random_b && a <= 100 && b > a; a --)
        {
            z = ((((a + b) * (a + b)) ^ e) / (((a - b) * (a - b)) ^ e)) * int_random_a;
            System.out.println("Zmienne - wyakaz:" + z + " (.)");
        }
    }
}