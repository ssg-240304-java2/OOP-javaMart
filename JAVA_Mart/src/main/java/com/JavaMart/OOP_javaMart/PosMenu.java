package com.JavaMart.OOP_javaMart;

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


    Scanner sc = new Scanner(System.in);

    public void menu(){     // 메뉴

    }

    public void editStorage(){        // 물건 개수 수정

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



}
