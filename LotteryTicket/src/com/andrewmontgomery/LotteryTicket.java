package com.andrewmontgomery;

public class LotteryTicket {

    public static void main(String[] args) {
        int[][] lotteryCard = new int[3][3];
        // First Column and Row
        lotteryCard[0][0] = 20;
        lotteryCard[0][1] = 15;
        lotteryCard[0][2] = 7;
        // Second Column and Row
        lotteryCard[1][0] = 8;
        lotteryCard[1][1] = 7;
        lotteryCard[1][2] = 19;
        // Third Column and Row
        lotteryCard[2][0] = 7;
        lotteryCard[2][1] = 13;
        lotteryCard[2][2] = 47;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++) {
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}
