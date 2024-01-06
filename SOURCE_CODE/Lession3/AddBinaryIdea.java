package Lession3;

public class AddBinaryIdea {

    public static void main(String[] args) {
        AddBinaryIdea solotion = new AddBinaryIdea();
        String aString = "11";
        String bString = "1";

        int a,b=0;
        a = Integer.parseInt(aString);
        b = Integer.parseInt(bString);

        int c = a + b;

        System.out.println("Value a: ");
        solotion.convertDecimalToBinary(a);
        System.out.println();

        System.out.println("Value b: " );
        convertDecimalToBinary(b);
        System.out.println();

        System.out.println("Sum a+b: ");
        convertDecimalToBinary(c);
        System.out.println();
    }

    private static void convertDecimalToBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);

        }
    }
}
