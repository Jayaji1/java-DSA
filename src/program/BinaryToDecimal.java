package program;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary="1001001";
        int decimal=Integer.parseInt(binary,2);
        System.out.println("binary" + binary);
        System.out.println("decimal" + decimal);

    }
}
