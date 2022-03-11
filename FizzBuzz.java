public class FizzBuzz {

    public static void fizzbuzz(int value){
        for(int i=1; i<=value; i++){
            if(i%15==0){
                System.out.print("FizzBuzz");
            }else if(i%5==0){
                System.out.print("Buzz");
            }else if(i%3==0){
                System.out.print("Fizz");
            }else{
                System.out.print(i);
            }
            if(i!=value){
                System.out.print(",");
            }
        }

    }

    public static void main(String[] args){
        fizzbuzz(5);
        System.out.println();
        fizzbuzz(15);
        System.out.println();
        fizzbuzz(50);
    }
}
