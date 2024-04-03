package com.JavaMart.OOP_javaMart;

import java.util.Scanner;

public class PosMenu {

    PosDTO posDTO = new PosDTO();
    PosDTO[] poss = new PosDTO[5];      // 배열 생성 및 할당
    PosDTO[] poss1 = new PosDTO[5];

    // 메뉴판 생성 - 배열 초기화
    public PosMenu(){
        poss[0] = new PosDTO(1,"우유",5,4000);
        poss[1] = new PosDTO(2,"라면",5,5000);
        poss[2] = new PosDTO(3,"껌",5,2000);
        poss[3] = new PosDTO(4,"초콜릿",5,2000);
        poss[4] = new PosDTO(5,"물",5,3000);
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
                    editStorage();
                    edditedprintStorage();
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

    public void editStorage(){        // 배열 복사뒤 재고 수정
        System.out.println("0 : 우유, 1 : 라면, 2 : 껌, 3 : 초콜릿, 4 : 물");
        System.out.print("어떤 물품의 재고를 수정하실건가요 : ");
        int product = sc.nextInt();
        System.out.print("얼마나 물품이 남았나요 : ");
        int qutantity = sc.nextInt();
        
        poss1[0] = new PosDTO();
        poss1[1] = new PosDTO();
        poss1[2] = new PosDTO();
        poss1[3] = new PosDTO();
        poss1[4] = new PosDTO();

        for (int i = 0; i < poss.length; i++) {
            poss1[i].setNum(poss[i].getNum());
            poss1[i].setName(poss[i].getName());
            poss1[i].setQuantity(poss[i].getQuantity());
            poss1[i].setPrice(poss[i].getPrice());
        }
        poss1[product].setQuantity(qutantity);

    }

    public int calculateProductRevenue(){     // 물건 매출 계산
        return 0;
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

    public void edditedprintStorage(){       // 수정된 제고 출력

        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜JAVA_MART🟦⬜🟦⬜🟦⬜🟦⬜");
        for(int i = 0; i < poss1.length; i++){
            if(poss1[i] != null){
                System.out.println(poss1[i].information());
            }
        }
        System.out.println("🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜🟦⬜");

    }



}
