public class Main{
    public static void main(String[] args){
        int temperature = 31;

        if (temperature > 30){
            System.out.println("It's a hot day, drink plenty of water");
        }else if(temperature > 20 && temperature < 30){
            System.out.println("It's a nice day");
        }else{
            System.out.println("Its cold!");
        }
    }
}