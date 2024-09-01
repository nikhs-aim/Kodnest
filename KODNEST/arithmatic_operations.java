import java.util.Scanner;

class arithmatic_operations {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
    	Scanner scan=new Scanner(System.in);
    	add();
    	
    	System.out.println("Please enter a number to subtract");
    	int num1=scan.nextInt();
    	System.out.println("Please enter a number to subtract");
    	int num2=scan.nextInt();
        subtraction(num1,num2);
        
        System.out.println("Please enter a number to multiply");
        int num3=scan.nextInt();
        System.out.println("Please enter a number to multiply");
    	int num4=scan.nextInt();
        int mul=multiply(num3,num4);
        System.out.println("Product ="+mul);
        
        double q=divide();
        
        System.out.println("Quotient="+q);
    }
    public static void add(){
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Please enter a number to add");
    	int num1=scan.nextInt();
    	System.out.println("Please enter a number to add");
    	int num2=scan.nextInt();
    	
        int sum=num1+num2;
        System.out.println("Sum = "+sum);
    }
    public static void subtraction(int num1, int num2){
    	
        int diff=num1-num2;
        System.out.println("Difference ="+diff);
    }
    public static int multiply(int num1,int num2){
    	
        int product=num1*num2;
        return product;
    }
    public static double divide(){
//        int num1=11;
//        int num2=5;
        
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Please enter a number to divivde");
    	int num1=scan.nextInt();
    	System.out.println("Please enter a number to divide");
    	int num2=scan.nextInt();
    	double res=num1/(double)num2;
        return res;
        
    }
}