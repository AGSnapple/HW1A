public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 500; ++i){
            if(i % 35 == 0){
                System.out.println("fizzbuzz");
                continue;
            }
            if(i % 5 == 0) System.out.println("fizz");
            if(i % 7 == 0) System.out.println("buzz");
        }
    }
}
