package org.example;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        int[] nums = new int[4];
        try {
            for (int i = 0; i<4; i++){
                Scanner in = new Scanner(System.in);
                System.out.println("Input a" + i + " number: ");
                nums[i] = in.nextInt();
                if (nums[i] < 0)throw new Exception("Введено отрицательное значение");
            }
        }catch (Exception e){System.out.println(e); System.exit(0);}
        if ((nums[2]>=nums[0] && nums[2]<=nums[1] && nums[3] >= nums[1]) || (nums[2]>=nums[1] && nums[2]<=nums[0] && nums[3] >= nums[0])
                || (nums[3]>=nums[0] && nums[3]<=nums[1] && nums[2] >= nums[1]) || (nums[3]>=nums[1] && nums[3]<=nums[0] && nums[2] >= nums[0]))
        {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}