package com.biz.blakjack.controller;

import com.biz.blackjack.service.BlackJackSevice;

public class BlackJack_01 {

	public static void main(String[] args) {
		
		BlackJackSevice bs = new BlackJackSevice();
		
		bs.makeDeck();
		bs.viewCardList();
	}

}
