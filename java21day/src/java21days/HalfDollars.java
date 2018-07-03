package java21days;

class HalfDollars {
    public static void main(String[] arguments) {
        int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
        int[] philadelpha = new int [denver.length];
        int[] total = new int[denver.length];
        int average;
        
        philadelpha[0] = 1_800_000;
        philadelpha[1] = 5_000_000;
        philadelpha[2] = 2_500_000;
        
        total[0] = denver[0] + philadelpha[0];
        total[1] = denver[1] + philadelpha[1];
        total[2] = denver[2] + philadelpha[2];
        average = (total[0] + total[1] + total[2] / 3);
        
        System.out.print("2012 production: ");
        System.out.format("%,d%n", total [0]);
        System.out.print("2013 production: ");
        System.out.format("%,d%n", total [1]);
        System.out.print("2014 production: ");
        System.out.format("%,d%n", total [2]);
        System.out.print("Averageproduction: ");
        System.out.format("%,d%n", average);
        
        
    }
}