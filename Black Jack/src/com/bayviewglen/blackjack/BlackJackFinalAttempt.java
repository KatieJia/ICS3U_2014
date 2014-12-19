package com.bayviewglen.blackjack;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BlackJackFinalAttempt {
	private static String[] cards;
	private static int[] values;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		initialiseCards();
		introduction();

		//get the players name
		String userName = getUserName(scanner);
		while (!userName.equalsIgnoreCase("quit")) {
			int wallet = 500;
			boolean done = false;
			NumberFormat formatter = getFormatter(scanner);

			while (!done) {
				wallet = playOneHand(scanner, wallet, formatter);

				done = (wallet == 0) || !playAgain(scanner);
			}

			userName = getUserName(scanner);
		}

		closingMessage();
		scanner.close();
	}

	//used arrays to store the cards and values
	private static void initialiseCards() {
		cards = new String[52];

		cards[0] = "AS";
		cards[1] = "2S";
		cards[2] = "3S";
		cards[3] = "4S";
		cards[4] = "5S";
		cards[5] = "6S";
		cards[6] = "7S";
		cards[7] = "8S";
		cards[8] = "9S";
		cards[9] = "10S";
		cards[10] = "JS";
		cards[11] = "QS";
		cards[12] = "KS";

		cards[13] = "AD";
		cards[14] = "2D";
		cards[15] = "3D";
		cards[16] = "4D";
		cards[17] = "5D";
		cards[18] = "6D";
		cards[19] = "7D";
		cards[20] = "8D";
		cards[21] = "9D";
		cards[22] = "10D";
		cards[23] = "JD";
		cards[24] = "QD";
		cards[25] = "KD";

		cards[26] = "AC";
		cards[27] = "2C";
		cards[28] = "3C";
		cards[29] = "4C";
		cards[30] = "5C";
		cards[31] = "6C";
		cards[32] = "7C";
		cards[33] = "8C";
		cards[34] = "9C";
		cards[35] = "10C";
		cards[36] = "JC";
		cards[37] = "QC";
		cards[38] = "KC";

		cards[39] = "AH";
		cards[40] = "2H";
		cards[41] = "3H";
		cards[42] = "4H";
		cards[43] = "5H";
		cards[44] = "6H";
		cards[45] = "7H";
		cards[46] = "8H";
		cards[47] = "9H";
		cards[48] = "10H";
		cards[49] = "JH";
		cards[50] = "QH";
		cards[51] = "KH";

		values = new int[52];

		values[0] = 1;
		values[1] = 2;
		values[2] = 3;
		values[3] = 4;
		values[4] = 5;
		values[5] = 6;
		values[6] = 7;
		values[7] = 8;
		values[8] = 9;
		values[9] = 10;
		values[10] = 10;
		values[11] = 10;
		values[12] = 10;

		values[13] = 1;
		values[14] = 2;
		values[15] = 3;
		values[16] = 4;
		values[17] = 5;
		values[18] = 6;
		values[19] = 7;
		values[20] = 8;
		values[21] = 9;
		values[22] = 10;
		values[23] = 10;
		values[24] = 10;
		values[25] = 10;

		values[26] = 1;
		values[27] = 2;
		values[28] = 3;
		values[29] = 4;
		values[30] = 5;
		values[31] = 6;
		values[32] = 7;
		values[33] = 8;
		values[34] = 9;
		values[35] = 10;
		values[36] = 10;
		values[37] = 10;
		values[38] = 10;

		values[39] = 1;
		values[40] = 2;
		values[41] = 3;
		values[42] = 4;
		values[43] = 5;
		values[44] = 6;
		values[45] = 7;
		values[46] = 8;
		values[47] = 9;
		values[48] = 10;
		values[49] = 10;
		values[50] = 10;
		values[51] = 10;

	}

	// this method is done
	private static NumberFormat getFormatter(Scanner scanner) {
		Locale l = getLocale(scanner);

		return NumberFormat.getCurrencyInstance(l);
	}

	//player chooses which locale to play in
	private static Locale getLocale(Scanner scanner) {
		while (true) {
			System.out.println("Please choose a currency you would like to play in: ");
			System.out.println("1. Canada");
			System.out.println("2. China");
			System.out.println("3. Germany");
			System.out.println("4. France");
			System.out.println("5. America");

			String countryName = scanner.nextLine();

			int country = 0;
			try {
				country = Integer.parseInt(countryName);
			} catch (NumberFormatException ex) {

			}

			if (country == 1) {
				return Locale.CANADA;
			} else if (country == 2) {
				return Locale.CHINA;
			} else if (country == 3) {
				return Locale.GERMAN;
			} else if (country == 4) {
				return Locale.FRANCE;
			} else if (country == 5) {
				return Locale.US;
			} else {
				System.out.println(countryName + " is not a valid input, Please try again.");
			}
		}
	}

	// closing method for when the game is finished
	private static void closingMessage() {
		System.out.println("Thank you for playing!");

	}

	//asks the player if they would like to play again, if not, restart the game
	private static boolean playAgain(Scanner scanner) {
		System.out.println("Do you want to play again?");
		while (true) {
			String play = scanner.nextLine();
			if (play.equalsIgnoreCase("yes")) {
				return true;
			} else if (play.equalsIgnoreCase("no")) {
				return false;
			}
			System.out.print("Yes or no please: ");
		}
	}

	private static int playOneHand(Scanner scanner, int wallet, NumberFormat formatter) {
		int bet = getPlayerBet(scanner, wallet);
		int[] playersCards = new int[25];
		int[] dealersCards = new int[25];
		int numPlayerCards = 0;
		int numDealerCards = 0;
		int numPlayerAces = 0;
		int numDealerAces = 0;
		int playerTotal = 0;
		int dealerTotal = 0;
		
		// dealt two cards to player
		dealCard(playersCards, numPlayerCards);
		numPlayerCards++;
		if (isLastCardisAce(cards[playersCards[numPlayerCards - 1]]))
			numPlayerAces++;
		playerTotal += values[playersCards[numPlayerCards - 1]];

		dealCard(playersCards, numPlayerCards);
		numPlayerCards++;
		if (isLastCardisAce(cards[playersCards[numPlayerCards - 1]]))
			numPlayerAces++;
		playerTotal += values[playersCards[numPlayerCards - 1]];
		// total values of the points

		dealCard(dealersCards, numDealerCards);
		numDealerCards++;
		if (isLastCardisAce(cards[dealersCards[numDealerCards - 1]]))
			numDealerAces++;
		dealerTotal += values[dealersCards[numDealerCards - 1]];

		// displayed the first cards for dealer and player

		System.out.println("Player: " + displayHand(playersCards, numPlayerCards));
		System.out.println("Dealer: " + "XX " + displayHand(dealersCards, numDealerCards));

		// asks to hit stay or double down
		boolean stillPlaying = true;
		boolean firstHand = true;
		while (stillPlaying) {
			int choice = getChoice(scanner, wallet, bet, firstHand);
			// player selects to hit
			firstHand = false;
			

			if (choice == 1) {
				dealCard(playersCards, numPlayerCards);
				numPlayerCards++;
				if (isLastCardisAce(cards[playersCards[numPlayerCards - 1]]))
					numPlayerAces++;
				playerTotal += values[playersCards[numPlayerCards - 1]];
				
				//dealt another card for dealer
				
				if(calculateScore(dealerTotal, numDealerAces) <= 18 );
				dealCard(dealersCards, numDealerCards);
				numDealerCards++;
				if (isLastCardisAce(cards[dealersCards[numDealerCards - 1]]))
					numDealerAces++;
				dealerTotal += values[dealersCards[numDealerCards - 1]];


				System.out.println("Player: " + displayHand(playersCards, numPlayerCards));
				if (calculateScore(playerTotal, numPlayerAces) >= 21) {
					System.out.println("You Bust!");
					stillPlaying = false;
					wallet -= bet;
												
				}
				if (calculateScore(dealerTotal, numDealerAces) >= 21) {
					System.out.println("Dealer Bust!");
					stillPlaying = false;
					wallet += bet;
				}

			} else if (choice == 2) {
				//dealt the second card for dealer
				stillPlaying = false;
				dealCard(dealersCards, numDealerCards);
				numDealerCards++;
				if (isLastCardisAce(cards[dealersCards[numDealerCards - 1]]))
					numPlayerAces++;
				dealerTotal += values[dealersCards[numDealerCards - 1]];
				
				

				System.out.println("Player: " + displayHand(playersCards, numPlayerCards) + " ... " + calculateScore(playerTotal, numPlayerAces));
				System.out.println("Dealer: " + displayHand(dealersCards, numDealerCards) + " ... " + calculateScore(dealerTotal, numDealerAces));
				if (calculateScore(playerTotal, numPlayerAces) > calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("You Win!");
					wallet += bet;
				}
				if (calculateScore(playerTotal, numPlayerAces) == calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("Points Tied, Dealer Wins!");
					wallet -= bet;
				}
				if (calculateScore(playerTotal, numPlayerAces) < calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("You Lose!");
					wallet -= bet;
				}
				if (calculateScore(playerTotal, numPlayerAces) > 21) {
					System.out.println("You Bust!");
					stillPlaying = false;
					wallet -= bet;
				}

			} else {
				stillPlaying = false;
				
				//dealt final card to player
				dealCard(playersCards, numPlayerCards);
				numPlayerCards++;
				if (isLastCardisAce(cards[playersCards[numPlayerCards - 1]]))
					numPlayerAces++;
				playerTotal += values[playersCards[numPlayerCards - 1]];

				//dealt the second card for dealer
				dealCard(dealersCards, numDealerCards);
				numDealerCards++;
				if (isLastCardisAce(cards[dealersCards[numDealerCards - 1]]))
					numPlayerAces++;
				dealerTotal += values[dealersCards[numDealerCards - 1]];
				
				//dealt another card for dealer
				
				if(calculateScore(dealerTotal, numDealerAces) <= 17 )
					dealCard(dealersCards, numDealerCards);
				numDealerCards++;
				if (isLastCardisAce(cards[dealersCards[numDealerCards - 1]]))
					numDealerAces++;
				dealerTotal += values[dealersCards[numDealerCards - 1]];
				

				//displayed final cards and points for both dealer and player
				System.out.println("Player: " + displayHand(playersCards, numPlayerCards) + " ... " + calculateScore(playerTotal, numPlayerAces));
				System.out.println("Dealer: " + displayHand(dealersCards, numDealerCards) + " ... " + calculateScore(dealerTotal, numDealerAces));
				if (calculateScore(playerTotal, numPlayerAces) >= 21) {
					System.out.println("You Bust!");
					stillPlaying = false;
					wallet -= bet;
					
					
					
					// game outcomes
				} else if (calculateScore(playerTotal, numPlayerAces) > calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("You Win!");
					wallet += bet * 2;
				} else if (calculateScore(playerTotal, numPlayerAces) == calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("Points Tied, Dealer Wins!");
					wallet -= bet * 2;
				} else if (calculateScore(playerTotal, numPlayerAces) < calculateScore(dealerTotal, numDealerAces)) {
					System.out.println("You Lose!");
					wallet -= bet * 2;
				}
				if (calculateScore(dealerTotal, numDealerAces) >= 21) {
					System.out.println("Dealer Bust!");
					stillPlaying = false;
					wallet += bet;
				}
			}
		}

		return wallet;

	}

	private static int getChoice(Scanner scanner, int wallet, int bet, boolean firstHand) {

		while (true) {
			if ((bet * 2 > wallet) || !firstHand)
				System.out.println("Would you like to: \n 1. Hit \n 2. Stay");

			if ((bet * 2 < wallet) && firstHand)
				System.out.println("Would you like to: \n 1. Hit \n 2. Stay \n 3. Double Down");
			String input = scanner.nextLine();

			try {
				int value = Integer.parseInt(input);
				if (value >= 1 && (firstHand && value <= 3) || (!firstHand && value <= 2))
					return value;
			} catch (Exception ex) {
				System.out.println(input + " is not a number on earth in any language.");

			}

		}
	}

	private static String displayHand(int[] hand, int numCards) {
		String temp = "";

		for (int i = 0; i < numCards; ++i) {
			temp += cards[hand[i]] + " ";
		}

		return temp;
	}

	private static boolean isLastCardisAce(String lastCard) {
		return lastCard.startsWith("A");
	}

	private static void dealCard(int[] cards, int numCards) {
		cards[numCards] = (int) (Math.random() * 51);
	}

	private void display(NumberFormat formatter, int money) {
		System.out.print(formatter.format(money));
	}

	private static int getPlayerBet(Scanner scanner, int wallet) {
		boolean validBet = false;
		boolean validInput = false;
		String bet = "";

		while (!validBet) {
			while (!validInput) {
				System.out.println("How much would you like to bet? You Have Currently: " + wallet + " in your bank.");
				bet = scanner.nextLine();

				try {
					int number = Integer.parseInt(bet);
					validInput = true;
				} catch (NumberFormatException ex) {
					System.out.println(bet + " is not a number on earth in any language.");
				}
			}

			if (Integer.parseInt(bet) < 0) {
				System.out.println("Not a valid bet try again: ");
				validInput = false;
			} else if (Integer.parseInt(bet) > wallet) {
				validInput = false;
				System.out.println("You're too poor, either get more money or try again: ");
			} else {
				validBet = true;
			}
		}

		return Integer.parseInt(bet);
	}

	private static String getUserName(Scanner scanner) {
		boolean validName = false;
		String name = "";
		while (!validName) {
			System.out.print("Please enter your first and last name: ");
			name = scanner.nextLine();

			if (!name.trim().equals(""))
				validName = true;
		}
		return name;
	}

	private static void introduction() {
		System.out.println("Welcome to BlackJack!");

	}

	public static int calculateScore(int playersPoints, int numAces) {
		int score = playersPoints;
		for (int i = 0; i < numAces; ++i) {
			if (score + 10 <= 21)
				score += 10;
		}
		return score;
	}
}
