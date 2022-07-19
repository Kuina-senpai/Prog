public class Acat {
    public static long n0(double eps){
        return (long)(Math.ceil(1.0 / (4.0 * Math.pow(eps,2.0) ) ));
    }

    public static long n1(double eps){
        return (long)(Math.ceil((141.0 - (77.0 * eps)) / (121 * eps)));
    }

    public static long n2(double M){
        return (long)(Math.ceil(Math.pow(23.0 * M, 2.0)));
    }




}

