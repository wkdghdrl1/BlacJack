package com.biz.blackjack.service;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.biz.blackjackm.model.DeckVO;

public class BlackJackSevice {

	private List<DeckVO> deckList;
	private String suit = "다이아몬드(◈):하트(♥):스페이트(♠):클로버(♣)";
	private String denomination = "A234567890KQJ";

	public BlackJackSevice() {
		deckList = new ArrayList();
	}
	
	
	
	public List<DeckVO> getDeck(){
		for(int i = 0; i < 50 ; i++)	{
			Collections.shuffle(deckList);
		}

		return deckList;
	}

	public void makeDeck() {

		String[] suits = suit.split(":");
		String[] denominations = denomination.split("");

		for (String s : suits) {
			for (String d : denominations) {

				DeckVO vo = new DeckVO();
				vo.setSuit(s);
				vo.setDenomiation(d);

				int intValue = 0;

				try {
					intValue = Integer.valueOf(d);
					if (intValue == 0)
						intValue = 10;
				} catch (Exception e) {
					if (d.equals("A")) {
						intValue = 1;
					} else {
						intValue = 10;
					}
				}
		
				vo.setValue(intValue);
				deckList.add(vo);

			}

		}
	}

	public void viewCardList() {
		for (DeckVO vo : deckList) {
			System.out.println(vo.toString());
			System.out.println("===========================================================");
		}
		
		System.out.println("카드매수 : " + deckList.size());
	}
	
	

}
