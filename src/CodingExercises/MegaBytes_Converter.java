package CodingExercises;

public class MegaBytes_Converter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1);

    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        double conversion = 1.024;
        double megaBytes = (kiloBytes / conversion);
        double remainder = (kiloBytes % conversion);
        if (kiloBytes == 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB  and " + remainder + " KB");
        }
    }
}
