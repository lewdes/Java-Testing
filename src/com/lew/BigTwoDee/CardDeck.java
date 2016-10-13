package com.lew.BigTwoDee;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
	private Stack<Card> cards;

	public CardDeck() {
		cards = new Stack<Card>();

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(s, r));
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void displayAllCard() {
		for (Card c : cards) {
			System.out.println("Rank: " + c.getRank() + "/" + "Suit: "
					+ c.getSuit());
		}
	}
	
}
