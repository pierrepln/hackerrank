/*
made for HackerRank Java: Calculating Volume
Tue 2nd February 2016

Made with <3 by Pierre Plantié
*/

class Calculate {
    public Output output;
    public Scanner sc = new Scanner(System.in);

    public int getINTVal() throws IOException {
        int input = sc.nextInt();
        if (input <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return input;
    }

    public double getDoubleVal() throws IOException{
        double input = sc.nextDouble();
        if (input <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return input;
    }

    public static Volume get_Vol() {
        return new Volume();
    }
}

class Volume{

    public double main(int a) {
        return a * a * a;
    }

    public double main(int l, int b, int h) {
        return l * b * h;
    }

    public double main(double r) {
        return Math.PI * Math.pow(r, 3) * 4 / 3 / 2;
    }

    public double main(double r, double h) {
        return Math.PI * r * r * h;
    }
}

class Output {
    public static void display(double number) {
       System.out.println(String.format("%.3f", number));
    }
}
