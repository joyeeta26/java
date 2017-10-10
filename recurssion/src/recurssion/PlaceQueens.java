package recurssion;

import java.util.Scanner;

public class PlaceQueens {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// int n = scn.nextInt();
		Boolean board[][] = new Boolean[4][4];

		placequeens(board, 0, "");

	}

	public static void placequeens(Boolean board[][], int row, String path) {
		if (row == board.length) {
			System.out.println(path);

			return;
		}

		for (int col = 0; col < board.length; col++) {
			{  
				if (issafetoplacequeen(board, row, col)) {
					board[row][col] = true;
                               
					placequeens(board, row + 1, path + col + " " + row);
					board[row][col] = false;

				}
			}

		}
	}

	public static boolean issafetoplacequeen(Boolean board[][], int row, int col) {
		for (int r=row-1; r>=0; r--) {
			if (board[r][col] == true)
				return false;
		}
		for (int r=row-1, c=col-1; r>=0 && c<= board.length ; r--,c++) {
			if (board[r][c] == true)

				return false;
		}
		for (int r=row-1, c=col-1; r>=0 && c>=0 ; r--,c--) {
			if (board[r][c] == true)
				return false;
		}

		return true;
	}

}