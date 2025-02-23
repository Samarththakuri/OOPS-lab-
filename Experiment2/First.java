public class First {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {    //no. of rows ke lie   i<= rows use kis 1 line extra
            for (int j = 0; j < i; j++) {
                System.out.print(" ");     // spaces print ke lie
            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");  // stars
            }
            System.out.println(); // nayi line ke lie           println ki jagah print use kia
}

}
}