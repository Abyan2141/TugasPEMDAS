import java.util.Scanner;

public class MenghitungEnergi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double m = 0;
        double v = 0;
        double h = 0;
        double g = 10;

        System.out.print("massa = ");
        m = in.nextDouble();
        System.out.print("kecepatan = ");
        v = in.nextDouble();
        System.out.print("ketinggian = ");
        h = in.nextDouble();

        double EP = m * g * h;
        System.out.println("Energi potensial = " + EP);
        double EK = (m * v * v) / 2;
        System.out.println("Energi kinetik = " + EK);
        double EM = EP + EK;
        System.out.println("Energi mekanik = " + EM);
        
    }
}
