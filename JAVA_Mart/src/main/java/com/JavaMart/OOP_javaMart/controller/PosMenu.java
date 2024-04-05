package com.JavaMart.OOP_javaMart.controller;

import com.JavaMart.OOP_javaMart.dto.PosDTO;

import java.util.Scanner;

public class PosMenu {

//    PosDTO posDTO = new PosDTO(); // 이코드를 넣은 이유는 무엇인지? 없어도 잘 작동함..
    PosDTO[] poss = new PosDTO[5];      // 배열 생성 및 할당

    // 메뉴판 생성 - 생성자를 이용 배열 초기화
    public PosMenu(){
        poss[0] = new PosDTO(1,"우유",5,4000,0);
        poss[1] = new PosDTO(2,"라면",5,5000,0);
        poss[2] = new PosDTO(3,"껌",5,2000,0);
        poss[3] = new PosDTO(4,"초콜릿",5,2000,0);
        poss[4] = new PosDTO(5,"물",5,3000,0);
    }

    // 품목별 팔린 수량
    int milkSale;
    int noodleSale;
    int gumSale;
    int chocolateSale;
    int waterSale;


    // 품목별 총 매출
    int totalMilksale;
    int totalNoodlesale;
    int totalGumsale;
    int totalChocolatesale;
    int totalWatersale;

    // 스캐너 객체 생성
    Scanner sc = new Scanner(System.in);

    public void menu(){     // 포스기를 실행시키는 메소드
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
                    String choicePro = sc.next(); // 무슨 품목을 구매했는지를 입력받는다
                    System.out.print("몇 개 구매했나요 : ");
                    String quantityStr = sc.next(); // 몇개를 구매했는지를 입력받는다
                    ProductSales(choicePro,quantityStr);

                    System.out.println(milkSale);
                    System.out.println(noodleSale);
                    System.out.println(gumSale);
                    System.out.println(chocolateSale);
                    System.out.println(waterSale);
                    break;

                case 3:
                    calculateProductRevenue();
                    showTheProduct();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
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
        poss[0].setSales(totalMilksale);
        poss[1].setSales(totalNoodlesale);
        poss[2].setSales(totalGumsale);
        poss[3].setSales(totalChocolatesale);
        poss[4].setSales(totalWatersale);


        for(int i = 0; i < poss.length; i++){



            if(poss[i].getSales() != 0){
                System.out.println("팔린 "+ poss[i].getName() + "의 개수 : " + (5 - poss[i].getQuantity()) + "개 해당 품목 매출 : " + poss[i].getSales() + "원");
            }
        }
    }

    // 재고 수정 메소드 구현
    public void ProductSales(String choicePro, String quantityStr) {
        for (int i = 0; i <  choicePro.length(); i++) {         // 우유 라면 (12) // 24
            int quantity = quantityStr.charAt(i) - '0';
            if(quantity < 6) {
                if (choicePro.charAt(i) == '1') {
                    milkSale = quantity;
                    poss[0].setQuantity(poss[0].getQuantity() - milkSale);
                    poss[0].setSales(milkSale);
                }
                if (choicePro.charAt(i) == '2') {
                    noodleSale = quantity;
                    poss[1].setQuantity(poss[1].getQuantity() - noodleSale);
                    poss[1].setSales(noodleSale);
                }
                if (choicePro.charAt(i) == '3') {
                    gumSale = quantity;
                    poss[2].setQuantity(poss[2].getQuantity() - gumSale);
                    poss[2].setSales(gumSale);
                }
                if (choicePro.charAt(i) == '4') {
                    chocolateSale = quantity;
                    poss[3].setQuantity(poss[3].getQuantity() - chocolateSale);
                    poss[3].setSales(chocolateSale);
                }
                if (choicePro.charAt(i) == '5') {
                    waterSale = quantity;
                    poss[4].setQuantity(poss[4].getQuantity() - waterSale);
                    poss[4].setSales(waterSale);
                }
            }
            else{
                System.out.println("구매할 수량을 초과했습니다");
            }
        }
    }
    

    public void printStorage(){       // 전체 품목의 매출과 수량을 출력

        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜JAVA_MART🟦⬜🟦⬜🟦⬜🟦⬜");
        for(int i = 0; i < poss.length; i++){
            if(poss[i] != null){
                System.out.println(poss[i].information());
            }
        }
        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜");

    }
}
