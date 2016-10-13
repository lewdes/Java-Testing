package com.lew.BigTwoDee;

public abstract class CardGame {
	private CardDeck deck;

	public CardGame() {
		deck = new CardDeck();
		deck.shuffle();
		// deck.displayAllCard();
	}

	public CardDeck getDeck() {
		return deck;
	}

	public void setDeck(CardDeck deck) {
		this.deck = deck;
	}

}
