public class Main {

    public static void main(String[] args) {

        double a = 5;
        double b = 3.5;
        double c = 0.25;

        if ((a > 0) && (Math.pow(b, 2) + 4 * a * c >= 0)) // под корнем тоже не должно быть отрицательного значения
        { // а в скобках записываем тот код, который должен выполниться, если выполняется условие
            double x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
            System.out.println("X =  " + x);
        }
        
        double s = 154;
        double q = Math.pow(s, 2) + Math.pow(s, 3);
        System.out.println("Q =  " + q);

        double m = 159;
        double t = m -(Math.pow(q, 3)/3)+(Math.pow(m, 5)/5);
        System.out.println("T =  " + t);

        double n = 5, v =4;
        if ((n > 0) && ( v > 0))
        {
            double k = ((n + v) / (v+1))-((n*v)-12)/(34+n);
            System.out.println("K =  " + k);
        }
        
        double g = 3;
        double h = (Math.sin ( Math.sqrt ( g + 1 )))-(Math.sin ( Math.sqrt( g - 1 )));
        System.out.println("H = " + h );
    }



}


