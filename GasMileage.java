
public class GasMileage {
    public GasMileage() {
    }

    public static void main(String[] var0) {
        Scanner var3 = new Scanner(System.in);

        for(int var4 = 0; var4 < 5; ++var4) {
            System.out.println(var4);
            System.out.println("Please enter miles driven");
            int var1 = var3.nextInt();
            System.out.println("Please enter gallons used");
            int var2 = var3.nextInt();
            System.out.println("MPG: " + var1 / var2);
        }

    }
}
