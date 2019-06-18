package com.biz.blakjack.controller;

import java.util.Scanner;

import com.biz.blackjack.service.BlackJackSevice;
import com.biz.blackjack.service.PlayService;

public class BlcakJack_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BlackJackSevice bs = new BlackJackSevice();
		bs.makeDeck();

		while (true) {
			System.out.println("============================================");
			System.out.println(" Game start");
			System.out.println("============================================");

			PlayService dealer = new PlayService(bs.getDeck(), "딜러");
			PlayService player = new PlayService(bs.getDeck(), "플레이어");
			
			for (int i = 0; i < 2; i++) {
				dealer.hit();
				player.hit();
			}

			while (true) {
				System.out.println("============================================");
				System.out.println("1.Hit          	 2.Stand           0.GameEnd");
				System.out.println("--------------------------------------------");
				System.out.println("선택>>");
				String strMenu = scan.nextLine();

				try {
					int intMenu = Integer.valueOf(strMenu);
					if (intMenu == 0) {
						System.out.println("Good Bye!!");
						return;
						// main method에서 return문을 만나면
						// 프로젝트 실행이 종료된다.
					}
					if(intMenu == 1 ) {
						dealer.hit();
						player.hit();
					}
					
					int dSum = dealer.sumValue();
					int pSum = player.sumValue();
					
					if(pSum > 21) {
						System.out.println("딜러 승리");
						System.out.println();
						break;
					}else if(dSum > 21) {
						System.out.println("플레이어 승리");
						System.out.println();
						break;
					}
					
					if(intMenu == 2) {
						if(dSum > pSum) {
							System.out.println("딜러 승리");
							System.out.println();
						}else {
							System.out.println("플레이어 승리");
							System.out.println();
						}
						System.out.println("아무키나 누르세요");
						break;
					}
					
					
				

				} catch (Exception e) {
				}

			}
		}
	}

}
