package com.JavaMart.OOP_javaMart.controller;

import com.JavaMart.OOP_javaMart.dto.PosDTO;

import java.util.Date;
import java.util.Scanner;

public class PosMenu {

    PosDTO posDTO = new PosDTO();
    PosDTO[] poss = new PosDTO[5];      // 배열 생성 및 할당
    // 메뉴판 생성 - 배열 초기화
    public PosMenu(){
        poss[0] = new PosDTO(1,"우유",5,4000);
        poss[1] = new PosDTO(2,"라면",5,5000);
        poss[2] = new PosDTO(3,"껌",5,2000);
        poss[3] = new PosDTO(4,"초콜릿",5,2000);
        poss[4] = new PosDTO(5,"물",5,3000);
    }

    // 품목별 판매된 수량
    int milkSale;
    int noodleSale;
    int gumSale;
    int chocolateSale;
    int waterSale;


    // 각 품목의 총 매출
    int totalMilkSale;
    int totalNoodleSale;
    int totalGumSale;
    int totalChocolateSale;
    int totalWaterSale;


    Scanner sc = new Scanner(System.in);

    public void menu(){     // 메뉴
        while(true){
            System.out.println("-----포스기------");
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
                    System.out.println("1 : 우유, 2 : 라면, 3 : 껌, 4 : 초콜릿, 5 : 물");
                    System.out.print("손님이 무슨 물품을 구매했습니까 : ");
                    int choicePro = sc.nextInt();
                    if (choicePro == 1){
                        milkSale = salesByCustomer(); //우유 매출
                    }
                    if (choicePro == 2) {
                        noodleSale = salesByCustomer(); //라면 매출
                    }
                    if (choicePro == 3) {
                        gumSale = salesByCustomer(); //검매출
                    }
                    if (choicePro == 4){
                        chocolateSale = salesByCustomer(); //초콜릿 매출
                    }
                    if (choicePro == 5){
                        waterSale = salesByCustomer(); //물 매출
                    }
                    break;
                case 3:
                    showTheProduct();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
            }
        }

    }
    public int salesByCustomer(){        // 재고 안에서 손님이 구매한 품목 수량 도출.
//        System.out.println("1 : 우유, 2 : 라면, 3 : 껌, 4 : 초콜릿, 5 : 물");
//        System.out.print("손님이 무슨 물건을 구매했습니까 : ");
//        int Num1 = sc.nextInt();
        System.out.print("얼마나 구매했나요 : ");
        int qutantity = sc.nextInt();
        int result;

        if (qutantity > 5){
            System.out.println("수량을 벗어난 구매입니다.");
            result = 0;
        }
        else{
            result = qutantity;
        }
        return result;
    }

    public void calculateProductRevenue(){     // 물건 매출 계산
        totalMilkSale = poss[0].getPrice() * milkSale;
        totalNoodleSale = poss[1].getPrice() * noodleSale;
        totalGumSale = poss[2].getPrice() * gumSale;
        totalChocolateSale = poss[3].getPrice() * chocolateSale;
        totalWaterSale = poss[4].getPrice() * waterSale;
    }

    public void showTheProduct(){  // 물건 개수 및 매출 출력
        System.out.println(posDTO.getRevenueDate() + "밀크의 판매수량은 " + milkSale +  "개 이고, 매출은 " + totalMilkSale + "원입니다.");
        System.out.println(posDTO.getRevenueDate() + "라면의 판매수량은 " + noodleSale +  "개 이고, 매출은 " + totalNoodleSale + "원입니다.");
        System.out.println(posDTO.getRevenueDate() + "껌의 판매수량은 " + gumSale +  "개 이고, 매출은 " + totalGumSale + "원입니다.");
        System.out.println(posDTO.getRevenueDate() + "초콜릿의 판매수량은 " + chocolateSale +  "개 이고, 매출은 " + totalChocolateSale + "원입니다.");
        System.out.println(posDTO.getRevenueDate() + "물의 판매수량은 " + waterSale +  "개 이고, 매출은 " + totalWaterSale + "원입니다.");
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
