package com.JavaMart.OOP_javaMart;

import java.util.Date;
import java.util.Scanner;

public class PosMenu {

    PosDTO posDTO = new PosDTO();
    PosDTO[] poss = new PosDTO[5];      // 배열 생성 및 할당
    PosDTO[] poss1 = new PosDTO[5];

    // 메뉴판 생성 - 배열 초기화
    public PosMenu(){
        poss[0] = new PosDTO(new Date(),1,"우유",5,4000);
        poss[1] = new PosDTO(new Date(),2,"라면",5,5000);
        poss[2] = new PosDTO(new Date(),3,"껌",5,2000);
        poss[3] = new PosDTO(new Date(),4,"초콜릿",5,2000);
        poss[4] = new PosDTO(new Date(),5,"물",5,3000);
    }


    Scanner sc = new Scanner(System.in);

    public void menu(){     // 메뉴
        while(true){
            System.out.println("1.재고 출력");
            System.out.println("2.재고 수정");
            System.out.println("3.매출 출력");
            System.out.println("9.프로그램 종료");
            System.out.print("매뉴를 선택해주세요 : ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    printStorage();
                    break;
                case 2:
                    System.out.println("손님이 구매한 수량은 : " + editStorage());
                    break;
                case 3:
                    calculateProductRevenue();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
            }
        }

    }
    public String editStorage(){        // 재고 안에서 손님이 구매한 품목 수량 도출.
        System.out.println("1 : 우유, 2 : 라면, 3 : 껌, 4 : 초콜릿, 5 : 물");
        System.out.print("손님이 무슨 물건을 구매했습니까 : ");
        int Num1 = sc.nextInt();

        System.out.print("얼마나 구매했나요 : ");
        int qutantity = sc.nextInt();
        int result = 0;

        if (qutantity > 5){
            System.out.println("수량을 벗어난 구매입니다.");
            return ("번호 " + Num1 + " 의 품목을 " + result + "개 구매했습니다");
        }
        else{
            return ("번호 "+  Num1 + " 의 품목을 " + qutantity + "개 구매했습니다");
        }
    }

    public int calculateProductRevenue(){     // 물건 매출 계산
        //먼저 위에 메소드에서 나온 스트링을 charat을 이용해서 슬라이싱을 해준다.
        //첫번째 숫자는 char는 품목이고 두번째 숫자는 품목이 팔린 내용입니다.
        //첫번째 숫자에 해당하는 품목의 가격을 뽑아내고
        //두번째 숫자와 가격과 곱하기 해서 그값을 리턴해준다.


        return editStorage().charAt(11);
    }

    public void showTheProduct(){      // 물건 개수 및 매출 출력

    }

    public void printStorage(){       // 전체 결과 출력

        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜JAVA_MART🟦⬜🟦⬜🟦⬜🟦⬜");
        for(int i = 0; i < poss.length; i++){
            if(poss[i] != null){
                System.out.println(poss[i].information());
            }
        }
        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜");

    }
}
