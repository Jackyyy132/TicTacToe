import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class TicTacToeGame {
	
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		char[][] TTTBoard = {{' ' , '|' , ' ' , '|' , ' '},
	 			 			 {'-' , '+' , '-' , '+' , '-'},
	 			 			 {' ' , '|' , ' ' , '|' , ' '},
	 			 			 {'-' , '+' , '-' , '+' , '-'},
	 			 			 {' ' , '|' , ' ' , '|' , ' '}};
		char userSymbol = 'X';
		String userMenuChoice;
		do {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Hello, Welcome to Jacky's TicTacToe.");
			System.out.println("P. Play TicTacToe (EASY MODE)");
			//System.out.println("H. Play TicTacToe (HARD MODE)");
			System.out.println("B. View Board");
			System.out.println("I. See Instructions");
			System.out.println("S. Change Symbol");
			System.out.println("E. Exit Game");
			System.out.println("----------------------------------------------------------------------");
			userMenuChoice = input.next().toUpperCase();
			
			if (userMenuChoice.equals("B")) {
				viewBoard(TTTBoard);
			}
			
			else if (userMenuChoice.equals("I")) {
				seeInstructions();
			}
			else if (userMenuChoice.equals("S")) {
				userSymbol = changeSymbol(userSymbol);
			}
			else if (userMenuChoice.equals("P")) {
				playTicTacToeEasy(TTTBoard, userSymbol);
			}
			
			
			}while(!userMenuChoice.equals("E"));
		
	}

	public static void viewBoard(char[][] TTTBoard) {	
		
		System.out.println("Here is a view of the board.");
		System.out.println("");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(TTTBoard[i][j]);

			}
			System.out.println();
		}
		
		System.out.println("");
	}
	
	public static void seeInstructions() {
		System.out.println("Here is a view of the instructions.");
		
		System.out.println("The game board will be played on a 3x3 grid.");
		System.out.println("Strategically mark your move on the board by choosing a number from 1-9.");
		System.out.println("Here is a view of where the numbers 1-9 will mark the board.");
		System.out.println("");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("");
		System.out.println("If you choose, for example, the number '6', the board will be marked like this.");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | X ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
		System.out.println("");
		System.out.println("You will take turns marking the board vs a friend or computer and the first to");
		System.out.println("get 3 of their marks in a row (up, down, across, or diagonally) is declared the winner.");
		System.out.println("When the board is full of marks, the game is over. If no player has 3 marks in a row, the game ends in a tie.");
		System.out.println("Now that you know the rules, give the game a go!");
		System.out.println("");
	}
	
	public static char changeSymbol(char userSymbol) {
		System.out.println("Here you can change your symbol.");
		System.out.println("");	
		System.out.println("Current symbol is: '" + userSymbol + "'");
		System.out.println("Please type a character to change this symbol:");
		userSymbol = input.next().charAt(0);
		
		System.out.println("Thank you. Your symbol has been changed to '" + userSymbol + "'");
		return userSymbol;
	}
	
	public static void playTicTacToeEasy(char[][] TTTBoard, char userSymbol) {		
		ArrayList<Integer> markedBoard = new ArrayList<Integer>();
		//int randomComputerPosition = random.nextInt(9)+1;
		System.out.println("You have chosen to play TicTacToe vs Computer (EASY MODE)");
		getUserPosition(TTTBoard, userSymbol);
	}
	
	public static void getUserPosition(char[][] TTTBoard,  char userSymbol) {
		System.out.println("Please choose your position on the board from 1-9");
		viewBoard(TTTBoard);
		int userPosition = input.nextInt();
		switch(userPosition) {
			case 1:
				TTTBoard[0][0] = userSymbol;
				break;
			case 2:
				TTTBoard[0][2] = userSymbol;
				break;
			case 3:
				TTTBoard[0][4] = userSymbol;
				break;
			case 4:
				TTTBoard[2][0] = userSymbol;
				break;
			case 5:
				TTTBoard[2][2] = userSymbol;
				break;
			case 6:
				TTTBoard[2][4] = userSymbol;
				break;
			case 7:
				TTTBoard[4][0] = userSymbol;
				break;
			case 8:
				TTTBoard[4][2] = userSymbol;
				break;
			case 9:
				TTTBoard[4][4] = userSymbol;
				break;	
			default:
				break;	
		}
		viewBoard(TTTBoard);
	}
	
}
