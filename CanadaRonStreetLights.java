import java.util.Arrays;
import java.util.Scanner;
public class CanadaRonStreetLights {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
       System.out.println("The street lights in Ron Street");
       boolean Street_lights = sc.nextBoolean();
        
       int one_block = 125;
       if(Street_lights==true && one_block >=125)
       {
        System.out.println("Enter the height of the Street lights:");
        String [][][] St_lgts = new String[4][4][4];

        St_lgts[0][0][0] = "37 ft";
        St_lgts[0][0][1] = "37 ft";
        St_lgts[0][0][2] = "37 ft";
        St_lgts[0][0][3] = "37 ft";
        St_lgts[0][1][0] = "37 ft";
        St_lgts[0][1][1] = "37 ft";
        St_lgts[0][1][2] = "37 ft";
        St_lgts[0][1][3] = "37 ft";
        St_lgts[0][2][0] = "37 ft";
        St_lgts[0][2][1] = "37 ft";
        St_lgts[0][2][2] = "37 ft";
        St_lgts[0][2][3] = "37 ft";
        St_lgts[0][3][0] = "37 ft";
        St_lgts[0][3][1] = "37 ft";
        St_lgts[0][3][2] = "37 ft";
        St_lgts[0][3][3] = "37 ft";
     

        System.out.println(St_lgts[0][0][0]);
        System.out.println(St_lgts[0][0][1]);
        System.out.println(St_lgts[0][0][2]);
        System.out.println(St_lgts[0][0][3]);
        System.out.println(St_lgts[0][1][0]);
        System.out.println(St_lgts[0][1][1]);
        System.out.println(St_lgts[0][1][2]);
        System.out.println(St_lgts[0][1][3]);
        System.out.println(St_lgts[0][2][0]);
        System.out.println(St_lgts[0][2][1]);
        System.out.println(St_lgts[0][2][2]);
        System.out.println(St_lgts[0][2][3]);
        System.out.println(St_lgts[0][3][0]);
        System.out.println(St_lgts[0][3][1]);
        System.out.println(St_lgts[0][3][2]);
        System.out.println(St_lgts[0][3][3]);

       }
    }
}
