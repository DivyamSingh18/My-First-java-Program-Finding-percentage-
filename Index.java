import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write ur name, plz");
        String name = input.nextLine();
        System.out.println("Enter ur Roll no.");
        int roll = input.nextInt();

        System.out.println("Enter the marks of physics, chemistry, Maths/Bio respectively!");
        float phy = input.nextFloat();
        float che = input.nextFloat();
        float third = input.nextFloat();

        float total = (phy + che + third);
        System.out.println("Total marks are : "+ total);
        float percentage = (total/300)*100;
        System.out.println("The Percentage of " + name +" having roll no. "+roll+" is "+percentage );



    }


}
