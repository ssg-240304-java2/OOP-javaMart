package com.JavaMart.OOP_javaMart.controller;

import com.JavaMart.OOP_javaMart.dto.PosDTO;

import java.util.Scanner;

public class PosMenu {

    PosDTO posDTO = new PosDTO();
    PosDTO[] poss = new PosDTO[5];      // 배열 생성 및 할당
    PosDTO[] poss1 = new PosDTO[5];

    // 메뉴판 생성 - 배열 초기화
    public PosMenu(){
        poss[0] = new PosDTO(1,"우유",5,4000,0);
        poss[1] = new PosDTO(2,"라면",5,5000,0);
        poss[2] = new PosDTO(3,"껌",5,2000,0);
        poss[3] = new PosDTO(4,"초콜릿",5,2000,0);
        poss[4] = new PosDTO(5,"물",5,3000,0);
    }
    int milkSale;
    int noodleSale;
    int gumSale;
    int chocolateSale;
    int waterSale;

    int totalMilksale;
    int totalNoodlesale;
    int totalGumsale;
    int totalChocolatesale;
    int totalWatersale;

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
        totalMilksale = poss[0].getPrice() * milkSale;
        totalNoodlesale = poss[1].getPrice() * noodleSale;
        totalGumsale = poss[2].getPrice() * gumSale;
        totalChocolatesale = poss[3].getPrice() * chocolateSale;
        totalWatersale = poss[4].getPrice() * waterSale;
    }

    public void showTheProduct(){      // 물건 개수 및 매출 출력
        //setter를 이용하여 매출 계산한 값을 넣고 getter로 갖고오기
        poss[0].setSales(poss[0].getPrice() * milkSale);
        poss[1].setSales(poss[1].getPrice() * noodleSale);
        poss[2].setSales(poss[2].getPrice() * gumSale);
        poss[3].setSales(poss[3].getPrice() * chocolateSale);
        poss[4].setSales(poss[4].getPrice() * waterSale);
        System.out.println(poss[0].getSales());
        System.out.println(poss[1].getSales());
        System.out.println(poss[2].getSales());
        System.out.println(poss[3].getSales());
        System.out.println(poss[4].getSales());

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
