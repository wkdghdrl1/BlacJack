package com.biz.blackjackm.model;

public class DeckVO {
	
	private String suit; // 카드 무늬
	private String denomiation; //표면값 
	private int value; //실제점수
	
	
	public DeckVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeckVO(String suit, String denomiation, int value) {
		super();
		this.suit = suit;
		this.denomiation = denomiation;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getDenomiation() {
		return denomiation;
	}
	public void setDenomiation(String denomiation) {
		this.denomiation = denomiation;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "DeckVO [suit=" + suit + ", denomiation=" + denomiation + ", value=" + value + "]";
	}
	
	
}
