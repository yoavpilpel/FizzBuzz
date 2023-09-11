public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i < 1001){
            if (i%3 == 0 || i%5 == 0){
                sum ++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
