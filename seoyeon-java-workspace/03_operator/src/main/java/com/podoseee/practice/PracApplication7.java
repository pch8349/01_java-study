package com.podoseee.practice;

public class PracApplication7 {
    public static void main(String[] args) {
        int numOfApples = 92;  // 총 사과 개수
        int sizeOfBucket = 10; // 바구니당 담을 수 있는 최대 개수
        int numOfBucket = (numOfApples % sizeOfBucket == 0) ? (numOfApples/sizeOfBucket) : ((numOfApples/sizeOfBucket)+1);   // 필요한 바구니 수

        System.out.println("필요한 바구니의 수 : " + numOfBucket);  // 10이 출력되어야됨
    }
    //질문
}
