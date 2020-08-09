package com.programing;

public class Main {

    public static void main(String[] args) {
        int mk1 = 70;
        int mk2 = 80;
        int mk3 = 90;
        int tot = mk1 + mk2 + mk3;
        double avg = tot / 3;
        String grd;
        if(avg>=80){
            grd = "Distinction";
        }else if(avg >= 70) {
            grd = "Merit";
        }else {
            grd = "Fail";
        }

        System.out.println("Total :" + tot);
        System.out.println("Average : "+avg);
        System.out.println("Grade : "+grd);

    }
}
